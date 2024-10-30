# TVS Motor Company Vehicle Management System

## Overview

This RESTful API application, built using Spring Boot, is designed for TVS Motor Company to efficiently manage vehicle inventory and dealer information. It provides a comprehensive set of features for performing CRUD operations on vehicles and dealers.

## Features

- **Dealer Management**
  - Add new dealers
  - Retrieve all dealers
  - Search dealers by location
  - Update dealer contact information

- **Vehicle Management**
  - Add new vehicles
  - Retrieve all vehicles by dealer
  - Update vehicle prices
  - Mark vehicles as sold
  - Get all available vehicles
  - Delete vehicles

## Technology Stack

- **Backend Framework**: Spring Boot
- **Database**: MySQL
- **Additional Libraries**: Lombok
- **API Testing**: Postman

## Getting Started

### Prerequisites

- Java JDK 11 or higher
- Maven
- MySQL

### Database Configuration

Configure your MySQL database connection in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tvs_16511
spring.datasource.username=root
spring.datasource.password=''
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.generate-ddl=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.show-sql=true
```

### Installation and Running

1. Clone the repository:
   ```
   git clone https://github.com/your-username/dealer-spring-hackathon.git
   cd dealer-spring-hackathon
   ```

2. Build the project:
   ```
   ./mvnw clean install
   ```

3. Run the application:
   ```
   ./mvnw spring-boot:run
   ```

4. The application will be accessible at `http://localhost:9015`.

## API Endpoints

### Dealer Endpoints

- **Add a New Dealer**: `POST /api/dealers`
- **Get All Dealers**: `GET /api/dealers`
- **Search Dealer by Location**: `GET /api/dealers/search/location/{location}`
- **Update Dealer Contact Information**: `PUT /api/dealers/{dealerId}/contact`

### Vehicle Endpoints

- **Add a New Vehicle**: `POST /api/vehicles?dealerId={dealerId}`
- **Get All Available Vehicles**: `GET /api/vehicles/available`
- **Get Vehicles by Dealer ID**: `GET /api/dealers/{dealerId}/vehicles`
- **Update Vehicle Price**: `PUT /api/vehicles/{vehicleId}/price`
- **Mark Vehicle as Sold**: `PUT /api/vehicles/{vehicleId}/status/sold`
- **Delete Vehicle**: `DELETE /api/vehicles/{vehicleId}`

## Testing

Use Postman to test the API endpoints. Import the provided Postman collection for easy testing.

## Error Handling

The application includes global exception handling with custom exceptions such as `IDNotFoundException` and `InValidVehicleException` for meaningful error messages.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Postman Documentation](https://learning.postman.com/docs/getting-started/introduction/)

