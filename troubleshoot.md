# Troubleshooting / FAQ

This file contains common issues and their solutions related to this project.

---
### ❓ Q1: When tried to run Keycloak 15.0.0 using Docker, the admin console didn’t show up. It showed the message: 'You need local access to create the initial admin user.'

**✅ Solution:**
   1 Run the Keycloak Docker container using this command: 
     docker run -p 8080:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin kshitijazad/keycloak:15.0.0
    
   2 Get the container ID using either:
     docker ps command OR From Docker Desktop UI
    
   3 Access the container by running:
     docker exec -it <CONTAINER_ID> bash
     Replace <CONTAINER_ID> with the actual ID you got (example: e4c07eaa5bce).

    4 Add the admin user manually inside the container by running this command:
     /opt/keycloak-15.0.0/bin/add-user-keycloak.sh -u admin -p admin
   
---

### ❓ Q2: Working with Java 21 and Keycloak 12.0.0, but the application isn't starting. It’s showing an error saying "Incompatible Java Version" and "Unable to start the application due to bean version mismatch.

**✅ Solution:**
Needed to work with Java 21, Upgrade Keycloak to a higher version. Moved to Keycloak 15.0.0, and this resolved the issue.

---

### ❓ Q3: Wanted to create a custom type for the Keycloak token response, and did it, but after creating it, it became a string type.

**✅ Solution:**
Created own response type and returned it in this type.

---

### ❓ Q4: I created an entity class for the order, and in the @Table annotation, I specified name = "order". However, I am getting an error when executing the DDL "create table order".

**✅ Solution:**
The error occurred because the table name order is a reserved keyword in SQL. Using reserved keywords as table names without escaping them causes a syntax error.

---