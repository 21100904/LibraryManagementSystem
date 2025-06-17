# 📚 Library Management System

A Java-based Library Management System that allows users to manage books, borrowers, and transactions efficiently. The system uses **MySQL** as the backend database and **Java Swing** for the graphical user interface.

---

## ✅ Features

- Add, update, delete books
- Register and manage borrowers
- Issue and return books
- Track overdue returns
- Search functionality
- Graphical user interface built with Java Swing

---

## 🛠️ Technologies Used

- **Java** (Core Java, JDBC)
- **MySQL** (Database)
- **Java Swing** (GUI)
- **NetBeans / IntelliJ / Eclipse** (IDE - depending on what you used)

---

## 🗃️ Database Setup

1. Open **MySQL Workbench** or your MySQL command-line interface.
2. Run the SQL script (e.g., `library.sql` if included) to create the necessary database and tables.
3. Make sure your Java project is configured with the correct database connection string.

Example MySQL connection in Java:
```java
String url = "jdbc:mysql://localhost:3306/library_db";
String username = "root";
String password = "yourpassword";

