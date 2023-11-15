
package com.funcionaldisplay;

import controlador.Controlador;

public interface IVista {
    public void setControl(Controlador control);
    public void addMensaje(String mensaje);
    public void isVisible(boolean visible);
            
}
