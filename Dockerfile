FROM openjdk:8
EXPOSE 8081
ADD target/customer-data-service.jar customer-data-service.jar 
ENTRYPOINT ["java","-jar","/customer-data-service.jar"]
