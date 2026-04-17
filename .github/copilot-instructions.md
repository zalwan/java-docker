# Simple Java Docker Application - Setup Instructions

This project has been successfully scaffolded. Below are the setup steps:

## Completed Steps

✅ **Project Scaffolding**
- Java source code structure created at `src/main/java/com/example/SimpleApp.java`
- Dockerfile configured with multi-stage build
- Docker Compose setup for easy running
- Build and run scripts provided

✅ **Project Files**
- Main application: [SimpleApp.java](../src/main/java/com/example/SimpleApp.java)
- Docker configuration: [Dockerfile](../Dockerfile)
- Compose file: [docker-compose.yml](../docker-compose.yml)
- Build script: [build.sh](../build.sh)
- Run script: [run.sh](../run.sh)
- Documentation: [README.md](../README.md)

## Quick Start

### 1. Build the Application

```bash
chmod +x build.sh
./build.sh
```

### 2. Run the Application

```bash
chmod +x run.sh
./run.sh
```

Or use docker-compose:
```bash
docker-compose up --build
```

### 3. Interact with the Application

Once running, you'll see a menu. Enter your choice (1-4) and follow the prompts for interactive input/output.

## What's Included

- **Interactive Console App**: Menu-driven Java application that takes terminal input
- **Docker Setup**: Production-ready multi-stage Dockerfile
- **Easy Execution**: Scripts and docker-compose for simplified running
- **Learning Materials**: Well-commented code and comprehensive README

## Next Steps

1. Make `build.sh` and `run.sh` executable (already covered in commands above)
2. Build the Docker image
3. Run and interact with the application
4. Explore the source code in `src/main/java/com/example/SimpleApp.java`
5. Modify and extend the application as you learn

## System Requirements

- Docker 20.10+ installed and running
- ~300MB disk space for Docker image and cache
- Terminal/command line access

## Troubleshooting

See [README.md](../README.md#troubleshooting) for detailed troubleshooting guide.

**Quick fixes:**
- If permissions denied: `chmod +x run.sh build.sh`
- If Docker not found: Install Docker Desktop or Docker Engine for your OS
- On Linux with permission issues: `sudo usermod -aG docker $USER` then logout/login
