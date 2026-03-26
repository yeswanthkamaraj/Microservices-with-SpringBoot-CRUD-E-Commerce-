# 🚀 Microservices-Based E-Commerce Backend

A scalable and production-ready **Microservices Architecture** built using **Spring Boot**, featuring **Product Service**, **Order Service**, and an **API Gateway** with service discovery using Eureka.

---

## 📌 Overview

This project demonstrates how to design and implement a **distributed system** using modern backend practices.
Each service is independently deployable and communicates via REST APIs, with centralized routing handled by the API Gateway.

---

## 🏗️ Architecture

* **API Gateway** – Central entry point for all client requests
* **Product Service** – Manages product catalog
* **Order Service** – Handles order processing
* **Eureka Server** – Service discovery and registration

### 🔁 Flow

Client → API Gateway → Microservices (via Eureka Service Discovery)

---

## 🛠️ Tech Stack

* **Java 21+**
* **Spring Boot 3**
* **Spring Cloud Gateway**
* **Spring Cloud Netflix Eureka**
* **Spring Data JPA**
* **H2 / MySQL**
* **WebClient (Reactive Programming)**
* **Maven**

---

## ⚙️ Features

✔️ Microservices architecture
✔️ API Gateway routing
✔️ Service Discovery using Eureka
✔️ Inter-service communication
✔️ Scalable & loosely coupled design
✔️ RESTful APIs
✔️ Clean layered architecture

---

## 📂 Project Structure

```
microservices-project/
│
├── eureka-server/
├── api-gateway-service/
├── product-service/
└── order-service/
```

---

## 🔗 API Endpoints

### Product Service

* `GET /products` → Get all products
* `POST /products` → Create product

### Order Service

* `POST /orders` → Place order
* `GET /orders` → Get all orders

---

## 🚦 API Gateway Routing

| Service         | Route          |
| --------------- | -------------- |
| Product Service | `/products/**` |
| Order Service   | `/orders/**`   |

---

## ▶️ How to Run

### 1️⃣ Start Eureka Server

```
cd eureka-server
mvn spring-boot:run
```

### 2️⃣ Start Microservices

```
cd product-service
mvn spring-boot:run

cd order-service
mvn spring-boot:run
```

### 3️⃣ Start API Gateway

```
cd api-gateway-service
mvn spring-boot:run
```

---

## 🌐 Access

* Eureka Dashboard → http://localhost:8761
* API Gateway → http://localhost:8000

---

## 💡 Key Learnings

* Implemented **Service Discovery Pattern**
* Designed **loosely coupled microservices**
* Built **API Gateway routing mechanism**
* Handled **inter-service communication**
* Understood **distributed system challenges**

---

## 🚀 Future Enhancements

* 🔐 JWT Authentication & Authorization
* 📦 Docker & Kubernetes Deployment
* 🔄 Circuit Breaker (Resilience4j)
* 📊 Distributed Tracing (Zipkin)
* 📈 Monitoring (Prometheus & Grafana)

---

## 👨‍💻 Author

**Yeswanth K**

* 💼 Software Engineer
* 🧠 DSA Enthusiast (500+ problems solved)

---

## ⭐ If you like this project

Give it a ⭐ on GitHub and feel free to contribute!
