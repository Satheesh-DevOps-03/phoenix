# 🔥 Phoenix Java Application

Phoenix is a simple Java application built using Maven, designed to demonstrate core DevOps practices like unit testing, Dockerization, and CI/CD pipeline integration. The application includes a basic `add()` function and runs continuously inside a container.

## 📁 Project Structure

phoenix/
├── pom.xml                     # Maven build config
├── Dockerfile                  # Container build file
└── src/
    ├── main/java/com/phoenix/  # Application source
    │   └── App.java
    └── test/java/com/phoenix/  # Unit tests
        └── AppTest.java

## ⚙️ Technologies Used

- Java 17
- Maven
- JUnit 5
- Docker
- Jenkins (Pipeline-ready)
- SonarQube (for static analysis)

## 🚀 Build & Run Instructions

🧪 Run Tests: mvn test  
🛠️ Build JAR: mvn clean package  
🐳 Build Docker Image: docker build -t phoenix-app .  
🚢 Run Container: docker run -d --name phoenix-container phoenix-app  

## 🔁 Jenkins Pipeline Stages

- Checkout from Git
- Run unit tests
- Build JAR with Maven
- Build Docker image
- Push image to DockerHub
- Optional: Run SonarQube analysis

## 📊 SonarQube Integration (Optional)

To enable SonarQube:
- Install SonarQube Scanner plugin in Jenkins
- Configure Sonar server & token
- Add `mvn sonar:sonar` stage in Jenkinsfile

## 📌 Notes

- App runs in a loop to simulate a service
- Extendable to REST APIs or Microservices

## 👤 Maintainer

Phoenix DevOps Team — [Your Name or Team Name]
