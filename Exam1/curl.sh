echo -e "================================login==================================";
curl -s -X POST -d "name=MARY&password=SMITH" "$(docker-machine ip $(docker-machine active)):8080/login";
echo -e "\n===========================getAll========================================";
curl -s "$(docker-machine ip $(docker-machine active)):8080/api/films/?pageSize=10&page=1"
echo -e "================================insert==================================";
curl -s -H "Content-Type:application/json" -X PUT -d '{"first_name":"deng","last_name":"youquan","email":"123@qq.com","address":"47 MySakila Drive"}' "$(docker-machine ip $(docker-machine active)):8080/api/customers";
echo -e "\n====================================update=================================";
curl -s -H "Content-Type:application/json" -X POST -d '{"first_name":"deng1","last_name":"youquan1","email":"123@qq.com","address":"47 MySakila Drive"}' "$(docker-machine ip $(docker-machine active)):8080/api/customers/600";
echo -e "\n====================================delete=================================";
curl -s -X DELETE --cookie "id=600"  "$(docker-machine ip $(docker-machine active)):8080/api/customers/600"
sleep 3;
#sh stop.sh;
