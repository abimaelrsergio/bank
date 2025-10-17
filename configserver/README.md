# URLs to check:

### accounts
- ConfigServer configuration:
  - http://localhost:8071/accounts/default
  - http://localhost:8071/accounts/prod
  - http://localhost:8071/accounts/qa
- Actuator:
   - http://localhost:8080/actuator
- Actuator Refresh:
   - POST http://localhost:8080/actuator/refresh
- health:
   - http://localhost:8071/actuator/health
   - http://localhost:8071/actuator/health/liveness
   - http://localhost:8071/actuator/health/readiness

### loans
- ConfigServer configuration:
   - http://localhost:8071/loans/default
   - http://localhost:8071/loans/prod
   - http://localhost:8071/loans/qa
- Actuator:
    - http://localhost:8090/actuator
- Actuator Refresh:
    - POST http://localhost:8090/actuator/refresh
  
### Cards
- ConfigServer configuration:
   - http://localhost:8071/cards/default
   - http://localhost:8071/cards/prod
   - http://localhost:8071/cards/qa
- Actuator:
    - http://localhost:9000/actuator
- Actuator Refresh:
    - POST http://localhost:9000/actuator/refresh

### Eureka Server
- ConfigServer configuration:
   - http://localhost:8071/eurekaserver/default

### Hookdeck -> to test
- https://dashboard.hookdeck.com/
   - hookdeck logout
   - hookdeck listen 8071 bank-config --cli-path /monitor
  
### RabbitMQ 4.x (https://www.rabbitmq.com/docs/download)
- docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:4-management

### MySQL
- docker run -p 3306:3306 --name accountsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=accountsdb mysql
- docker run -p 3307:3306 --name loansdb -e MYSQL_ROOT_PASSWORD=root    -e MYSQL_DATABASE=loansdb mysql
- docker run -p 3308:3306 --name cardsdb -e MYSQL_ROOT_PASSWORD=root    -e MYSQL_DATABASE=cardsdb mysql