
package vista;

import controlador.Controlador;

public interface IVista {
    public void activeEnviar();
    public void desactiveEnviar();
    public void setControl(Controlador control);
    public void addMensaje(String mensaje);
    public void reset();
    public void isVisible(boolean visible);
            
}
