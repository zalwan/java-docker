#!/bin/bash

# Simple build script for Java Docker app

set -e

echo "📦 Building Java Docker application..."
echo ""

# Check if Docker is installed
if ! command -v docker &> /dev/null; then
    echo "❌ Docker is not installed. Please install Docker first."
    exit 1
fi

# Build the Docker image
echo "🔨 Building Docker image..."
docker build -t java-docker-app:latest .

echo ""
echo "✅ Build complete!"
echo ""
echo "To run the application, use one of the following commands:"
echo ""
echo "Option 1 - Using docker-compose (recommended):"
echo "  docker-compose up --build"
echo ""
echo "Option 2 - Using docker run directly:"
echo "  docker run -it java-docker-app:latest"
echo ""
