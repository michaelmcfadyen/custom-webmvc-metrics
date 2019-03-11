## Setup

```
mvn clean package && docker-compose up --build
```


Go to Grafana (localhost:3000) and login with username admin and password admin. 
Add an influx datasource.
Url is http://influx:8086.
Database is metrics.
User is user.
Password password.


### Generating Custom Metrics

There are two endpoints each configured to create a custom metric using @Timed.

```bash
curl -X GET http://localhost:8080/hello
curl -X GET http://localhost:8080/goodbye
```