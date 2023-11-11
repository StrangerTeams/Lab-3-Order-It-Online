/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servidorsocket;

/**
 *
 * @author kospi
 */

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class ServidorSocket {
    public static void main(String[] args) {
        final int PUERTO = 5000;

        try (ServerSocket serverSocket = new ServerSocket(PUERTO)) {
            System.out.println("Servidor esperando conexiones...");

            while (true) {
                Socket clienteSocket = serverSocket.accept();
                System.out.println("Cliente conectado");
                try (BufferedReader input = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
                     PrintWriter output = new PrintWriter(clienteSocket.getOutputStream(), true)) {
                    output.println("Bienvenido, elija una opción de ordenamiento: 1. Ordenamiento Burbuja 2. Ordenamiento Inserción 3. Ordenamiento Shell, Te hackie la pc, llorindel");
                    output.println("");
                    String opcion = input.readLine();
                    int[] array = recibirArray(input);

                    if (opcion.equals("1")) {                        
                        ordenamientoBurbuja(array);
                    } else if (opcion.equals("2")) {
                        ordenamientoInsercion(array);
                    } else if (opcion.equals("3")) {
                        ordenamientoShell(array);
                    }

                    enviarArray(array, output);
                }
                clienteSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    
    // Método para recibir el array del cliente
    public static int[] recibirArray(BufferedReader input) throws IOException {
        List<Integer> receivedArray = new ArrayList<>();
        while (true) {
            String data = input.readLine();
            if (data.equals("-1")) {
                break;
            } else {
                
                receivedArray.add(Integer.parseInt(data));
            }
        }
        int[] array = new int[receivedArray.size()];
        for (int i = 0; i < receivedArray.size(); i++) {
            array[i] = receivedArray.get(i);
        }
        return array;
    }

    // Método para enviar el array ordenado al cliente
    public static void enviarArray(int[] array, PrintWriter output) {
        for (int i : array) {
            output.println(i);
        }
        output.println("-1");
    }







    // Métodos de ordenamiento...


    // Algoritmo de ordenamiento Burbuja
    public static void ordenamientoBurbuja(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Algoritmo de ordenamiento por Inserción
    public static void ordenamientoInsercion(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    // Algoritmo de ordenamiento Shell
    public static void ordenamientoShell(int[] array) {
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = array[i];

                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }
}
