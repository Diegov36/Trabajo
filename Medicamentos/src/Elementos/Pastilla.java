/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Diego
 */
public class Pastilla extends Medicamento{
    private SimpleIntegerProperty cantPastilla;
    
    
    public Pastilla(String nombre, int costo, String franquicia, String direccion, int telefono,int cantPastilla) {
        super(nombre, costo, franquicia, direccion, telefono);
        this.cantPastilla = new SimpleIntegerProperty(cantPastilla);
    }

    public Integer getCantPastilla() {
        return cantPastilla.get();
    }
    
    
}
