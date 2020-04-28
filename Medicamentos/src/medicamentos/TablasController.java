/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicamentos;
import Elementos.Liquido;
import Elementos.Medicamento;
import Elementos.Pastilla;
import Utiles.AccionesBD;
import Utiles.Cargar;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Diego
 */
public class TablasController implements Initializable {
    @FXML
    private AnchorPane root;
    @FXML
    private TableView tabla;
    @FXML
    private TableColumn nombre;
    @FXML
    private TableColumn costo;
    @FXML
    private TableColumn direccion;
    @FXML
    private TableColumn franquicia;
    @FXML
    private TableColumn telefono;
    @FXML
    private TableColumn ml;
    @FXML
    private TableColumn pastilla;
    private ObservableList<Medicamento> lista =FXCollections.observableArrayList();
    private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        medicamentos = AccionesBD.lectura();
        nombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        costo.setCellValueFactory(new PropertyValueFactory("costo"));
        direccion.setCellValueFactory(new PropertyValueFactory("direccion"));
        franquicia.setCellValueFactory(new PropertyValueFactory("franquicia"));
        telefono.setCellValueFactory(new PropertyValueFactory("telefono"));
        ml.setCellValueFactory(new PropertyValueFactory("ml"));
        pastilla.setCellValueFactory(new PropertyValueFactory("cantPastilla"));
        
        for (int i = 0; i < medicamentos.size(); i++) {
            lista.add(medicamentos.get(i));
        }

        tabla.setItems(lista);
    }    
    
    public void volver(){
        Cargar.CargarVista(root, getClass().getResource("Principal.fxml"));
    }
}
