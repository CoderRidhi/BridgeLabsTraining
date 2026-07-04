# Sales Management System (Review 7)

## Project Overview

This is a Java-based Sales Management System developed using JDBC and MySQL. The application demonstrates how Java applications connect to a relational database using JDBC to perform CRUD (Create, Read, Update, Delete) operations.

The project manages suppliers, products, and sales records while following a modular structure.

---

## Tech Stack

- Java
- JDBC
- MySQL
- Maven
- VS Code

---

## Features

- Add Supplier
- Sell Product
- Store data in MySQL
- Retrieve data from database
- JDBC connectivity using `PreparedStatement`

---
# Project Workflow

![Project Workflow](workflow.jpeg)
## Project Structure

```
demo
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.ridhi.demo
│   │           ├── Main.java
│   │           ├── DBConnection.java
│   │           ├── SupplierOperations.java
│   │           ├── SalesOperations.java
│   │           
│   │
│   └── resources
│
├── database
│   ├── schema.sql
│   ├── data.sql
│   └── queries.sql
│
├── pom.xml
└── README.md
```

---

## Project Workflow

```
Run Application
        │
        ▼
     Main.java
        │
        ▼
 User selects operation
        │
        ├───────────────┐
        ▼               ▼
SupplierOperations   SalesOperations
        │               │
        └──────┬────────┘
               ▼
      DBConnection.java
               │
               ▼
         JDBC Driver
               │
               ▼
        MySQL Database
               │
               ▼
      Result returned to Java
```

---

## Database Workflow

```
Java Program
      │
      ▼
DBConnection.getConnection()
      │
      ▼
DriverManager
      │
      ▼
MySQL Server
      │
      ▼
Execute SQL Query
      │
      ▼
Return Result
```

---

## Database Tables

- Supplier
- Product
- Sales

---

## How to Run

1. Clone the repository.
2. Open the project in VS Code.
3. Create the database using `schema.sql`.
4. Insert sample data using `data.sql`.
5. Update database credentials in `DBConnection.java`.
6. Run `Main.java`.

---

## Sample SQL Operations

- CREATE TABLE
- INSERT
- SELECT
- UPDATE
- DELETE

---

## Concepts Used

- JDBC
- MySQL
- PreparedStatement
- Connection
- ResultSet
- Exception Handling
- CRUD Operations
- Object-Oriented Programming

---

