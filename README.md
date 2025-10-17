# OrderManagment
A RESTful backend application for managing orders and products, implementing CRUD operations, DTO-based data handling, and centralized exception management using Spring Boot and JPA.

## Features
- RESTful API for managing items
- CRUD operations implemented using Spring Boot
- Layered architecture (Controller, Service, DAO)
- DTO-based data transfer for request and response handling
- Database integration with Spring Data JPA
- Built using Maven for easy dependency management

## Tech Stack
- **Language:** Java
- **Framework:** Spring Boot, Spring Web, Spring Data JPA
- **Database:** MySQL
- **Build Tool:** Maven
- **IDE:** Eclipse / STS WorkSpace
- **Version Control:** Git, GitHub
- **Testing:** JUnit 5, Mockito

## Project Structure

```
OrderManagement/
 ├── src/
 │   └── main/bbbb
 │       ├── java/com/enterprise/
 │       │   ├── controller/          # REST controllers (OrderController, ProductController)
 │       │   ├── service/             # Business logic layer
 │       │   ├── dao/                 # JPA Repositories (Data Access)
 │       │   ├── dto/                 # Request/Response DTO classes
 │       │   ├── exceptions/          # Custom exception handlers
 │       │   ├── model/               # Entity classes (Order, Product)
 │       │   └── OrderManagementApplication.java  # Entry point
 │       └── resources/
 │           ├── application.properties           # DB and Spring config
 │           └── static/templates (optional for UI)
 ├── pom.xml                                     # Maven dependencies
 └── README.md                                   # Project documentation
```

## How It Works

1. **Controllers** handle incoming HTTP requests and responses.  
2. **Services** contain core business logic for order and product management.  
3. **DAO layer** uses Spring Data JPA to interact with the database.  
4. **DTOs** simplify data transfer between frontend and backend.  
5. **Exception handlers** manage validation and runtime errors gracefully.  
