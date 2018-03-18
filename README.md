# SkipTheDishes VanHackathon


##Overview

I used the NetflixOSS with Spring Cloud.

Here you will find:
 - 4 (four) microservices: 
    - Catalog Management
    - Customer Management
    - Order Management
    - Store Management
 - 1 (one) Eureka Service Discovery
 - 1 (one) Zuul Proxy Server

## How To Run

You will need to run all of the modules, all the microservices instances will registry into Eureka and the zuul server will automatically mount a route to each of the microservices.

Following with the project I attached the postman collection and the docker-compose with MongoDB and RabbitMQ, unfortunately due to the short time I did not user the Spring Cloud Stream in order to user Publish / Subscriber event-driven pattern.    

