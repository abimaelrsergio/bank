### Actuator 
   - shutdown: POST http://localhost:9000/actuator/shutdown

### Generate Docker Image:
   - mvn compile jib:dockerBuild

### Send image to DockerHub:
   - docker image push docker.io/abimaelrsergio/cards:08.10.2025