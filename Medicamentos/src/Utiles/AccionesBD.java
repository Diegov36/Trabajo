/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

import Elementos.Liquido;
import Elementos.Medicamento;
import Elementos.MedicamentoFactory;
import Elementos.Pastilla;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import medicamentos.PrincipalController;

/**
 *
 * @author Diego
 */
public class AccionesBD {
    public static ArrayList<Medicamento> lectura(){
        String[] datos = new String[7];
        ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
        File txt = null;
        FileReader fr = null;
        BufferedReader br = null;
        try{
            txt = new File("C:\\Users\\Diego\\Desktop\\Medicamentos\\BD.txt");
            fr = new FileReader(txt);
            br = new BufferedReader(fr);
            String linea;
            while ((linea=br.readLine()) != null) {
                datos = linea.split(" ");
                if (PrincipalController.busqueda.equals(datos[1])) {
                    if ("ML".equals(datos[0])) {
                        medicamentos.add(MedicamentoFactory.getMedicamento(0,datos[1],
                                Integer.valueOf(datos[2]), datos[3], datos[4], Integer.valueOf(datos[5]),
                                Double.valueOf(datos[6])));
                    }else{
                        medicamentos.add(MedicamentoFactory.getMedicamento(1,datos[1],
                                Integer.valueOf(datos[2]), datos[3], datos[4], Integer.valueOf(datos[5]),
                                Integer.valueOf(datos[6])));
                    }

                }
            }   
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (null != fr) {
                    fr.close();
                }
            }catch(Exception a){
                a.printStackTrace();
            }
        }
        return medicamentos;
    }
    
    public static void escritura(String busqueda){
        FileWriter txt = null;
        PrintWriter pw = null;
        try
        {
            txt = new FileWriter("C:\\Users\\Diego\\Desktop\\Medicamentos\\BD.txt");
            pw = new PrintWriter(txt);
            pw.println("asd");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != txt)
              txt.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }

}