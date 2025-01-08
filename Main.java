import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        int port = 8080; // Port the server will listen on

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("HTTP server running on port " + port);

            while (true) {
                // Accept an incoming connection
                Socket clientSocket = serverSocket.accept();

                // Handle the client request in a separate thread
                new Thread(() -> handleClient(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket clientSocket) {
        try (
                // Input and output streams for communication
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            // Read the request (simple example: only reads the first line)
            String requestLine = in.readLine();
            System.out.println("Received: " + requestLine);

            // Respond with a simple HTML page
            String response = """
                HTTP/1.1 200 OK
                Content-Type: text/html; charset=UTF-8

                <html>
                <head><title>Basic HTTP Server</title></head>
                <body>
                <h1>Welcome to the Basic HTTP Server</h1>
                <p>This is a simple HTTP server written in Java.</p>
                </body>
                </html>
                """;

            // Send the HTTP response
            out.print(response);
            out.flush();

            // Close the client socket
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
