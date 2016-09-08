/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Adm
 */
public class HomeController implements Initializable {
    @FXML
    private AnchorPane anchorpr;
    
    @FXML
    private Button bt1;
    
    @FXML
    private Button bt2;
    
    @FXML
    private Button bt3;
    
    @FXML
    private Button bt4;
    
    @FXML
    private Button bt5;
    
    @FXML
    private Button bt6;
    
    @FXML
    private Button bt7;
    
    @FXML
    private Button bt8;
    
    @FXML
    private Button bt9;
    
    @FXML
    private Button bt10;
    
    @FXML
    private Button bt11;
    
    @FXML
    private Button bt12;
    
    @FXML
    private Button bt13;
    
    @FXML
    private Button bt14;
    
    @FXML
    private Button bt15;
    
    @FXML
    private Button bt16;
    
    @FXML
    private Button bt17;
    
    @FXML
    private Button bt18;
    
    @FXML
    private Label lbpoke;
    
    @FXML
    private StackPane stackpr;
    
    public Node getNode(String node){
        Node no = null;
        try {
            no = FXMLLoader.load(getClass().getResource(node));
        } catch (Exception e) {
        }
        return no;
    }
    
    @FXML
    void insetos(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/Inseto.fxml"));
    }
    
    @FXML
    void dragao(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/DRAGAO.fxml"));
    }
    
    @FXML
    void fada(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/Fada.fxml"));
    }
    
    @FXML
    void fogo(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/Fogo.fxml"));
    }
    
    @FXML
    void fantasma(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/FANTASMA.fxml"));
    }
    
    @FXML
    void terra(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/TERRA.fxml"));
    }
    
    @FXML
    void normal(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/Normal.fxml"));
    }
    
    @FXML
    void psiquico(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/PSIQUICO.fxml"));
    }
    
    @FXML
    void aco(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/Aco.fxml"));
    }
    
    @FXML
    void noturno(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/Noturno.fxml"));
    }
    
    @FXML
    void eletrico(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/Eletricos.fxml"));
    }
    
    @FXML
    void lutador(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/Lutador.fxml"));
    }
    
    @FXML
    void voador(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/VOADOR.fxml"));
    }
    
    @FXML
    void grama(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/GRAMA.fxml"));
    }
    
    @FXML
    void gelo(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/GELO.fxml"));
    }
    
    @FXML
    void veneno(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/Veneno.fxml"));
    }
    
    @FXML
    void pedra(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/Pedra.fxml"));
    }
    
    @FXML
    void agua(){
        lbpoke.setVisible(false);
        
        stackpr.getChildren().clear();
        stackpr.getChildren().add(getNode("/View/AGUA.fxml"));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
