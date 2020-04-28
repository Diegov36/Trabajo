/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicamentos;

import Utiles.Cargar;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Diego
 */
public class PrincipalController implements Initializable {
    public static String busqueda;
    @FXML
    private AnchorPane root;
    @FXML
    private TextField texto;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    public void verTabla(ActionEvent evento){
        busqueda = texto.getText();
        System.out.println(busqueda);
        Cargar.CargarVista(root, getClass().getResource("Tablas.fxml"));
    }
}
