/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Samlml
 */
public class AutoLavadoModDao {
    ArrayList <AutoLavadoMod> Carros=null;

    public AutoLavadoModDao() {
        Carros=new ArrayList();
    }
    
    public void agregar_carro(String Nombre, String Marca, String Modelo, String Placas,double Total){
        Carros.add(new AutoLavadoMod (Nombre,Marca,Modelo, Placas,Total));
    }
    
    public ArrayList<AutoLavadoMod> mostrar_carros(){
    
        return Carros;
    }
    
}
