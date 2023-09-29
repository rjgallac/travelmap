# Property Map

docker run --name travelmap --network=host -e MARIADB_DATABASE=travelmap -e MYSQL_ROOT_PASSWORD=root -d mariadb:10.3

curl  -X POST http://localhost:8080/marker -H "Content-Type: application/json" -d '{"address":"tes address"}'

curl  http://localhost:8080/marker -H "Content-Type: application/json" 

curl  http://localhost:8080/marker/1 -H "Content-Type: application/json" 

