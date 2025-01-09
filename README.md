# Personal Expense Tracker Project

This application provides a comprehensive solution for managing personal finances by tracking expenses across various categories. In this project, we build REST APIs, handle exceptions, generate REST API documentation, and more.


## 🚀 **Project Overview**
The Expense Tracker Application is designed to help users efficiently manage their finances. Users can record expenses, categorize them, and view reports to better understand their spending habits.


## 🎯 **Project Objectives**
- Build and expose RESTful APIs for expense tracking.
- Implement exception handling for robust error management.
- Generate comprehensive REST API documentation using tools like Swagger.


## 🛠️ **Tech Stack**
- **Backend:** Spring Boot (Java)
- **Database:** MySQL
- **API Testing Tool:** Postman
- **API Documentation:** Swagger / OpenAPI
- **Security:** JWT Authentication


## 📋 **Features**
- Add, update, and delete expenses.
- Categorize expenses (e.g., food, travel, utilities).
- View detailed expense reports by date and category.
- Search expenses.


## 🧑‍💻 **Getting Started**
### Prerequisites
- Java Development Kit (JDK)
- Maven
- MySQL

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/expense-tracker.git
   ```
2. Navigate to the project directory:
   ```bash
   cd expense-tracker
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. Access the API documentation at:
   ```
   http://localhost:8080/swagger-ui.html
   ```


## 🧪 **API Endpoints**
| Method | Endpoint               | Description                 |
|--------|------------------------|-----------------------------|
| POST   | /api/categories        | Add a new category          |
| GET    | /api/categories        | Get all categories          |
| GET    | /api/categories/{id}   | Get a category by it's id   |
| PUT    | /api/categories/{id}   | Update an existing category |
| DELETE | /api/categories/{id}   | Delete a category           |
| POST   | /api/expenses          | Add a new expense           |
| GET    | /api/expenses          | Get all expenses            |
| GET    | /api/expenses/{id}     | Get an expense by it's id   |
| PUT    | /api/expenses/{id}     | Update an existing expense  |
| DELETE | /api/expenses/{id}     | Delete an expense           |


## 📂 **Project Structure**
```
expense-tracker-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       ├── controller/
│   │   │       ├── dto/
│   │   │       ├── entity/
│   │   │       ├── exceptions/
│   │   │       ├── mapper/
│   │   │       ├── repository/
│   │   │       └── service/
│   └── resources/
│       ├── application.properties
└── pom.xml
```


## 📝 **License**
This project is licensed under the MIT License. See the `LICENSE` file for more details.

---

💻 **Happy Coding!**

