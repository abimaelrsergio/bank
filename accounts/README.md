### Actuator 
   - shutdown: POST http://localhost:8080/actuator/shutdown

### Generate Docker Image:
   - mvn compile jib:dockerBuild

### Send image to DockerHub:
   - docker image push docker.io/abimaelrsergio/accounts:08.10.2025