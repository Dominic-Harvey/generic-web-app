# Monorepo Web Application

This project consists of a Spring Boot backend and an Angular frontend.

```bash
# Standard development workflow (use this after code changes)
docker-compose up --build -d
```

### Common Issues

1. **Port conflicts**
   - Ensure no other services are running on ports 8080 or 5432
   - Use `lsof -i :<port>` to check for processes using a port