package com.t2tierp.padrao.cliente;

import com.t2tierp.suporte.cliente.ChamadoGridController;
import org.openswing.swing.mdi.client.*;

public class Fachada implements ClientFacade {

    public Fachada() {
    }

    public void getSuporteChamado(){
        new ChamadoGridController();
    }
}
