# Multi-stage build for Java application
# Stage 1: Build stage
FROM eclipse-temurin:21-jdk as builder

WORKDIR /build

# Copy source files
COPY src/ src/

# Compile Java files
RUN mkdir -p build && \
    javac -d build src/main/java/com/example/*.java

# Stage 2: Runtime stage
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copy compiled classes from builder stage
COPY --from=builder /build/build /app

# Set the entry point
ENTRYPOINT ["java", "-cp", ".", "com.example.SimpleApp"]
