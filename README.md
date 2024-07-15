# Inpost Home Project

This project includes API and GUI tests for Inpost Home Assignment.

## Prerequisites

- Docker
- Docker Compose
- Maven
- Java Development Kit (JDK) 21
- Spring Boot
- Rest Assured
- Selenium WebDriver
- Selenide

## Project Structure

- `api-tests`: Directory containing API tests.
- `gui-tests`: Directory containing GUI tests.

## Building and Running the Project

### Using Docker Compose

#### Building and Running with Docker Compose
To build and run the entire project using Docker Compose, follow these steps:

1. **Build and Run All Tests:**
    ```bash
    docker-compose --profile gui --profile api up --build
    ```

2. **Build and Run Specific Test Module Based on The Profile:**
    ```bash
    docker-compose --profile gui up --build
    docker-compose --profile api up --build
    ```

### Using Spring Profiles to simulate execution for different environments
To run the tests with different Spring profiles, you can set the `SPRING_PROFILES_ACTIVE` environment variable.

#### Example for Linux and macOS::
```bash
export SPRING_PROFILES_ACTIVE=dev
docker-compose --profile gui up --build
```

#### Example for Windows::
```bash
$env:SPRING_PROFILES_ACTIVE="dev"
docker-compose --profile gui up --build
```


Replace `dev` with your desired Spring profile - [`int`, `cert`]

### Viewing Allure Reports
To view the Allure reports, open your browser and navigate to the following URLs:

- **GUI Tests Allure UI:** `http://localhost:5051/allure-docker-service/projects/default/reports/latest/index.html`
- **API Tests Allure UI:** `http://localhost:5050/allure-docker-service/projects/default/reports/latest/index.html`

## Cleaning Up
To stop and remove all running containers, use the following command:
```bash
docker-compose down
```

### Building Docker Images
To build the Docker images for the `gui-tests` and `api-tests` modules, follow these steps:

#### Building `gui-tests` Docker Image
```bash
docker build -t gui-tests -f gui-tests/Dockerfile -t gui-test:1.0 .
```

#### Building `api-tests` Docker Image
```bash
docker build -t api-tests -f api-tests/Dockerfile -t api-test:1.0 .
```

### Running Docker Containers
To run the Docker containers individually, use the following commands:

#### Creating Docker Network

Before running the gui-tests, you need to create a Docker network:

```bash
docker network create my-network
```

#### Running `selenium-chrome` Container
```bash
docker run --name selenium-chrome -d -p 4444:4444 --network my-network selenium/standalone-chrome
```

#### Running `gui-test` Container
```bash
docker run --name gui-test -d --network my-network -v ./gui-allure-results:/app/gui-tests/gui-allure-results -e SELENIDE_REMOTE=http://selenium-chrome:4444/wd/hub -e SPRING_PROFILES_ACTIVE=your-spring-profile gui-tests
```

#### Running `allure-gui` Container
```bash
docker run --name allure-gui -d -p 5051:5050 --network my-network -v ./gui-allure-results:/app/allure-results -v ./gui-allure-reports:/app/default-reports -e CHECK_RESULTS_EVERY_SECONDS=3 -e KEEP_HISTORY=1 frankescobar/allure-docker-service
```

#### Running `allure-gui-ui` Container
```bash
docker run --name allure-gui-ui -d -p 5253:5252 --network my-network -e ALLURE_DOCKER_PUBLIC_API_URL=http://allure-gui:5050 frankescobar/allure-docker-service-ui
```

#### Running `api-test` Container
```bash
docker run --name api-test -d --network my-network -v ./api-allure-results:/app/api-tests/api-allure-results -e SPRING_PROFILES_ACTIVE=your-spring-profile api-tests
```

#### Running `allure-api` Container
```bash
docker run --name allure-api -d -p 5050:5050 --network my-network -v ./api-allure-results:/app/allure-results -v ./api-allure-reports:/app/default-reports -e CHECK_RESULTS_EVERY_SECONDS=3 -e KEEP_HISTORY=1 frankescobar/allure-docker-service
```

#### Running `allure-api-ui` Container
```bash
docker run --name allure-api-ui -d -p 5252:5252 --network my-network -e ALLURE_DOCKER_PUBLIC_API_URL=http://allure-api:5050 frankescobar/allure-docker-service-ui
```