![image](https://github.com/vaibhavv1904/Event-Driven-Microservices/assets/41747438/5fd1f6f4-e421-4627-812f-5abe0867f293)

This architecture is designed for real-time data ingestion, processing, and querying with a strong emphasis on scalability, monitoring, and security. The combination of Kafka for event streaming, Elasticsearch for querying, Spring Cloud for microservices management, and various monitoring and tracing tools provides a robust and comprehensive system.

**Components:**

**Source Data** (Mock Tweet Generation):

The data source is a Mock Tweet generation method that provides real-time data for processing.

**Twitter to Kafka Service:**

This service ingests data from the Twitter stream and publishes it to Kafka, acting as an intermediary between the data source and Kafka.

**Event Store (Kafka):**

Kafka serves as the central event store, holding the streaming data for further processing by different services.

**Kafka Streams Service:**

Processes data from Kafka, performs stream processing, and sends results back to Kafka or other services.

**Kafka to Elasticsearch Service:**

This service reads data from Kafka and stores it in Elasticsearch for indexing and fast querying.

**Query Store (Elasticsearch):**

Elasticsearch stores the processed data and provides powerful search and analytics capabilities.

**Query Service:**

Acts as an interface to query the Elasticsearch data. This service fetches data from Elasticsearch and serves it to the web client.

**Web Client:**

The front-end application that interacts with the Query Service to display data to users.

**Analytics Service:**

Performs further analysis on the data and stores the results in a PostgreSQL database.

**Analytics Store (PostgreSQL):**

Stores analytical data results for long-term persistence.

**Config Server (Spring Cloud Config):**

Manages external configuration for all the microservices in a distributed system.

**API Gateway (Spring Cloud Gateway):**

Serves as a gateway that routes requests to the appropriate microservices.

**Discovery Service (Netflix Eureka):**

Provides service discovery, allowing microservices to find and communicate with each other dynamically.

**Authorization Server (Keycloak):**

Manages authentication and authorization for the services, providing security.

**Monitoring & Visualization:**

Spring Boot Actuator: Provides production-ready features for monitoring and managing Spring Boot applications.

Prometheus: Collects metrics from the services.

Grafana: Visualizes the metrics collected by Prometheus.

**Distributed Tracing & Log Aggregation:**

Spring Sleuth: Adds trace and span IDs to logs to track the flow of requests.

Zipkin: Collects and visualizes distributed tracing data.

Logback: Used for logging.

Logstash and Kibana: Logstash aggregates logs, and Kibana visualizes them.

**To start the application:**

1. docker-compose -f common.yml -f kafka_cluster.yml up -> to start the kafka cluster
2. docker run -it --network=host confluentinc/cp-kafkacat kafkacat -L -b localhost:19092 -> to check the status of brokers 
