package Clientesocket;

import controlador.Controlador;
import modelo.Modelo;
import com.funcionaldisplay.IVista;
import com.funcionaldisplay.Login;

public class ClienteSocket {
    public static void main(String[] args) {
        IVista vista = new Login();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista,modelo);
        vista.setControl(controlador);
        modelo.setControl(controlador);
        controlador.start();
    }
}
