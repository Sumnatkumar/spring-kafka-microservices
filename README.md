"# spring-kafka-microservices" 
Spring Kafka microservices are distributed systems built using Spring Boot + Apache Kafka to enable communication between different services in an event-driven architecture. Instead of services talking directly to each other via REST APIs all the time, they exchange messages (events) through Kafka topics.

What is Kafka?

Apache Kafka is a distributed streaming platform.
Works as a high-throughput, fault-tolerant, publish-subscribe message broker.
Services can produce (publish) and consume (subscribe) events asynchronously.

What are Microservices?
A microservice is a small, independent service that focuses on a specific business functionality.
Each microservice:
Has its own database.
Can be developed, deployed, and scaled independently.
Communicates with other microservices via REST APIs or messaging systems.

Why Kafka with Microservices?
REST APIs work well but can lead to tight coupling and synchronous dependencies.
Kafka enables:
Asynchronous communication (producer doesn’t wait for consumer).
Loose coupling (services don’t need to know about each other).
Scalability (multiple consumers can process the same event).
Event sourcing (keeping a log of all changes as events).

🔹 Spring Kafka Microservices Architecture

Typical architecture includes:
Producer Microservice
Publishes events (e.g., an Order Service sends an OrderCreatedEvent to Kafka).
Kafka Broker (Cluster)
Manages topics, partitions, and replication.
Stores events reliably.
Consumer Microservice
Subscribes to topics and reacts (e.g., Payment Service consumes OrderCreatedEvent to process payment).
Schema Registry (optional)
Ensures data format compatibility across services.

Spring Kafka microservices = Spring Boot + Kafka = loosely coupled, event-driven distributed systems.
