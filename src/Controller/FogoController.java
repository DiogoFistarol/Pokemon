/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import pokemon.Pokemons;
import pokemon.Treinador;

/**
 * FXML Controller class
 *
 * @author Adm
 */
public class FogoController implements Initializable {
    
    @FXML
    private StackPane stack1;
    
    @FXML
    private Button button1;
    
    @FXML
    private ListView listv1;
    
    @FXML
    private Label lb1;
    
    @FXML
    private Label lb2;
    
    @FXML
    private Label lb3;
    
    @FXML
    private Label lb4;
    
    @FXML
    private Label lb5;
    
    @FXML
    private Label lb6;
    
    @FXML
    private Label lb7;
    
    @FXML
    private Label lb8;
    
    @FXML
    private Label lb9;
    
    @FXML
    private Label lb11;
    
    @FXML
    private Label lb21;
    
    @FXML
    private Label lb31;
    
    @FXML
    private Label lb41;
    
    @FXML
    private Label lb51;
    
    @FXML
    private Label lb61;
    
    @FXML
    private Label lb71;
    
    @FXML
    private Label lb81;
    
    @FXML
    private Label lb91;
    
    @FXML
    private Label tit1;
    
    @FXML
    private ImageView image1;
    
    @FXML
    private ImageView image2;
    
    @FXML
    private ImageView image3;
    
    @FXML
    private ImageView image4;
    
    @FXML
    private ImageView image5;
    
    @FXML
    private ImageView image6;
    
    @FXML
    private void touch1(ActionEvent event){
        Treinador val = new Treinador();
        val.setNome("Candela");
        val.setApelido("Leader Can");
        val.setPeso("60 kg");
        val.setIdade("16 Anos");

        Pokemons charmander = new Pokemons(val);
        charmander.setNome("Charmander");
        charmander.setAltura("0.6 m");
        charmander.setPeso("8.5 kg");
        charmander.setFraqueza("Ground, Rock e Water");
        charmander.setTrainer("Candela");

        lb1.setText(String.valueOf(charmander.getNome()));
        lb2.setText(String.valueOf(charmander.getAltura()));
        lb3.setText(String.valueOf(charmander.getPeso()));
        lb4.setText(String.valueOf(charmander.getFraqueza()));
        lb5.setText(String.valueOf(charmander.getTrainer()));

        lb1.setVisible(true);
        lb2.setVisible(true);
        lb3.setVisible(true);
        lb4.setVisible(true);
        lb5.setVisible(true);

        image1.setVisible(true);
            
        lb11.setVisible(true);
        lb21.setVisible(true);
        lb31.setVisible(true);
        lb41.setVisible(true);
        lb51.setVisible(true);
            
        image2.setVisible(false);
        image3.setVisible(false);
        image4.setVisible(false);
        image5.setVisible(false);
        image6.setVisible(false);
            
        lb6.setVisible(false);
        lb7.setVisible(false);
        lb8.setVisible(false);
        lb9.setVisible(false);
        
        lb61.setVisible(false);
        lb71.setVisible(false);
        lb81.setVisible(false);
        lb91.setVisible(false);
        
        listv1.setVisible(true);
        }
        
    @FXML
    private void touch2(ActionEvent event){
        Treinador val = new Treinador();
        val.setNome("Candela");
        val.setApelido("Leader Can");
        val.setPeso("60 kg");
        val.setIdade("16 Anos");
        
        Pokemons arcanine  = new Pokemons(val);
        arcanine.setNome("Arcanine");
        arcanine.setAltura("1.9 m");
        arcanine.setPeso("155.0 kg");
        arcanine.setFraqueza("Ground, Rock e Water");
        arcanine.setTrainer("Candela");
        
        lb1.setText(String.valueOf(arcanine.getNome()));
        lb2.setText(String.valueOf(arcanine.getAltura()));
        lb3.setText(String.valueOf(arcanine.getPeso()));
        lb4.setText(String.valueOf(arcanine.getFraqueza()));
        lb5.setText(String.valueOf(arcanine.getTrainer()));
        
        lb1.setVisible(true);
        lb2.setVisible(true);
        lb3.setVisible(true);
        lb4.setVisible(true);
        lb5.setVisible(true);
        
        image2.setVisible(true);
        lb11.setVisible(true);
        lb21.setVisible(true);
        lb31.setVisible(true);
        lb41.setVisible(true);
        lb51.setVisible(true);
        
        image1.setVisible(false);
        image3.setVisible(false);
        image4.setVisible(false);
        image5.setVisible(false);
        image6.setVisible(false);
        
        lb6.setVisible(false);
        lb7.setVisible(false);
        lb8.setVisible(false);
        lb9.setVisible(false);
        
        lb61.setVisible(false);
        lb71.setVisible(false);
        lb81.setVisible(false);
        lb91.setVisible(false);
        
        listv1.setVisible(true);
    }
       
    @FXML
    private void touch3(ActionEvent event){
        Treinador val = new Treinador();
        val.setNome("Candela");
        val.setApelido("Leader Can");
        val.setPeso("60 kg");
        val.setIdade("16 Anos");
        
        Pokemons rapidash  = new Pokemons(val);
        rapidash.setNome("Rapidash");
        rapidash.setAltura("1.7 m");
        rapidash.setPeso("95.0 kg");
        rapidash.setFraqueza("Ground, Rock e Water");
        rapidash.setTrainer("Candela");
        
        lb1.setText(String.valueOf(rapidash.getNome()));
        lb2.setText(String.valueOf(rapidash.getAltura()));
        lb3.setText(String.valueOf(rapidash.getPeso()));
        lb4.setText(String.valueOf(rapidash.getFraqueza()));
        lb5.setText(String.valueOf(rapidash.getTrainer()));
        
        lb1.setVisible(true);
        lb2.setVisible(true);
        lb3.setVisible(true);
        lb4.setVisible(true);
        lb5.setVisible(true);
            
        image3.setVisible(true);
        lb11.setVisible(true);
        lb21.setVisible(true);
        lb31.setVisible(true);
        lb41.setVisible(true);
        lb51.setVisible(true);
        
        image1.setVisible(false);
        image2.setVisible(false);
        image4.setVisible(false);
        image5.setVisible(false);
        image6.setVisible(false);
        
        lb6.setVisible(false);
        lb7.setVisible(false);
        lb8.setVisible(false);
        lb9.setVisible(false);
        
        lb61.setVisible(false);
        lb71.setVisible(false);
        lb81.setVisible(false);
        lb91.setVisible(false);
        
        listv1.setVisible(true);
    }
        
    @FXML
    private void touch4(ActionEvent event){
        Treinador val = new Treinador();
        val.setNome("Candela");
        val.setApelido("Leader Can");
        val.setPeso("60 kg");
        val.setIdade("16 Anos");
        
        Pokemons typhlosion  = new Pokemons(val);
        typhlosion.setNome("Typhlosion");
        typhlosion.setAltura("1.7 m");
        typhlosion.setPeso("79.5 kg");
        typhlosion.setFraqueza("Ground, Rock e Water");
        typhlosion.setTrainer("Candela");
        
        lb1.setText(String.valueOf(typhlosion.getNome()));
        lb2.setText(String.valueOf(typhlosion.getAltura()));
        lb3.setText(String.valueOf(typhlosion.getPeso()));
        lb4.setText(String.valueOf(typhlosion.getFraqueza()));
        lb5.setText(String.valueOf(typhlosion.getTrainer()));
        
        lb1.setVisible(true);
        lb2.setVisible(true);
        lb3.setVisible(true);
        lb4.setVisible(true);
        lb5.setVisible(true);
            
        image4.setVisible(true);
        lb11.setVisible(true);
        lb21.setVisible(true);
        lb31.setVisible(true);
        lb41.setVisible(true);
        lb51.setVisible(true);
        
        image1.setVisible(false);
        image2.setVisible(false);
        image3.setVisible(false);
        image5.setVisible(false);
        image6.setVisible(false);
        
        lb6.setVisible(false);
        lb7.setVisible(false);
        lb8.setVisible(false);
        lb9.setVisible(false);
        
        lb61.setVisible(false);
        lb71.setVisible(false);
        lb81.setVisible(false);
        lb91.setVisible(false);
        
        listv1.setVisible(true);
    }
        
    @FXML
    private void touch5(ActionEvent event){
        Treinador val = new Treinador();
        val.setNome("Candela");
        val.setApelido("Leader Can");
        val.setPeso("60 kg");
        val.setIdade("16 Anos");
        
        Pokemons entei = new Pokemons(val);
        entei.setNome("Entei");
        entei.setAltura("2.1 m");
        entei.setPeso("198.0 kg");
        entei.setFraqueza("Ground, Rock e Water");
        entei.setTrainer("Candela");
        
        lb1.setText(String.valueOf(entei.getNome()));
        lb2.setText(String.valueOf(entei.getAltura()));
        lb3.setText(String.valueOf(entei.getPeso()));
        lb4.setText(String.valueOf(entei.getFraqueza()));
        lb5.setText(String.valueOf(entei.getTrainer()));
        
        lb1.setVisible(true);
        lb2.setVisible(true);
        lb3.setVisible(true);
        lb4.setVisible(true);
        lb5.setVisible(true); 
        
        image5.setVisible(true);
        lb11.setVisible(true);
        lb21.setVisible(true);
        lb31.setVisible(true);
        lb41.setVisible(true);
        lb51.setVisible(true);
        
        image1.setVisible(false);
        image2.setVisible(false);
        image3.setVisible(false);
        image4.setVisible(false);
        image6.setVisible(false);
        
        lb6.setVisible(false);
        lb7.setVisible(false);
        lb8.setVisible(false);
        lb9.setVisible(false);
        
        lb61.setVisible(false);
        lb71.setVisible(false);
        lb81.setVisible(false);
        lb91.setVisible(false);
        
        listv1.setVisible(true);
    }
        
    @FXML
    private void handleButtonAction(ActionEvent event){
        Treinador val = new Treinador();
        val.setNome("Candela");
        val.setApelido("Leader Can");
        val.setPeso("60 kg");
        val.setIdade("16 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(val.getNome()));
        lb7.setText(String.valueOf(val.getApelido()));
        lb8.setText(String.valueOf(val.getPeso()));
        lb9.setText(String.valueOf(val.getIdade()));
        
        lb6.setVisible(true);
        lb7.setVisible(true);
        lb8.setVisible(true);
        lb9.setVisible(true);
        
        lb61.setVisible(true);
        lb71.setVisible(true);
        lb81.setVisible(true);
        lb91.setVisible(true);
        
        lb1.setVisible(false);
        lb2.setVisible(false);
        lb3.setVisible(false);
        lb4.setVisible(false);
        lb5.setVisible(false);
        lb11.setVisible(false);
        lb21.setVisible(false);
        lb31.setVisible(false);
        lb41.setVisible(false);
        lb51.setVisible(false);
        
        image1.setVisible(false);
        image2.setVisible(false);
        image3.setVisible(false);
        image4.setVisible(false);
        image5.setVisible(false);

    }
    
    @FXML
    void home(){
        lb1.setVisible(false);
        lb2.setVisible(false);
        lb3.setVisible(false);
        lb4.setVisible(false);
        lb5.setVisible(false);
        lb6.setVisible(false);
        lb7.setVisible(false);
        lb8.setVisible(false);
        lb9.setVisible(false);
        lb11.setVisible(false);
        lb21.setVisible(false);
        lb31.setVisible(false);
        lb41.setVisible(false);
        lb51.setVisible(false);
        lb61.setVisible(false);
        lb71.setVisible(false);
        lb81.setVisible(false);
        lb91.setVisible(false);
        
        image1.setVisible(false);
        image2.setVisible(false);
        image3.setVisible(false);
        image4.setVisible(false);
        image5.setVisible(false);
        image6.setVisible(false);
        
        listv1.setVisible(false);
        
        tit1.setVisible(false);
        stack1.getChildren().clear();
        stack1.getChildren().add(getNode("/View/Home.fxml"));
    }
    
    public Node getNode(String node){
        Node no = null;
        try {
            no = FXMLLoader.load(getClass().getResource(node));
        } catch (Exception e) {
        }
        return no;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tit1.setVisible(true);
        
    }    
    
    
}
