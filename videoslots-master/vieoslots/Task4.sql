1. SELECT users.id, users.name, users.surname FROM users WHERE country='MT';
2. SELECT users.id, users.name, users.surname FROM users WHERE country !='PT' AND country !='FR';
3. SELECT users.id, users.name, users.surname FROM users INNER JOIN user_creds ON users.id = user_creds.id;
4. SELECT users.name, users.surname , users.email FROM users INNER JOIN user_creds ON  users.id = user_creds.id WHERE user_creds.required_reset_password = 1;