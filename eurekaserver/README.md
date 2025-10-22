### Dashboard
- Eureka Server dashboard:
  - http://localhost:8070
  - http://localhost:8070/eureka/apps
  - http://localhost:8070/eureka/apps/accounts
  - http://localhost:8070/eureka/apps/cards
  - http://localhost:8070/eureka/apps/loans

### Generate Docker Image:
- mvn compile jib:dockerBuild

### Send image to DockerHub:
   - docker image push docker.io/abimaelrsergio/eurekaserver:08.10.2025