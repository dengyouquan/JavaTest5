#curl -X POST -d "name=MARY&password=SMITH" 127.0.0.1:8080/login;
#curl -H "Content-Type:application/json" -X PUT -d '{"first_name":"deng","last_name":"youquan","email":"123@qq.com","address":"47 MySakila Drive"}' 127.0.0.1:8080/api/customers;
#curl -H "Content-Type:application/json" -X POST -d '{"first_name":"deng1","last_name":"youquan1","email":"123@qq.com","address":"47 MySakila Drive"}' 127.0.0.1:8080/api/customers/600;
curl -X DELETE --cookie "id=600" 127.0.0.1:8080/api/customers/600
#curl "127.0.0.1:8080/api/films/?pageSize=10&page=1"