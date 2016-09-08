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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import pokemon.Pokemons;
import pokemon.Treinador;

/**
 * FXML Controller class
 *
 * @author SARA
 */
public class DRAGAOController implements Initializable {
    @FXML
    private StackPane stack;

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
    private Label tit;

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
    private void poke148(ActionEvent event) {
        Treinador drag = new Treinador();
        drag.setNome("Lance");
        drag.setApelido("Elite 4 Lance");
        drag.setPeso("85 kg");
        drag.setIdade("17 Anos");
        
        Pokemons p148 = new Pokemons(drag);
        p148.setNome("Dragonair");
        p148.setAltura("4.0 m");
        p148.setPeso("16.5 kg");
        p148.setFraqueza("Dragon, Ice, Fairy");
        p148.setTrainer("Lance");

        lb1.setText(String.valueOf(p148.getNome()));
        lb2.setText(String.valueOf(p148.getAltura()));
        lb3.setText(String.valueOf(p148.getPeso()));
        lb4.setText(String.valueOf(p148.getFraqueza()));
        lb5.setText(String.valueOf(p148.getTrainer()));

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
    private void poke371(ActionEvent event){
        Treinador drag = new Treinador();
        drag.setNome("Lance");
        drag.setApelido("Elite 4 Lance");
        drag.setPeso("85 kg");
        drag.setIdade("17 Anos");
        
        Pokemons p371 = new Pokemons(drag);
        p371.setNome("Bagon");
        p371.setAltura("0.6 m");
        p371.setPeso("42.1 kg");
        p371.setFraqueza("Dragon, Ice, Fairy");
        p371.setTrainer("Lance");
        
        lb1.setText(String.valueOf(p371.getNome()));
        lb2.setText(String.valueOf(p371.getAltura()));
        lb3.setText(String.valueOf(p371.getPeso()));
        lb4.setText(String.valueOf(p371.getFraqueza()));
        lb5.setText(String.valueOf(p371.getTrainer()));
        
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
    private void poke610(ActionEvent event){
        Treinador drag = new Treinador();
        drag.setNome("Lance");
        drag.setApelido("Elite 4 Lance");
        drag.setPeso("85 kg");
        drag.setIdade("17 Anos");
        
        Pokemons p610 = new Pokemons(drag);
        p610.setNome("Axew");
        p610.setAltura("0.6 m");
        p610.setPeso("18.0 kg");
        p610.setFraqueza("Dragon, Ice, Fairy");
        p610.setTrainer("Lance");
        
        lb1.setText(String.valueOf(p610.getNome()));
        lb2.setText(String.valueOf(p610.getAltura()));
        lb3.setText(String.valueOf(p610.getPeso()));
        lb4.setText(String.valueOf(p610.getFraqueza()));
        lb5.setText(String.valueOf(p610.getTrainer()));
        
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
    private void poke612(ActionEvent event){
        Treinador drag = new Treinador();
        drag.setNome("Lance");
        drag.setApelido("Elite 4 Lance");
        drag.setPeso("85 kg");
        drag.setIdade("17 Anos");
        
        Pokemons p612  = new Pokemons(drag);
        p612.setNome("Haxorus");
        p612.setAltura("105.5 m");
        p612.setPeso("105.5 kg");
        p612.setFraqueza("Dragon, Ice, Fairy");
        p612.setTrainer("Lance");
        
        lb1.setText(String.valueOf(p612.getNome()));
        lb2.setText(String.valueOf(p612.getAltura()));
        lb3.setText(String.valueOf(p612.getPeso()));
        lb4.setText(String.valueOf(p612.getFraqueza()));
        lb5.setText(String.valueOf(p612.getTrainer()));
        
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
    private void poke621(ActionEvent event){
        Treinador drag = new Treinador();
        drag.setNome("Lance");
        drag.setApelido("Elite 4 Lance");
        drag.setPeso("85 kg");
        drag.setIdade("17 Anos");
         
        Pokemons p621 = new Pokemons(drag);
        p621.setNome("Druddigon");
        p621.setAltura("1.6 m");
        p621.setPeso("139.0 kg");
        p621.setFraqueza("Ice, Dragon, Fairy");
        p621.setTrainer("Lance");
        
        lb1.setText(String.valueOf(p621.getNome()));
        lb2.setText(String.valueOf(p621.getAltura()));
        lb3.setText(String.valueOf(p621.getPeso()));
        lb4.setText(String.valueOf(p621.getFraqueza()));
        lb5.setText(String.valueOf(p621.getTrainer()));
        
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
        Treinador drag = new Treinador();
        drag.setNome("Lance");
        drag.setApelido("Elite 4 Lance");
        drag.setPeso("85 kg");
        drag.setIdade("17 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(drag.getNome()));
        lb7.setText(String.valueOf(drag.getApelido()));
        lb8.setText(String.valueOf(drag.getPeso()));
        lb9.setText(String.valueOf(drag.getIdade()));
        
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
        
        tit.setVisible(false);
        
        stack.getChildren().clear();
        stack.getChildren().add(getNode("/View/Home.fxml"));
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
        tit.setVisible(true);

    }
}
