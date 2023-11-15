package modelo;

import controlador.Controlador;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo extends Thread {

    private Controlador control;
    private final int PUERTO = 5000;
    private ServerSocket serverSocket;
    private Socket cliente;
    private BufferedReader input;
    private BufferedWriter output;
    private int ordenamiento;

    public void abrirPuerto() {
        try {
            serverSocket = new ServerSocket(PUERTO);
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public void esperarCliente() {
        try {
            cliente = serverSocket.accept();
            FlujoMensajes();
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void FlujoMensajes() {
        try {
            input = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            //output = new PrintWriter(cliente.getOutputStream(), true);
            output = new BufferedWriter(new OutputStreamWriter(cliente.getOutputStream()));
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setControl(Controlador controlador) {
        this.control = controlador;
    }

    public void enviarMensaje(String mensaje) {
        try {
            output.write(mensaje);
            output.newLine();
            output.flush();
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String recibirMensaje() {
        try {
            String mensaje = input.readLine();
            //if (!mensaje.matches("[a-zA-Z]")){
            if (!mensaje.contains("Ordenamiento")) {
                enviarMensaje(mensaje);
                String[] datos = mensaje.split(",");
                int[] datosint = new int[datos.length];
                for (int i = 0; i < datos.length; i++) {
                    datosint[i] = Integer.parseInt(datos[i]);
                }
                if (ordenamiento == 1) {
                    ordenamientos.ordenamientoBurbuja(datosint);
                } else if (ordenamiento == 2) {
                    ordenamientos.ordenamientoInsercion(datosint);
                } else if (ordenamiento == 3) {
                    int[] datos2 = ordenamientos.seleccion(datosint);
                    datosint = datos2;
                } else if (ordenamiento == 4) {
                    int[] datos2 = ordenamientos.heapSort(datosint);
                    datosint = datos2;
                } else if (ordenamiento == 5) {
                    ordenamientos.quickSort(datosint, 0, datosint.length - 1);
                } else if (ordenamiento == 6) {
                    ordenamientos.ordenamientoShell(datosint);
                } else if (ordenamiento == 7) {
                    int[] datos2 = ordenamientos.radixSort(datosint);
                    datosint = datos2;
                } else if (ordenamiento == 8) {
                    int[] datos2 = ordenamientos.mezclaNatural(datosint);
                    datosint = datos2;
                }

                String respuesta = "";
                for (int i = 0; i < datosint.length; i++) {
                    respuesta = respuesta + "," + datosint[i];
                }
                enviarMensaje(respuesta);
                return respuesta;
            } else {
                ordenamiento = escoger(mensaje);
                return mensaje;
            }
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public int escoger(String mensaje) {
        if (mensaje.equalsIgnoreCase("Ordenamiento Burbuja")) {
            return 1;
        } else if (mensaje.equalsIgnoreCase("Ordenamiento Insercion")) {
            return 2;
        } else if (mensaje.equalsIgnoreCase("Ordenamiento Seleccion")) {
            return 3;
        } else if (mensaje.equalsIgnoreCase("Ordenamiento Heap Sort")) {
            return 4;
        } else if (mensaje.equalsIgnoreCase("Ordenamiento Quick Sort")) {
            return 5;
        } else if (mensaje.equalsIgnoreCase("Ordenamiento Shell Sort")) {
            return 6;
        } else if (mensaje.equalsIgnoreCase("Ordenamiento Radix Sort")) {
            return 7;
        } else if (mensaje.equalsIgnoreCase("Ordenamiento Mezcla Natural")) {
            return 8;
        }
        return 0;
    }

    @Override
    public void run() {
        while (true) {
            String mensaje = recibirMensaje();
            control.addMensaje("Mensaje: " + mensaje);
        }
    }
}
