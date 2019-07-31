/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbicicletria;

/**
 *
 * @author Usuario
 */
public class Bicicleta {
    String nroDeSerie;
    String modelo;
    int año;
    double precio;
    
    Bicicleta (String nroDeSerie,String modelo,int año){
    this.año=año;
    this.modelo=modelo;
    this.nroDeSerie=nroDeSerie;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }

    public void setNroDeSerie(String nroDeSerie) {
        this.nroDeSerie = nroDeSerie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
