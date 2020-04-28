/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Diego
 */
public class Cargar {
    static public void CargarVista(Pane viewRoot, URL resource){
        Stage stage = (Stage) viewRoot.getScene().getWindow();
        Parent root=null;        
        try {
            root = FXMLLoader.load(resource);
        } catch (IOException ex) {
            System.out.println("No se puede cargar la vista "+resource.toString());
            Logger.getLogger(Cargar.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root);    
        stage.setScene(scene);

    }
    
    static public void cargarVistaEncima(Pane viewRoot, URL resource,
            String nombreVentana) throws IOException{
                //FXMLLoader.load(resource);
                Parent root1 = (Parent) FXMLLoader.load(resource);
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setTitle(nombreVentana);
                stage.setScene(new Scene(root1));  
                stage.show();  
    }
}

