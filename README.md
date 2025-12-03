📦 Java Inventory API

A RESTful Inventory Management System built with Java, Spring Boot, and SQL.
This project demonstrates backend engineering skills, database design, API development, and real-world CRUD functionality for inventory operations.

📝 Overview

The Java Inventory API is a backend application that allows users to manage inventory items, track stock levels, create orders, and receive low-stock alerts.
It is designed using scalable architecture principles and clean code practices.

This project is based on real experience managing inventory operations and expands it into a professional software system.

Features

🔐 User Authentication (optional) — admin vs standard users
📦 CRUD inventory management (create, read, update, delete)
⚠️ Automatic low-stock alerts
🧾 Order creation & tracking
🗂️ SQL database integration with MySQL/PostgreSQL
🌐 REST API endpoints following standard conventions
🧹 Input validation & error handling
🛠️ Clean service, repository, and controller layers
📊 Optional: Inventory reporting endpoints

Tech Stack
Java 17+
Spring Boot
Spring Web / Spring MVC
Spring Data JPA or JDBC
MySQL or PostgreSQL
Maven
Postman / Insomnia for API testing

Project Structure
src/
 └── main/
      ├── java/com/yourname/inventory
      │     ├── controller
      │     ├── service
      │     ├── repository
      │     ├── model
      │     └── InventoryApiApplication.java
      └── resources/
            ├── application.properties
            └── schema.sql

Setup Instructions
1️⃣ Clone the Repository
git clone https://github.com/Jalbizur/Java-Inventory-API.git
cd Java-Inventory-API
2️⃣ Configure MySQL

Create a database:

CREATE DATABASE inventorydb;

Update your credentials inside application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/inventorydb
spring.datasource.username=Root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
3️⃣ Run the Application
mvn spring-boot:run

Server starts at:

http://localhost:8080  

API Endpoints
➤ GET All Products
GET /api/products
➤ GET Product by ID
GET /api/products/{id}
➤ POST Create Product
POST /api/products
Content-Type: application/json

Example body:

{
  "name": "Laptop",
  "price": 999.99,
  "quantity": 5
}
➤ DELETE Product
DELETE /api/products/{id}

Author

Jayson Albizures
Java & Backend Developer
GitHub: https://github.com/Jalbziur
