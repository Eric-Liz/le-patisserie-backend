
# LePatisserie

**LePatisserie** is an e-commerce backend for a patisserie (bakery) that allows managing products. The project is built with **Spring Boot** and provides APIs to manage users, orders, and products.

---

## Features

- **Product Management**: Add, update, delete, and view bakery products.
- **User Management**: Create and manage users.
- **Order Management**: Place and track orders, update order statuses.
- **Database**: H2 in-memory database pre-populated with sample data for testing.
- **API Documentation**: Integrated with Swagger for easy API exploration.

---

## Prerequisites

Ensure you have the following installed:

- **Java 17 or higher**  
- **Maven 3.8+**  
- **Git**  
- An IDE (IntelliJ IDEA is recommended)

---

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-repository/LePatisserie.git
cd LePatisserie
```

### 2. Build the Project

Use Maven to build the project:

```bash
mvn clean install
```

### 3. Run the Application

Run the project with the following command:

```bash
mvn spring-boot:run
```

Alternatively, you can run the `LePatisserieBackendApplication` class directly from your IDE.

### 4. Access the Application

- **Swagger UI**: Open [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) in your browser to explore the APIs.
- **H2 Console**: Access the H2 database at [http://localhost:8080/h2-console](http://localhost:8080/h2-console).  
  - JDBC URL: `jdbc:h2:mem:testdb`  
  - Username: `sa`  
  - Password: `password`

---

## Sample Data

The application is pre-loaded with sample data for testing purposes. You can view the data directly using the H2 console.

---

## Technologies Used

- **Spring Boot** (REST, JPA, Validation)  
- **H2 Database** (In-memory database)  
- **Lombok** (Simplified model classes)  
- **Swagger/OpenAPI** (API documentation)  


A3 Project - Unisul Pedra Branca - Usability, Web, Mobile and Games Development
