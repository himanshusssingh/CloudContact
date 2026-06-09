# ☁️ CloudContact

A modern cloud-based Contact Management System built using Spring Boot that enables users to securely manage contacts, store profile pictures in the cloud, send emails directly from the application, and organize personal contacts efficiently.

---

## 🚀 Features

### Authentication & Security

* User registration with email and password
* Email verification through verification link
* Google OAuth2 Login
* GitHub OAuth2 Login
* Secure authentication and authorization using Spring Security
* Protected routes and session management

### Contact Management

* Add contacts with profile pictures
* View all contacts
* View detailed contact information
* Update existing contacts
* Delete contacts
* Search contacts
* Pagination support for large datasets
* Mark contacts as favorites

### Cloud Storage

* Upload and store contact images on Cloudinary/AWS Cloud Storage
* Secure cloud-based file management

### Email Integration

* Send emails directly from the application
* Support for email attachments
* Java Mail Service integration

### User Profile

* View profile details
* Update profile information

### Additional Features

* Export contact data to Excel
* Generate PDF/Excel reports
* Dark Mode and Light Mode support
* Feedback submission system
* Responsive user interface

---

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring Framework
* Spring MVC
* Spring Data JPA (Hibernate ORM)
* Spring Security
* OAuth2 Authentication
* Bean Validation
* Java Mail Sender

### Frontend

* Thymeleaf
* HTML5
* CSS3
* JavaScript
* Tailwind CSS
* Flowbite UI Components

### Database

* MySQL
* PostgreSQL

### Cloud Services

* Cloudinary
* AWS Cloud Storage

### Tools & Libraries

* Git & GitHub
* PDF Generation Libraries
* Excel Processing Libraries

---

## 📸 Application Workflow

1. User registers using email/password or Google/GitHub.
2. Email verification is completed.
3. User logs into the dashboard.
4. Contacts can be added, updated, searched, and deleted.
5. Profile pictures are uploaded to cloud storage.
6. Users can send emails directly from the platform.
7. Contacts can be exported to Excel reports.
8. Favorite contacts can be managed easily.

---

## ⚙️ Installation

### Clone Repository

```bash
git clone https://github.com/himanshusssingh/CloudContact.git
cd CloudContact
```

### Configure Database

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cloudcontact
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Configure OAuth2

```properties
spring.security.oauth2.client.registration.google.client-id=YOUR_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_CLIENT_SECRET

spring.security.oauth2.client.registration.github.client-id=YOUR_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=YOUR_CLIENT_SECRET
```

### Configure Cloudinary

```properties
cloudinary.cloud-name=YOUR_CLOUD_NAME
cloudinary.api-key=YOUR_API_KEY
cloudinary.api-secret=YOUR_API_SECRET
```

### Run Application

```bash
mvn spring-boot:run
```

Application will be available at:

```text
http://localhost:8080
```

---

## 📂 Project Modules

```text
├── Authentication & Authorization
├── Contact Management
├── Cloud Image Upload
├── Email Service
├── Profile Management
├── Search & Pagination
├── Report Generation
├── Theme Management
└── Feedback System
```

---

## 🌟 Key Highlights

* Secure Authentication with Spring Security
* OAuth2 Social Login (Google & GitHub)
* Cloud-based Image Storage
* Email Integration with Attachments
* Excel Export Functionality
* Responsive UI with Tailwind CSS
* Dark/Light Theme Support
* Database Independent using Spring Data JPA
* Clean MVC Architecture

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome.

Feel free to fork this repository and submit a pull request.

---

## 👨‍💻 Developer

**[Himanshu Singh](https://himanshusssingh.github.io/)**

Aspiring Java Backend Developer | Full Stack Developer

If you like this project, consider giving it a ⭐ on GitHub.
