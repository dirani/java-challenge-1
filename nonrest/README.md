https://spring.io/guides/tutorials/rest/

# Building REST services with Spring

./mvnw clean spring-boot:run

curl -v localhost:8080/employees

curl -v localhost:8080/employees/99

curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'

curl -X DELETE localhost:8080/employees/3

curl -v localhost:8080/employees/1 | json_pp





