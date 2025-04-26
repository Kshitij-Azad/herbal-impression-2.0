# Keycloak 15.0.0 Setup

### Step 1: Create a New Realm
1. Go to the Keycloak home page.
2. Click on "Add Realm."
3. Enter the name `herbal-impression-app` for the realm.
4. Enable the realm and click "Create."

### Step 2: Create a New Client
1. Click on "Clients" and then "Create."
2. Set the Client ID to `herbal-impression-client`.
3. Choose the Client Protocol as `openid-connect`.
4. Set the Root URL to `http://localhost:8080/*`.
5. Save the changes.
6. Change the Access Type to `confidential` and save again.
7. Go to the "Credentials" tab and note the **Client Secret**.

### Step 3: Add Roles
1. Click on "Roles."
2. Add different roles (e.g., `ROLE_admin`, etc.).

### Step 4: Add a User
1. Click on "Users" and then "Add User."
2. Enter a username and assign roles to the user.
3. Add credentials for the user.
