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
public class GRAMAController implements Initializable {

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
    private void poke114(ActionEvent event) {
        Treinador gram = new Treinador();
        gram.setNome("Caitlin");
        gram.setApelido("Elite 4 Caitlin");
        gram.setPeso("70 kg");
        gram.setIdade("20 Anos");
        
        Pokemons p114 = new Pokemons(gram);
        p114.setNome("Tangela");
        p114.setAltura("1.0 m");
        p114.setPeso("35.0 kg");
        p114.setFraqueza("Bug, Fire, Flying, Ice, Poison");
        p114.setTrainer("Caitlin");

        lb1.setText(String.valueOf(p114.getNome()));
        lb2.setText(String.valueOf(p114.getAltura()));
        lb3.setText(String.valueOf(p114.getPeso()));
        lb4.setText(String.valueOf(p114.getFraqueza()));
        lb5.setText(String.valueOf(p114.getTrainer()));

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
    private void poke152(ActionEvent event){
        Treinador gram = new Treinador();
        gram.setNome("Caitlin");
        gram.setApelido("Elite 4 Caitlin");
        gram.setPeso("70 kg");
        gram.setIdade("20 Anos");
        
        Pokemons p152  = new Pokemons(gram);
        p152.setNome("Chikorita");
        p152.setAltura("0.9 m");
        p152.setPeso("6.4 kg");
        p152.setFraqueza("Bug, Fire, Flying, Ice, Poison");
        p152.setTrainer("Caitlin");
        
        lb1.setText(String.valueOf(p152.getNome()));
        lb2.setText(String.valueOf(p152.getAltura()));
        lb3.setText(String.valueOf(p152.getPeso()));
        lb4.setText(String.valueOf(p152.getFraqueza()));
        lb5.setText(String.valueOf(p152.getTrainer()));
        
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
    private void poke153(ActionEvent event){
        Treinador gram = new Treinador();
        gram.setNome("Caitlin");
        gram.setApelido("Elite 4 Caitlin");
        gram.setPeso("70 kg");
        gram.setIdade("20 Anos");
        
        Pokemons p153  = new Pokemons(gram);
        p153.setNome("Bayleef");
        p153.setAltura("1.2 m");
        p153.setPeso("15.8 kg");
        p153.setFraqueza("Bug, Fire, Flying, Ice, Poison");
        p153.setTrainer("Caitlin");
        
        lb1.setText(String.valueOf(p153.getNome()));
        lb2.setText(String.valueOf(p153.getAltura()));
        lb3.setText(String.valueOf(p153.getPeso()));
        lb4.setText(String.valueOf(p153.getFraqueza()));
        lb5.setText(String.valueOf(p153.getTrainer()));
        
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
    private void poke254(ActionEvent event){
        Treinador gram = new Treinador();
        gram.setNome("Caitlin");
        gram.setApelido("Elite 4 Caitlin");
        gram.setPeso("70 kg");
        gram.setIdade("20 Anos");
        
        Pokemons p254  = new Pokemons(gram);
        p254.setNome("Sceptile");
        p254.setAltura("1.7 m");
        p254.setPeso("52.2 kg");
        p254.setFraqueza("Bug, Fire, Flying, Ice, Poison");
        p254.setTrainer("Caitlin");
        
        lb1.setText(String.valueOf(p254.getNome()));
        lb2.setText(String.valueOf(p254.getAltura()));
        lb3.setText(String.valueOf(p254.getPeso()));
        lb4.setText(String.valueOf(p254.getFraqueza()));
        lb5.setText(String.valueOf(p254.getTrainer()));
        
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
    private void poke388(ActionEvent event){
        Treinador gram = new Treinador();
        gram.setNome("Caitlin");
        gram.setApelido("Elite 4 Caitlin");
        gram.setPeso("70 kg");
        gram.setIdade("20 Anos");
        
        Pokemons p388 = new Pokemons(gram);
        p388.setNome("Grotle");
        p388.setAltura("1.1 m");
        p388.setPeso("97.0 kg");
        p388.setFraqueza("Bug, Fire, Flying, Ice, Poison");
        p388.setTrainer("Caitlin");
        
        lb1.setText(String.valueOf(p388.getNome()));
        lb2.setText(String.valueOf(p388.getAltura()));
        lb3.setText(String.valueOf(p388.getPeso()));
        lb4.setText(String.valueOf(p388.getFraqueza()));
        lb5.setText(String.valueOf(p388.getTrainer()));
        
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
        Treinador gram = new Treinador();
        gram.setNome("Caitlin");
        gram.setApelido("Elite 4 Caitlin");
        gram.setPeso("70 kg");
        gram.setIdade("20 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(gram.getNome()));
        lb7.setText(String.valueOf(gram.getApelido()));
        lb8.setText(String.valueOf(gram.getPeso()));
        lb9.setText(String.valueOf(gram.getIdade()));
        
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
