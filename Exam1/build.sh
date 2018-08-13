mvn clean package;
cp target/app.jar ../docker/java/app.jar;
docker-compose build;
