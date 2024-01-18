# springBootTest

- tutorial link : https://www.youtube.com/watch?v=Nv2DERaMx-4&t=5906s
- by visiting Spring Initializer on link: https://start.spring.io/ there is auto generate for Sprin boot project.
- Adding spring web & PostgreSQL Driver & Lombok & Spring Data JPA & Thymeleaf & Validation & Spring Boot DevTools Dependencies.
- Generate and Download the project.
- sudo apt install maven command to install maven dependency management in spring boot
- ./gradlew clean build command to build the project
- ./gradlew bootRun command to run spring boot project
- creating pom.xml file
- mvn clean install run the command to install maven
- using RestController inside NameController
- Display My name in the root path

- adding implementation inside build.gradle to render the html
  implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'

- adding dependency inside pom.xml to render the html
  <dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-thymeleaf</artifactId>
  </dependency>
