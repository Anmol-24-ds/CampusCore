## CampusCore - Student Management System

A backend system to manage student records with full CRUD operations, 
built using Spring Boot and MySQL.

### Tech Stack
- Java 17, Spring Boot, Spring Data JPA, MySQL, Maven

### Features
- Add, update, delete, and search student records

### API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /students | Get all students |
| GET | /students/{id} | Get student by ID |
| POST | /students | Add new student |
| PUT | /students/{id} | Update student |
| DELETE | /students/{id} | Delete student |

### How to Run
1. Clone the repo
2. Configure `application.properties` with your MySQL credentials
3. Run `mvn spring-boot:run`
4. Test via Postman at `http://localhost:8080`

###I have uploaded The PNG files which are the screenshots of Showing how we deal with student Data using this project in Postman###
