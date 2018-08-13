FROM registry.saas.hand-china.com/tools/mysql:5.6

COPY . /mysql/

RUN cat /mysql/sakila-schema.sql > /docker-entrypoint-initdb.d/dump.sql && \
cat /mysql/sakila-data.sql >> /docker-entrypoint-initdb.d/dump.sql