# SpringCustomRepository
Manage student data, including adding student details and retrieving gender counts by college and department. This Spring Boot application also includes an AspectJ aspect for logging method executions.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Configuration](#configuration)
- [Endpoints](#endpoints)
- [AspectJ Logging](#aspectj-logging)
- [Frontend](#frontend)

## Getting Started

These instructions will help you get the project up and running on your local machine.

### Prerequisites

Before you begin, make sure you have the following:

- Java 8 or higher installed
- Maven build tool
- MySQL database server (configured in `application.properties`)
- Web browser to access the frontend

### Installation

Follow these steps to set up and run the application:

1. Clone the repository:
  [ git clone https://github.com/yourusername/spring-boot-student-management.git](https://github.com/kulanthaivelan/SpringCustomRepository.git)
  

2. Navigate to the project directory:

   cd demo2
   
4. Build the application:
   mvn clean install


5. Run the application:

  mvn spring-boot:run

5. Access the application in your web browser at `http://localhost:8080`.

### Configuration

You can configure the application by modifying the `application.properties` file to change database settings or other configurations.

## Endpoints

- **Add Student Details:** `/students/add` (POST) - Add student details.
- **Get Student Details:** `/students/details` (GET) - Retrieve student details based on day, month, and year.
- **Get Gender Counts:** `/students/genderCount` (GET) - Retrieve gender counts by college and department.

## AspectJ Logging

The application includes an AspectJ aspect for logging method executions in the `com.kgisl.demo2.StudentAspectJ` class. It logs method calls before and after execution, helping with debugging and monitoring.

## Frontend

The frontend of the application is built using HTML and JavaScript. It displays gender counts by college and department in a table format. You can access this frontend by opening the root URL of the application in a web browser (`http://localhost:8080` by default).
