package servidorsocket;

import controlador.Controlador;
import modelo.Modelo;
import vista.IVista;
import vista.Vista;

public class ServidorSocket {
    public static void main(String[] args) {
        IVista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista,modelo);
        vista.setControl(controlador);
        modelo.setControl(controlador);
        controlador.start();
    }
}
