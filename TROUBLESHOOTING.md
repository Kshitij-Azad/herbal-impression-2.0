# Troubleshooting / FAQ

This file contains common issues and their solutions related to this project.

---
### ❓ Q1: When I tried to run Keycloak 15.0.0 using Docker, the admin console didn’t show up. It showed the message: 'You need local access to create the initial admin user.'

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

### ❓ Q2: I was working with Java 21 and Keycloak 12.0.0, but the application isn't starting. It’s showing an error saying "Incompatible Java Version" and "Unable to start the application due to bean version mismatch.

**✅ Solution:**
I needed to work with Java 21, so I decided to upgrade Keycloak to a higher version. I moved to Keycloak 15.0.0, and this resolved the issue.
---