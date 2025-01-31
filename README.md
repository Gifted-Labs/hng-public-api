# HNG12 Stage 0 Backend - Public API

## Project Description
This project is a simple public API developed for HNG12 Stage 0 Backend Internship. The API returns basic information in JSON format, including the registered email, the current datetime (ISO 8601 format), and the GitHub repository URL of the project.

## Features
- Returns a JSON response containing email, current datetime, and GitHub repository URL.
- Dynamically generates the current datetime in UTC.
- Supports Cross-Origin Resource Sharing (CORS).
- Deployed on a publicly accessible endpoint.

## Technology Stack
- **Programming Language**: Java (Spring Boot)
- **Deployment**: Render/Vercel/Heroku (Choose your preferred platform)
- **Version Control**: Git & GitHub

## API Documentation

### Endpoint
`GET /api/v1/info`

### Sample Response (200 OK)
```json
{
  "email": "juliusadjeteysowah.com",
  "current_datetime": "2025-01-30T09:30:00Z",
  "github_url": "https://github.com/Gifted-Labs/hng-public-api.git"
}
```

### Response Fields
| Field             | Type   | Description                                      |
|------------------|--------|--------------------------------------------------|
| `email`         | string | The email used to register on HNG12 Slack       |
| `current_datetime` | string | Current datetime in ISO 8601 format (UTC)       |
| `github_url`    | string | URL to the GitHub repository                    |

## Setup Instructions

### Prerequisites
- Java 17+
- Maven

### Installation & Running Locally
1. Clone the repository:
   ```sh
   git clone https://github.com/Gifted-Labs/hng-public-api.git
   cd your-repo
   ```
2. Build the project:
   ```sh
   mvn clean install
   ```
3. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```

### Deployment
The API is deployed at:
[https://hng-public-api-q10d.onrender.com](https://hng-public-api-q10d.onrender.com)

## Example Usage
You can test the API using:
```sh
curl -X GET https://hng-public-api-q10d.onrender.com/api/v1/info
```
Or visit the URL in your web browser.

## License
This project is licensed under the Apache License.
