while ! nc -z ${MYSQL_IP} ${MYSQL_PORT}; do sleep 3; done;
java -jar app.jar