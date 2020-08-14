/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autolavado;

import Controlador.ControlAutolavado;
import Modelo.AutoLavadoModDao;
import Vista.JFAutoLavado;

/**
 *
 * @author Samlml
 */
public class Autolavado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFAutoLavado jfauto = new JFAutoLavado();
        AutoLavadoModDao autoDAO = new AutoLavadoModDao();
        ControlAutolavado cauto = new ControlAutolavado(jfauto, autoDAO);
           
        jfauto.setLocationRelativeTo(null);
        jfauto.setVisible(true);
    }
    
}
