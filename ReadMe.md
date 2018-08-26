

##build
```
mvn package -Dmaven.test.skip=true -Ponline
```

##eagle-policy

```
java -jar -Dcheckpoint=false -Dparallelism=1 eagle-policy.jar 3
```

##eagle-api
```
http://localhost:9081/eagle-api/task/query?taskId=1

http://localhost:9081/eagle-api/alert/query?policyId=1

```