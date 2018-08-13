#!/bin/bash
docker logs java-1
docker-compose down
docker rmi javatest/java:1.0
docker rmi javatest/mysql:1.0