package com.example.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Employee;
import com.example.service.EmpDAO;

@Controller
public class EmpController {

	@Autowired
	EmpDAO dao;

	@RequestMapping("/")
	public ModelAndView home(HttpServletRequest req, HttpServletResponse res) {
		List<Employee> employees = dao.getAll();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("employees", employees);
		return mv;
	}

	@RequestMapping("/new")
	public String newEmployee(Map<String, Object> model, HttpServletRequest req, HttpServletResponse res) {
		Employee employee = new Employee();
		model.put("employee", employee);
		return "new_employee";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee employee, HttpServletRequest req,
			HttpServletResponse res) {
		dao.insert(employee);
		return "redirect:/";
	}

	@RequestMapping("/edit")
	public ModelAndView editEmployee(@RequestParam("empId") int empId, HttpServletRequest req,
			HttpServletResponse res) {
		ModelAndView mv = new ModelAndView("edit_employee");
		Employee e = dao.get(empId);
		mv.addObject("employee", e);
		return mv;
	}

	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam("empId") int empId, HttpServletRequest req, HttpServletResponse res) {
		dao.delete(empId);
		return "redirect:/";
	}

	@RequestMapping("/search")
	public ModelAndView search(@RequestParam("keyword") String keyword, HttpServletRequest req,
			HttpServletResponse res) {
		List<Employee> result = dao.search(keyword);
		ModelAndView mv = new ModelAndView("search");
		mv.addObject("result", result);

		return mv;
	}

}
