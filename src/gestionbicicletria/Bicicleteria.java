/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbicicletria;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Bicicleteria {
    ArrayList<Bicicleta>Bici;
    double ganancias;
    int cantidadDeVentas;
    
    Bicicleteria(){
    Bici=new ArrayList<>();
    cantidadDeVentas=0;
    ganancias=0;
    }
    void addBicicleta( Bicicleta nuevaBici){
    Bici.add(nuevaBici);
    }
    void venderBicicleta(Bicicleta bicicleta){
    cantidadDeVentas++;
    ganancias=ganancias+bicicleta.getPrecio();
    Bici.remove(bicicleta);
    }
    Bicicleta buscarBicicleta(String nroDeSerie){
    for (int i=0 ; i<Bici.size(); i++){
    if (nroDeSerie.equals(Bici.get(i).getNroDeSerie())){
    return Bici.get(i);
    }
    }
    return null;
    }
}
