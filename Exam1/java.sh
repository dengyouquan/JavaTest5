while ! netstat -an | grep 8080; do sleep 3; done;
echo "yes";
