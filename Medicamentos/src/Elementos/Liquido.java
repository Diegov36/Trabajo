/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Diego
 */
public class Liquido extends Medicamento{
    private SimpleDoubleProperty ml;

    public Liquido(String nombre, int costo, String franquicia, String direccion, int telefono, double ml) {
        super(nombre, costo, franquicia, direccion, telefono);
        this.ml = new SimpleDoubleProperty(ml);
    }

    public Double getMl() {
        return ml.get();
    }

    
    
    
}
