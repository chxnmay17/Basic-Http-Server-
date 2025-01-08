# Simple HTTP Server in Java

This project is a basic implementation of a web server written in Java using sockets. It demonstrates handling incoming HTTP requests and serving a simple HTML response. This project is designed to help understand the fundamentals of socket programming, HTTP protocols, and server-client communication.

## Getting Started

### Prerequisites
Make sure you have the following installed on your system:

- **Java Development Kit (JDK)** (Version 11 or later recommended)
- **Integrated Development Environment (IDE)** (e.g., IntelliJ IDEA, Eclipse) or a text editor
- **Command-Line Interface (CLI)** to run the program

### Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/java-http-server.git
    cd java-http-server
    ```

2. Compile the code:
    ```bash
    javac BasicHttpServer.java
    ```

3. Run the server:
    ```bash
    java BasicHttpServer
    ```

The server will start listening on port `8080` by default. You can change the port by modifying the code in the `main` method.

## Usage
After starting the server, you can test it by opening a web browser or using `curl`:

- **Test a simple GET request:**
    ```bash
    curl http://localhost:8080
    ```
    The server will respond with a simple HTML page.

- **Access via a browser:**
    Visit [http://localhost:8080](http://localhost:8080) in your web browser.

## Features
- Serves a basic HTML response to HTTP requests.
- Handles multiple client connections using threads.

## Technologies Used
- **Java**: The core language for this project.
- **Sockets (java.net.ServerSocket, java.net.Socket)**: For creating the server and managing client connections.

## Limitations
- The server only supports basic HTTP GET requests.
- No support for serving static files or advanced HTTP features.

## Future Enhancements
- Add support for serving static files from a directory.
- Implement error handling for unsupported HTTP methods.
- Enhance the HTML response dynamically.

## Contributing
Feel free to submit pull requests or suggest improvements.


