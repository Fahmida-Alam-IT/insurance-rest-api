# Insurance Policy Processing API ( Java +Spring Boot)

Author

Fahmida Alam
Senior Software Developer, experienced in Java (Back end) + Spring boot + REST Api + Hibernate Development.
Toronto, Ontario, Canada


A fully functional backend API built with **Spring Boot, Java, Hibernate, JPA, and Swagger**.
  
This project demonstrates my skills as a backend Java developer, including CRUD operations,
layered architecture, exception handling, and API documentation.



## How to Run with Docker (Recommended)

### Prerequisites
- Docker installed

### Prerequisites
- Docker installed

### Run
```bash
docker pull <your-dockerhub-username>/insurance-rest-api
docker run -p 8080:8080 insurance-rest-api

  
- **Policy Management** (CRUD)  
- **Claim Submission & Status Tracking**  
- **REST API** with layered architecture    
- **Global Exception Handling**  
- **Logging (SLF4J)**  
- **Swagger / OpenAPI documentation**  
- **JWT Authentication**


- RESTful API (Spring Boot)
- CRUD operations for Customer & Policy modules
- Spring Data JPA + MySQL
- Layered Architecture (Controller → Service → Repository)
- DTOs for clean API responses
- Global Exception Handling
- Sample Test Cases (MockMvc + Mockito)

---

# 🏦 Insurance Policy Processing API

A **Java Spring Boot REST API** for managing insurance customers, policies, and claims.  
Includes **CRUD operations**, **MySQL integration**, **Swagger documentation**, and a clean layered architecture.


## Project Structure

```text
src
|   main
|   |   java
|   |   |   com
|   |   |   insurance
|   |   |    |   App.java
|   |   |    |   HelloResource.java
|   |   |           |   
|   |   |           config
|   |   |           |       ApplicationConfig.java
|   |   |           |       SwaggerConfig.java
|   |   |           |       
|   |   |           controller
|   |   |           |       CustomerController.java
|   |   |           |       
|   |   |           dto
|   |   |           |       CustomerDTO.java
|   |   |           |       
|   |   |           model
|   |   |           |       Customer.java
|   |   |           |       
|   |   |           repository
|   |   |           |       CustomerRepository.java
|   |   |           |       
|   |   |           service
|   |   |                   CustomerService.java
|   |   |                   CustomerServiceImpl.java
|   |   |                   
|   |   resources
|   |   |       application.properties
|   |   |       
|   |   
|   |               
|   test
|       java
|       |   com
|       |       insurance
|       |           |   AppTest.java
|       |           |   
|       |           controller
|       |           |       CustomerControllerTest.java
|       |           |       
|       |           service
|       |                   CustomerServiceImplTest.java
|       |                   
|       resources
|               pom.xml
|		README.md


```text

# Insurance REST API

## Overview
Spring Boot REST API for managing insurance policies and customers.
Includes Swagger documentation, Docker support, and CI/CD via GitHub Actions.

## Project Assumptions

- This project is a **demo/portfolio application**.
- Authentication and authorization are **out of scope**.
- Data persistence uses **H2 in-memory database** by default.
- The application runs on **port 8080**.
- Java **17** is required.
- Docker is used for containerization.
- CI/CD is implemented using **GitHub Actions**.
- Swagger/OpenAPI is enabled for API documentation.

## Technology Stack
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Swagger (OpenAPI)
- Docker
- GitHub Actions (CI/CD)

insurance-rest-api/
├── src/
├── target/
│   └── insurance-rest-api-0.0.1-SNAPSHOT.jar
├── Dockerfile
├── pom.xml
└── .github/
    └── workflows/
        └── ci-cd.yml


## How to Run
...


## 🛠 Tech Stack

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.1-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-orange)
![Swagger](https://img.shields.io/badge/Swagger-UI-yellow)
![Maven](https://img.shields.io/badge/Maven-3.9.1-blue)

---


## 🛠️ Technologies Used

- **Java 17 or Java 21 (LTS)**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Swagger (OpenAPI 3)**
- **Lombok**
- **JUnit5 & Mockito (basic tests)**

---

## 🗄️ Database Configuration (MySQL)

In `application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/insurance
    username: root
    password: root

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true

server:
  port: 8080
  
  API Documentation (Swagger)

Once the application is running, open:

http://localhost:8080/swagger-ui/index.html

mvn spring-boot:run

java -jar target/insurance-api.jar


Unit Tests (Sample)

src/test/java/com/insurance/controller/CustomerControllerTest.java

@Test
public void testGetAllCustomers() throws Exception {
    mockMvc.perform(get("/api/customers"))
            .andExpect(status().isOk());
}


Endpoints (Examples)
GET all customers
GET /api/customers

GET customer by ID
GET /api/customers/{id}

POST create customer
POST /api/customers

DELETE customer
DELETE /api/customers/{id}





