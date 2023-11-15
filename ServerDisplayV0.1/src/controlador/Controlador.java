package controlador;

import modelo.Modelo;
import com.funcionaldisplay.IVista;

public class Controlador {
    Modelo modelo;
    IVista vista;

    public Controlador(IVista vista,Modelo modelo) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void start(){
        vista.isVisible(true);
        vista.addMensaje("Conectando ...");
        modelo.conectarServidor();
        vista.addMensaje("Conexion exitosa");
        modelo.FlujoMensajes();
        modelo.start();
    }
    
    public void enviarMensaje(String mensaje){
        modelo.enviarMensaje(mensaje);
    }
    
    public void addMensaje(String mensaje){
        vista.addMensaje(mensaje);
    }
    
}
