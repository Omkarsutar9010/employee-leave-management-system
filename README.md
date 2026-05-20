# Employee Leave Management System 

A Spring Boot backend project for managing employees and leave requests using REST APIs, MySQL, and layered architecture.

---

## Features

- Add Employee
- Get All Employees
- Apply Leave
- Approve Leave
- Validation Handling
- Global Exception Handling
- MySQL Database Integration
- REST API Development

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
|--------|-----------|-------------|
| POST | /api/employees | Add Employee |
| GET | /api/employees | Get All Employees |

---

### Leave APIs

| Method | Endpoint | Description |
|--------|-----------|-------------|
| POST | /api/leaves | Apply Leave |
| GET | /api/leaves | Get All Leave Requests |
| PUT | /api/leaves/{id}?status=Approved | Approve Leave |

---

## Validation Example

The project uses validation annotations like:

- @NotBlank
- @Email

Example validation response:

```json
{
  "email": "Invalid email format",
  "name": "Name is required"
}
````

---

## Database Tables

* employees
* leave_requests

---

# API Screenshots

## Create Employee API

![Create Employee](screenshots/Create-Employee-API.png)

---

## Get Employees API

![Get Employees](screenshots/Get-Employees-API.png)

---

## Apply Leave API

![Apply Leave API](screenshots/Apply-Leave-API.png)

---

## Approve Leave API

![Approve Leave API](screenshots/Approve-Leave-API.png)

---

## Validation Test API

![Validation Test API](screenshots/Validation-Test-API.png)

---

## Get All Leave Requests API

![Get All Leave Requests API](screenshots/get-all-leaves-request-api.png)

---

# MySQL Screenshots

## Employee Records

![Employee Records](screenshots/employee-records-in-mysql.png)

---

## Leave Requests Table

![Leave Requests](screenshots/show-all-leaves-request-mysql.png)

---

## Approved Leaves Query

![Approved Leaves](screenshots/Approve-leaves-in-mysql.png)

---

## Employee Leave Relationship Query

![Relationship Query](screenshots/Employee-Leave-Relationship-Query-mysql.png)

---

## Employee Count Query

![Employee Count](screenshots/count-employee-mysql.png)

---

# Author

## Omkar Sutar

* Java Developer
* Spring Boot Backend Developer
* Passionate About Backend Development

```
```
