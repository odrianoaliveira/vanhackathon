# Skip The Dishes - VanHackathon

## Reliable and Scalable Cloud-Native Microservices

### Overview

Stack used to built this project:
- Netflix OSS
  * Zuul Proxy Server
  * Eureka Server (Service Discovery)
  * Eureka Client
  * Feing Client (REST Client)
  * Ribbon (client load balancer)
- Spring, Spring Boot and Spring Cloud
- Java 8, Lambdas, Stream, FP and etc
- Lombok
- Docker

Here you will find:
 - 4 (four) microservices: 
    - Catalog Management
    - Customer Management
    - Order Management
    - Store Management
 - 1 (one) Eureka Service Discovery
 - 1 (one) Zuul Proxy Server

### How To Run

You will need to run all of the modules, all the microservices instances will registry into Eureka and the zuul server will automatically mount a route to each of the microservices.

Following with the project I attached the postman collection and the docker-compose with MongoDB and RabbitMQ, unfortunately due to the short time I did not user the Spring Cloud Stream in order to user Publish / Subscriber event-driven pattern.    

I used http basic auth that was implemented into the Zuul Server, see the postman collection. 

### Source repository

Following the [gihub repository](https://github.com/odrianoaliveira/vanhackathon).
