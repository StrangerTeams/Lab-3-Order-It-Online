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
    private Socket cliente;
    private BufferedReader input;
    private BufferedWriter output;
    private final String HOST = "127.0.0.1";
    
    public void conectarServidor(){
        try {
            cliente = new Socket(HOST, PUERTO);
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void FlujoMensajes(){
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
    
    public void enviarMensaje(String mensaje){
        try { 
            output.write(mensaje);
            output.newLine();
            output.flush();
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String recibirMensaje(){
        try {
            String mensaje = input.readLine();
            return mensaje;
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    @Override
    public void run(){
        while(true){
            String mensaje = recibirMensaje();
            control.addMensaje(mensaje);
        }
    }
    
}