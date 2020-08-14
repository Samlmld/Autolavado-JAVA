/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Samlml
 */
public class AutoLavadoMod {
    
    private String Nombre;
     private String Marca;
     private String Modelo;
     private String Placas;
     private double Total ;
     
     public AutoLavadoMod(String Nombre, String Marca, String Modelo, String Placas,double Total ){
         this.Nombre=Nombre;
         this.Marca=Marca;
         this.Modelo=Modelo;
         this.Placas=Placas;
         this.Total=Total;
         
     }
     
     

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPlacas() {
        return Placas;
    }

    public void setPlacas(String Placas) {
        this.Placas = Placas;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

 

     


}
