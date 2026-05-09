# Simple Java Docker Application 🚀

A beginner-friendly Java console application that runs in Docker. Perfect for learning Java and Docker basics with interactive terminal input/output.

## Features

- ✅ **Interactive Menu** - Choose from different options
- ✅ **Terminal Input/Output** - Type commands and see results
- ✅ **Simple Operations** - Greetings, math, number checking
- ✅ **Containerized** - Runs reliably in Docker
- ✅ **Easy to Learn** - Well-commented code
- ✅ **Easy to Extend** - Add your own features

## Project Structure

```
java-docker/
├── src/main/java/com/example/
│   └── SimpleApp.java          # Main Java application
├── Dockerfile                  # Container configuration
├── docker-compose.yml          # Docker Compose setup
├── build.sh                    # Build script
├── run.sh                      # Run script
├── README.md                   # This file
├── JAVA_GUIDE.md              # Java code guide
└── .gitignore
```

## Prerequisites

You only need **Docker**. That's it!

### Install Docker

**macOS/Windows:**
- Download [Docker Desktop](https://www.docker.com/products/docker-desktop)
- Install and run it

**Linux (Ubuntu/Debian):**
```bash
sudo apt-get update
sudo apt-get install docker.io docker-compose
sudo usermod -aG docker $USER
# Log out and log back in for permission changes to take effect
```

**Linux (Fedora):**
```bash
sudo dnf install docker docker-compose
sudo usermod -aG docker $USER
```

## ⚡ Quick Start (3 Steps)

### Step 1: Navigate to project
```bash
cd /home/suryawan/projects/java-docker
```

### Step 2: Build the Docker image

**Bash/Zsh:**
```bash
chmod +x run.sh build.sh
./build.sh
```

**Fish shell:**
```fish
bash build.sh
```

⏱️ This takes ~30 seconds on first run (downloads Java base image). Subsequent builds are instant.

### Step 3: Run the application

**Bash/Zsh:**
```bash
./run.sh
```

**Fish shell:**
```fish
bash run.sh
```

**Or use docker-compose (works in all shells):**
```bash
docker-compose run --rm app
```

That's it! You should see the menu and can start typing.

## 🎮 How to Use the Application

Once you run the app, you'll see:

```
╔════════════════════════════════════╗
║  Welcome to Simple Java Docker App  ║
╚════════════════════════════════════╝

Choose an option:
1. Greet me
2. Add two numbers
3. Check if number is even/odd
4. Exit
> 
```

### Try these interactions:

**Option 1 - Greet me:**
```
> 1
Enter your name: John
Hello, John! Welcome to Docker learning!
```

**Option 2 - Add two numbers:**
```
> 2
Enter first number: 10
Enter second number: 20
Result: 10 + 20 = 30
```

**Option 3 - Check even/odd:**
```
> 3
Enter a number: 7
7 is ODD
```

**Option 4 - Exit:**
```
> 4
Goodbye!
```

## 🔧 Running Commands

### Using run.sh (Recommended)

**Bash:**
```bash
./run.sh
```

**Fish shell:**
```fish
bash run.sh
```

Builds if needed, then runs.

### Using build.sh

**Bash:**
```bash
./build.sh
```

**Fish shell:**
```fish
bash build.sh
```

### Using docker-compose
```bash
docker-compose run --rm app
```
Works the same in bash and fish.

### Using plain Docker
```bash
docker build -t java-docker-app:latest .
docker run -it --rm java-docker-app:latest
```

---

## 🐚 Shell Compatibility

### Why bash vs fish?

The `run.sh` and `build.sh` scripts are written in **bash** syntax. While most Linux shells are compatible, **fish shell** has different syntax.

| Shell | How to run scripts | Notes |
|-------|-------------------|-------|
| bash | `./run.sh` | Default on most Linux systems |
| zsh | `./run.sh` | macOS default, bash-compatible |
| fish | `bash run.sh` | Must explicitly use bash |
| PowerShell | `bash run.sh` (on Windows with Git Bash) | Use bash version |

### Quick Reference

**In Fish:**
```fish
# Make scripts executable (one time)
chmod +x run.sh build.sh

# Run with bash
bash run.sh
bash build.sh

# Or run docker-compose directly (no bash needed)
docker-compose run --rm app
```

**In Bash/Zsh:**
```bash
# Make scripts executable (one time)
chmod +x run.sh build.sh

# Run directly
./run.sh
./build.sh
```

### Docker Compose in Fish (Recommended)

The easiest approach in fish shell is to skip the shell scripts entirely and use docker-compose directly:

```fish
# Build
docker-compose build

# Run
docker-compose run --rm app
```

No compatibility issues, works the same everywhere!

## ✏️ Making Changes to the Code

### Step 1: Edit the Java file
Open `src/main/java/com/example/SimpleApp.java` and make changes.

### Step 2: Rebuild
```bash
./build.sh
```

### Step 3: Run
```bash
./run.sh
```

**That's it!** Docker automatically compiles your changes.

## 📖 Learning Path

Learn Java and Docker in this order:

1. **Run and explore** - Get the app working
2. **Read the code** - Understand [SimpleApp.java](src/main/java/com/example/SimpleApp.java)
3. **Modify the code** - Add a new menu option
4. **Check Docker setup** - Understand [Dockerfile](Dockerfile)
5. **Learn Docker Compose** - See [docker-compose.yml](docker-compose.yml)
6. **Add more features** - Build something new!

For detailed Java learning, see [JAVA_GUIDE.md](JAVA_GUIDE.md).

## 🚀 Adding Your Own Feature

Let's add a new menu option. Here's how:

### Example: Add a "Square a number" feature

**1. Edit `src/main/java/com/example/SimpleApp.java`**

Find this section:
```java
System.out.println("3. Check if number is even/odd");
System.out.println("4. Exit");
```

Change to:
```java
System.out.println("3. Check if number is even/odd");
System.out.println("4. Square a number");
System.out.println("5. Exit");
```

**2. Find the switch statement:**
```java
case "4":
    running = false;
    System.out.println("Goodbye!");
    break;
```

Change to:
```java
case "4":
    squareNumber(scanner);
    break;
case "5":
    running = false;
    System.out.println("Goodbye!");
    break;
```

**3. Add the new method:**
```java
private static void squareNumber(Scanner scanner) {
    try {
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(scanner.nextLine().trim());
        int squared = num * num;
        System.out.println(num + " squared = " + squared);
    } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number.");
    }
}
```

**4. Rebuild and run:**
```bash
./build.sh
./run.sh
```

Done! Your new feature is ready.

## 🐛 Troubleshooting

### Docker not found
```bash
# Install Docker
# macOS/Windows: Download Docker Desktop
# Linux: sudo apt-get install docker.io

# Verify Docker is running
docker --version
```

### Permission denied on run.sh
```bash
chmod +x run.sh build.sh
```

### Can't type input in the container
Make sure you're using `docker-compose run --rm app` or `./run.sh`, not `docker-compose up`.

### Java code changes not showing up
You must rebuild after editing:
```bash
./build.sh  # Always rebuild after code changes
./run.sh    # Then run
```

### Linux: "Got permission denied" when running Docker
```bash
sudo usermod -aG docker $USER
# Log out and log back in
```

### Build fails with "javac not found"
The Docker image might be corrupted. Try:
```bash
docker image rm java-docker-app:latest
./build.sh  # Rebuild from scratch
```

## 📚 Understanding the Project

### Dockerfile
- Stage 1: Uses `eclipse-temurin:21-jdk` to compile Java code
- Stage 2: Uses `eclipse-temurin:21-jre` (smaller) to run compiled code
- Result: Smaller final image (~200MB instead of ~600MB)

### docker-compose.yml
- `stdin_open: true` - Allows you to type input
- `tty: true` - Makes terminal look normal (adds colors, formatting)
- Runs with `run` command for interactive mode

### SimpleApp.java
- Uses `Scanner` class to read user input
- `switch` statement for menu options
- Private methods for each feature
- Error handling with try-catch

## 🔗 Docker Commands Reference

```bash
# Build image
docker build -t java-docker-app:latest .

# Run container (interactive)
docker run -it --rm java-docker-app:latest

# List images
docker images

# Remove image
docker rmi java-docker-app:latest

# View running containers
docker ps

# Stop container
docker stop <container-id>

# View container logs
docker logs <container-id>
```

## 📖 What You'll Learn

- ✅ Java basics (Scanner, loops, conditionals)
- ✅ Java methods and error handling
- ✅ Docker fundamentals
- ✅ Multi-stage Docker builds
- ✅ Running interactive apps in containers
- ✅ Docker Compose basics
- ✅ How to modify and rebuild code
