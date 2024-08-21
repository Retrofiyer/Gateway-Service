<div>
    <h1>API Gateway Microservice</h1>
</div>

## About The Project
This microservice serves as the API Gateway for the streaming application. It acts as a single entry point for all client requests, routing them to the appropriate microservices while handling cross-cutting concerns such as authentication, logging, and rate limiting.

## Table of Contents

<ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#overview">Overview</a></li>
        <li><a href="#features">Features</a></li>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#running-the-service">Running the service</a></li>
      </ul>
    </li>
    <li>
      <a href="#contributing">Contributing</a>
    </li>
 </ol>

## Overview
The API Gateway is built using Spring Cloud Gateway. It provides a centralized access point to all the microservices within the application, enabling secure and efficient routing of client requests.

## Features
<div>
  <ul>
      <li> <b>Request Routing:</b> Routes client requests to the appropriate backend microservices.</li>
      <li> <b>Authentication & Authorization:</b> Handles authentication and authorization using JWT tokens.</li>
      <li> <b>Load Balancing:</b> Distributes incoming requests across multiple instances of backend services.</li>
      <li> <b>Rate Limiting:</b> Limits the number of requests from clients to protect backend services from overloading.</li>
      <li> <b>Logging & Monitoring:</b> Provides logging and monitoring features for tracking and analyzing requests.</li>
  </ul>
</div>

## Built With

[![Spring Boot][springboot.com]][springboot-url]
[![Swagger][swagger.com]][swagger-url] 
[![Docker][docker.com]][docker-url]

<!-- GETTING STARTED -->
## Getting Started

## Prerequisites

Before you begin, make sure you have the following tools installed on your machine:

- **Java 17 or higher** - [Download Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Spring Boot 3.3.2** - [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- **Maven** - [Maven](https://maven.apache.org/install.html)

If you don't have any of these tools installed, follow the provided links to install them.


## Installation

1.- Clone the repository
   ```sh
   git clone https://github.com/Retrofiyer/Gateway-Service.git
   cd Gateway-Service
   ```
2.- Build project using maven
 ```sh
   mvn clean install
   ```

## Running the service

  ```sh
    mvn spring-boot:run
   ```

## Contributing

I would like you to contribute to this project. Whether it's fixing a bug, adding a new feature or improving the documentation, your help is always welcome. Please email me at `sebitas5225@gmail.com` with all the details for improvement.

<!-- LINKS & IMAGES -->

[docker.com]: https://img.shields.io/badge/Docker-black?style=for-the-badge&logo=docker&logoColor=white
[docker-url]: https://www.docker.com/
[springboot.com]: https://img.shields.io/badge/SpringBoot-black?style=for-the-badge&logo=springboot&logoColor=white
[springboot-url]: https://spring.io/projects/spring-boot
[java.com]: https://img.shields.io/badge/Java-black?style=for-the-badge&logo=java&logoColor=white
[java-url]: https://www.oracle.com/java/
[rabbitmq.com]: https://img.shields.io/badge/RabbitMQ-black?style=for-the-badge&logo=rabbitmq&logoColor=white
[rabbitmq-url]: https://www.rabbitmq.com/
[swagger.com]: https://img.shields.io/badge/Swagger-black?style=for-the-badge&logo=swagger&logoColor=white
[swagger-url]: https://swagger.io/
[mysql.com]: https://img.shields.io/badge/MySQL-black?style=for-the-badge&logo=mysql&logoColor=white
[mysql-url]: https://www.mysql.com/