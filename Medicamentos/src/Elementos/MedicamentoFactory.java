/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 *
 * @author Diego
 */
public class MedicamentoFactory {
    public static Medicamento getMedicamento(int tipo,String nombre,int costo, String franquicia, String direccion,int telefono,double presentacion){
        if (tipo == 0) {
            return new Liquido(nombre, costo, franquicia, direccion, telefono, presentacion);
        }else if(tipo == 1){
            return new Pastilla(nombre, costo, franquicia, direccion, telefono, (int) presentacion);
        }
        return null;
    }
}
