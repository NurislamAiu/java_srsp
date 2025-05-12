# 📦 Spring Boot CRUD API: Person & Phone

```properties

Простой проект на Spring Boot, реализующий API для управления сущностями 
`Person` и их телефонами `Phone` с использованием Spring Data JPA и H2-базы данных.

---

## 🛠 Технологии

- Java 17+
- Spring Boot 3.4.5
- Spring Data JPA
- H2 Database (in-memory)
- Maven

---

## 📁 Структура проекта
├── model/   
│   ├── Person.java  
│   └── Phone.java  
├── repository/  
│   ├── PersonRepository.java  
│   └── PhoneRepository.java  
├── controller/  
│   └── PersonController.java  
├── resources/  
│   ├── application.properties  
│   └── data.sql  
└── Application.java  

---

## ⚙️ Конфигурация

Файл `application.properties`:

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.defer-datasource-initialization=true

Пример данных (data.sql)

Запуск проекта
	1.	Открыть проект в IntelliJ / VS Code
	2.	Выполнить mvn clean spring-boot:run
	3.	Открыть H2 Console:
	    •	URL: http://localhost:8080/h2-console
	    •	JDBC URL: jdbc:h2:mem:testdb
	    •	Username: sa, Password: (оставить пустым)

API Эндпоинты

➕ POST /persons/save
Создать нового человека

    POST http://localhost:8080/persons/save?name=Aliya&age=22

🔍 GET /persons/by-name
Найти людей по имени

    GET http://localhost:8080/persons/by-name?name=Aliya

🔍 GET /persons/older-than
Найти людей старше указанного возраста
    
    GET http://localhost:8080/persons/older-than?age=20

📱 GET /persons/phones
Получить список телефонов по personId
    
    GET http://localhost:8080/persons/phones?personId=1

Примечания
	•	Все изменения автоматически видны в http://localhost:8080/h2-console
	•	Id person_id в Phone ссылается на Person