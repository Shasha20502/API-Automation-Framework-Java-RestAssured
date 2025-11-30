# API-Automation-Framework-Java-RestAssured
REST API Automation using RestAssured | TestNG | Java | JSON Validation | CRUD Operations  Contains GET/POST/PUT/PATCH/DELETE automation scripts with assertions, reusable utilities and API test framework.

# 🚀 API Automation Framework — RestAssured + Java + TestNG

This repository contains complete API Testing automation using **RestAssured + Java + TestNG**.  
It includes GET, POST, PUT, PATCH, DELETE requests with JSON validations, assertions, reusable utilities and structured framework.

---

## 📌 Features

✔ RestAssured + Java + TestNG  
✔ CRUD operations (GET/POST/PUT/DELETE)  
✔ JSON Response validation  
✔ Reusable Request & Payload utilities  
✔ Framework scalable for live API testing  
✔ Ready for integration with CI/CD pipelines  
✔ Future scope: Allure Reports / Extent Reports

---

## 📁 Project Structure

src/test/java/
├── base/ → BaseTest setup (Base URI, common config)
├── tests/ → Actual API test cases
├── utils/ → Reusable methods (headers, payloads)
├── config/ → URL/token config loader
├── testdata/ → JSON bodies for request


---

## 🔥 API Requests Implemented

| API Type | Endpoint | Status |
|---|---|---|
| GET  | `/api/users?page=2` | ✔ |
| POST | `/api/users`        | ✔ |
| PUT  | `/api/users/2`      | 🔜 |
| DELETE | `/api/users/2`    | 🔜 |

(Will expand as project grows)
