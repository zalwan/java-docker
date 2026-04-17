#!/bin/bash

# Simple run script for Java Docker app

set -e

echo "🚀 Running Java Docker application..."
echo ""

# Check if Docker is installed
if ! command -v docker &> /dev/null; then
    echo "❌ Docker is not installed. Please install Docker first."
    exit 1
fi

# Check if image exists, build if not
if ! docker image inspect java-docker-app:latest > /dev/null 2>&1; then
    echo "📦 Image not found. Building..."
    docker build -t java-docker-app:latest .
fi

echo "▶️  Starting application..."
echo ""

# Run the container with interactive terminal
docker run -it --rm java-docker-app:latest
