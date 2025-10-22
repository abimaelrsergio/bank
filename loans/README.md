### Actuator 
   - shutdown: POST http://localhost:8090/actuator/shutdown

### Generate Docker Image:
- mvn compile jib:dockerBuild

### Send image to DockerHub:
   - docker image push docker.io/abimaelrsergio/loans:08.10.2025