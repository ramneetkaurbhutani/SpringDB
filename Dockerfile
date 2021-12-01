From openjdk:8
Expose 8094
Add target/SpringDB-Version1.war SpringDB-Version1.war
ENTRYPOINT ["java","-jar","/SpringDB-Version1.war"]