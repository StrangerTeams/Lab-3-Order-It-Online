/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientesocket;

/**
 *
 * @author kospi
 */
import java.io.*;
import java.net.*;
//importa la clase math para generar numeros aleatorios

import java.util.Random;
public class ClienteSocket {
    public static void main(String[] args) {
        final String HOST = "127.0.0.1";
        final int PUERTO = 5000;

        try (Socket socket = new Socket(HOST, PUERTO);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader inputUsuario = new BufferedReader(new InputStreamReader(System.in))) {

            String mensajeServidor;
            while ((mensajeServidor = input.readLine()) != null) {
                System.out.println(mensajeServidor);

                System.out.print("Ingrese el número de la opción: ");
                String opcion = inputUsuario.readLine();
                output.println(opcion);

                System.out.print("Ingrese la longitud del array: ");
                int length = Integer.parseInt(inputUsuario.readLine());
                output.println(length);

                int[] array = new int[length];
                for (int i = 0; i < length; i++) {
                    System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                    //rellena el array con numeros aleatorios del 1 al 5000
                    array[i] = (int) (Math.random() * 999999) + 1;

                    output.println(array[i]);
                }

                output.println("-1");

                // Recibir el array ordenado del servidor
                System.out.println("Array ordenado recibido del servidor:");
                boolean finArray = false;
                while (!finArray) {
                    String data = input.readLine();
                    if (data.equals("-1")) {
                        finArray = true;
                    } else {
                        int number = Integer.parseInt(data);
                        System.out.print(number + " ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}