# employee-leave-management-system
Spring Boot backend project for employee leave management with REST APIs, MySQL integration, validation, exception handling, and layered architecture.

# Employee Leave Management System

A backend REST API application developed using Java, Spring Boot, and MySQL for managing employees and leave requests. This project demonstrates CRUD operations, validation, exception handling, layered architecture, and database integration.

---

## Features

- Add Employee
- View All Employees
- Apply Leave Request
- View Leave Requests
- Approve Leave Requests
- Validation Handling
- Global Exception Handling
- MySQL Database Integration
- RESTful APIs

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman
- Git & GitHub

---

## Project Architecture

Controller → Service → Repository → Database

---

## API Endpoints

### Employee APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/employees | Add Employee |
| GET | /api/employees | Get All Employees |

---

### Leave APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/leaves | Apply Leave |
| GET | /api/leaves | Get All Leave Requests |
| PUT | /api/leaves/{id}?status=Approved | Approve Leave Request |

---

## Tools Used

- IntelliJ IDEA
- MySQL Workbench
- Postman

---

## API Screenshots

### Create Employee API

![Create Employee](screenshots/Create Employee API.png)

---

### Get Employees API

![Get Employees](screenshots/Get Employees API.png)

---

### Apply Leave API

![Apply Leave API](screenshots/Apply Leave API.png)

---

### Approve Leave API

![Approve Leave API](screenshots/Approve Leave API.png)

---

### Validation Test API

![Validation Test API](screenshots/Validation Test API.png)

---

### Employee Records MySQL

![Employee Records](screenshots/employee records in mysql.png)

---

### Leave Requests MySQL

![Leave Requests](screenshots/show all leaves request mysql.png)

---

### Employee Leave Relationship Query

![Relationship Query](screenshots/Employee + Leave Relationship Query mysql.png)

---

## Author

Omkar Sutar
