# Spring Boot + OpenAPI (Swagger) CRUD Example

Complete working example of **REST CRUD** APIs with **OpenAPI 3 / Swagger UI** documentation using **springdoc-openapi**.

## Tech Stack

- Java 17
- Spring Boot 3.3.4
- Spring Data JPA
- H2 In-Memory Database
- springdoc-openapi 2.6.0 (Swagger UI)
- Lombok + Validation

## How to Run

### Prerequisites
- JDK 17+
- Maven 3.8+

### Steps

```bash
# 1. Go to project folder
cd spring-boot-openapi-crud

# 2. Build & Run
mvn spring-boot:run
```

Application starts on: **http://localhost:8080**

---

## Important URLs

| Resource            | URL                                              |
|---------------------|--------------------------------------------------|
| **Swagger UI**      | http://localhost:8080/swagger-ui.html            |
| **OpenAPI JSON**    | http://localhost:8080/v3/api-docs                |
| **OpenAPI YAML**    | http://localhost:8080/v3/api-docs.yaml           |
| **H2 Console**      | http://localhost:8080/h2-console                 |

> **Best way to test:** Open **http://localhost:8080/swagger-ui.html**

---

## API Endpoints

| Method   | Endpoint              | Description          |
|----------|-----------------------|----------------------|
| `GET`    | `/api/products`       | Get all products     |
| `GET`    | `/api/products/{id}`  | Get product by ID    |
| `POST`   | `/api/products`       | Create product       |
| `PUT`    | `/api/products/{id}`  | Update product       |
| `DELETE` | `/api/products/{id}`  | Delete product       |

---

## Example Requests (cURL)

### Create Product
```bash
curl -X POST http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{
    "name": "iPhone 16",
    "description": "Latest Apple smartphone",
    "price": 999.99,
    "quantity": 50
  }'
```

### Get All Products
```bash
curl http://localhost:8080/api/products
```

### Get Product by ID
```bash
curl http://localhost:8080/api/products/1
```

### Update Product
```bash
curl -X PUT http://localhost:8080/api/products/1 \
  -H "Content-Type: application/json" \
  -d '{
    "name": "iPhone 16 Pro",
    "description": "Updated description",
    "price": 1199.99,
    "quantity": 30
  }'
```

### Delete Product
```bash
curl -X DELETE http://localhost:8080/api/products/1
```

---

## Project Structure

```
src/main/java/com/example/openapicrud/
├── OpenApiCrudApplication.java
├── config/
│   └── OpenApiConfig.java          # OpenAPI metadata
├── entity/
│   └── Product.java
├── repository/
│   └── ProductRepository.java
├── dto/
│   ├── ProductRequest.java         # Request DTO + validation
│   └── ProductResponse.java        # Response DTO
└── controller/
    └── ProductController.java      # REST + OpenAPI annotations
```

## Notes

- All data is stored in **H2 in-memory** database (data is lost on restart).
- Validation annotations (`@NotBlank`, `@Positive`, etc.) are enabled.
- Full OpenAPI annotations (`@Tag`, `@Operation`, `@ApiResponse`, `@Parameter`) are used.
