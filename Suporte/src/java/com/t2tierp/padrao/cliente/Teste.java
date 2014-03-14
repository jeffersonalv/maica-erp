/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t2tierp.padrao.cliente;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T2Ti
 */
public class Teste {

    public static void main(String args[]) {
        new Teste();
    }

    public Teste() {
        try {
            String executar = "javaws "
                    + " -open " + "\"1|"
                    + "empresa Teste|"
                    + "2|"
                    + "pessoa Teste|"
                    + "modulo|"
                    + "janela\" "
                    + " http://localhost:8084/Suporte/T2TiERP.jnlp";

            System.out.println(executar);
            Runtime.getRuntime().exec(executar);

        } catch (IOException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
