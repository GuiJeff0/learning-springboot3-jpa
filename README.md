# Web Services Project with Spring Boot and JPA/Hibernate


## Objectives

This project aims to build a web service using Spring Boot and JPA/Hibernate, covering everything from project creation to the complete implementation of CRUD operations and exception handling.
Apart from the project entities.

## Implemented Features

### Create Spring Boot Java Project

• Initial setup of the Spring Boot project with all necessary dependencies for implementing a web service.

### Implement Domain Model

• Definition of JPA entities representing the application's data model.

• Configuration of entity relationships such as OneToMany, ManyToOne, ManyToMany, etc.

### Structure Logical Layers: Resource, Service, Repository, Model

• **Resource:** REST controllers responsible for handling HTTP requests and returning appropriate responses.

• **Service:** Business logic layer of the application.

• **Repository:** Interfaces extending JpaRepository for data manipulation in the database.

• **Model:** Contains the model/entity classes.

### Configure Test Database (H2)

• Configuration of the H2 database for testing, allowing in-memory data persistence.

• Configuration of application.properties for using H2 during development and testing.

### CRUD - Create, Retrieve, Update, Delete

• Complete implementation of CRUD operations for system entities.

• **Create:** Creation of new records.

• **Retrieve:** Retrieval of existing records.

• **Update:** Update of existing records.

• **Delete:** Deletion of existing records.
    
### Exception Handling

• Implementation of an exception handling layer to capture and respond appropriately to business and system errors.

• Use of @ControllerAdvice and @ExceptionHandler for customized error responses.

## Technologies Used

   • **Spring Boot**
   • **Spring Data JPA**
   • **Hibernate**
   • **H2 Database**
   • **Maven**
