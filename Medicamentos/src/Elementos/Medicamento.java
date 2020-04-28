/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Diego
 */
public class Medicamento {
    private SimpleStringProperty nombre;
    private SimpleIntegerProperty costo;
    private SimpleStringProperty franquicia;
    private SimpleStringProperty direccion;
    private SimpleIntegerProperty telefono;

    public Medicamento(String nombre, int costo, String franquicia, String direccion, int telefono) {
        this.nombre = new SimpleStringProperty(nombre);
        this.costo = new SimpleIntegerProperty(costo);
        this.franquicia = new SimpleStringProperty (franquicia);
        this.direccion = new SimpleStringProperty(direccion);
        this.telefono = new SimpleIntegerProperty(telefono);
    }


    
    public String getNombre() {
        return nombre.get();
    }

    public int getCosto() {
        return costo.get();
    }

    public String getFranquicia() {
        return franquicia.get();
    }

    public String getDireccion() {
        return direccion.get();
    }

    public int getTelefono() {
        return telefono.get();
    }
    
}
