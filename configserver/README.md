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

### Hookdeck -> to test
- https://dashboard.hookdeck.com/
   - hookdeck logout
   - hookdeck listen 8071 bank-config --cli-path /monitor