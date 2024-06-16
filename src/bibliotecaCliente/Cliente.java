package bibliotecaCliente;

import java.io.*;
import java.net.*;
import java.util.Arrays;
import java.util.List;

public class Cliente {
    private static final String HOST = "localhost";
    private static final int PORT = 1234;

    public static void main(String[] args) {
        try (Socket socket = new Socket(HOST, PORT);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
        	
        	String initialMessage;
            while ((initialMessage = in.readLine()) != null && !initialMessage.isEmpty()) {
                System.out.println(initialMessage);
            }
            
            String userInput;
            while ((userInput = console.readLine()) != null) {
                out.println(userInput);

                String serverResponse = in.readLine();
                if (userInput.startsWith("LISTAR")) {
                    processListResponse(serverResponse);
                } else {
                    System.out.println("Resposta: " + serverResponse);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processListResponse(String response) {
        List<String> bookList = Arrays.asList(response.split("\\|\\|")); // Usamos o mesmo delimitador "||"

        System.out.println("Lista de livros:");
        for (String book : bookList) {
            System.out.println(book);
        }
    }
}

