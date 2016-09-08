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
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import pokemon.Pokemons;
import pokemon.Treinador;

/**
 * FXML Controller class
 *
 * @author SARA
 */
public class AGUAController implements Initializable {

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
    private void poke009(ActionEvent event) {
        Treinador agua = new Treinador();
        agua.setNome("Siebold");
        agua.setApelido("Elite 4 Siebold");
        agua.setPeso("80 kg");
        agua.setIdade("17 Anos");
        
        Pokemons p009 = new Pokemons(agua);
        p009.setNome("Blastoise");
        p009.setAltura("1.6 m");
        p009.setPeso("85.5 kg");
        p009.setFraqueza("Electric, Grass");
        p009.setTrainer("Siebold");

        lb1.setText(String.valueOf(p009.getNome()));
        lb2.setText(String.valueOf(p009.getAltura()));
        lb3.setText(String.valueOf(p009.getPeso()));
        lb4.setText(String.valueOf(p009.getFraqueza()));
        lb5.setText(String.valueOf(p009.getTrainer()));

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
    private void poke055(ActionEvent event){
        Treinador agua = new Treinador();
        agua.setNome("Siebold");
        agua.setApelido("Elite 4 Siebold");
        agua.setPeso("80 kg");
        agua.setIdade("17 Anos");
        
        Pokemons p055  = new Pokemons(agua);
        p055.setNome("Golduck");
        p055.setAltura("1.7 m");
        p055.setPeso("76.6 kg");
        p055.setFraqueza("Grass, Electric");
        p055.setTrainer("Siebold");
        
        lb1.setText(String.valueOf(p055.getNome()));
        lb2.setText(String.valueOf(p055.getAltura()));
        lb3.setText(String.valueOf(p055.getPeso()));
        lb4.setText(String.valueOf(p055.getFraqueza()));
        lb5.setText(String.valueOf(p055.getTrainer()));
        
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
    private void poke099(ActionEvent event){
        Treinador agua = new Treinador();
        agua.setNome("Siebold");
        agua.setApelido("Elite 4 Siebold");
        agua.setPeso("80 kg");
        agua.setIdade("17 Anos");
        
        Pokemons p099  = new Pokemons(agua);
        p099.setNome("Kingler");
        p099.setAltura("1.3 m");
        p099.setPeso("60.0 kg");
        p099.setFraqueza("Grass, Electric");
        p099.setTrainer("Siebold");
        
        lb1.setText(String.valueOf(p099.getNome()));
        lb2.setText(String.valueOf(p099.getAltura()));
        lb3.setText(String.valueOf(p099.getPeso()));
        lb4.setText(String.valueOf(p099.getFraqueza()));
        lb5.setText(String.valueOf(p099.getTrainer()));
        
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
    private void poke134(ActionEvent event){
        Treinador agua = new Treinador();
        agua.setNome("Siebold");
        agua.setApelido("Elite 4 Siebold");
        agua.setPeso("80 kg");
        agua.setIdade("17 Anos");
        
        Pokemons p134  = new Pokemons(agua);
        p134.setNome("Vaporeon");
        p134.setAltura("1.0 m");
        p134.setPeso("29.0 kg");
        p134.setFraqueza("Grass, Electric");
        p134.setTrainer("Siebold");
        
        lb1.setText(String.valueOf(p134.getNome()));
        lb2.setText(String.valueOf(p134.getAltura()));
        lb3.setText(String.valueOf(p134.getPeso()));
        lb4.setText(String.valueOf(p134.getFraqueza()));
        lb5.setText(String.valueOf(p134.getTrainer()));
        
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
     private void poke245(ActionEvent event){
        Treinador agua = new Treinador();
        agua.setNome("Siebold");
        agua.setApelido("Elite 4 Siebold");
        agua.setPeso("80 kg");
        agua.setIdade("17 Anos");
        
        Pokemons p245 = new Pokemons(agua);
        p245.setNome("Suicune");
        p245.setAltura("2.0 m");
        p245.setPeso("187.0 kg");
        p245.setFraqueza("Grass, Electric");
        p245.setTrainer("Siebold");
        
        lb1.setText(String.valueOf(p245.getNome()));
        lb2.setText(String.valueOf(p245.getAltura()));
        lb3.setText(String.valueOf(p245.getPeso()));
        lb4.setText(String.valueOf(p245.getFraqueza()));
        lb5.setText(String.valueOf(p245.getTrainer()));
        
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
        Treinador agua = new Treinador();
        agua.setNome("Siebold");
        agua.setApelido("Elite 4 Siebold");
        agua.setPeso("80 kg");
        agua.setIdade("17 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(agua.getNome()));
        lb7.setText(String.valueOf(agua.getApelido()));
        lb8.setText(String.valueOf(agua.getPeso()));
        lb9.setText(String.valueOf(agua.getIdade()));
        
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
