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
 * @author Aluno
 */
public class NormalController implements Initializable {
    
    @FXML
    private StackPane stack;
    
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
    private void touch1(ActionEvent event){
        Treinador norm = new Treinador();
        norm.setNome("Red");
        norm.setApelido("Red");
        norm.setPeso("65 kg");
        norm.setIdade("18 Anos");

        Pokemons raticate  = new Pokemons(norm);
        raticate.setNome("Raticate");
        raticate.setAltura("0.7 m");
        raticate.setPeso("18.5 kg");
        raticate.setFraqueza("Fighting");
        raticate.setTrainer("Red");

        lb1.setText(String.valueOf(raticate.getNome()));
        lb2.setText(String.valueOf(raticate.getAltura()));
        lb3.setText(String.valueOf(raticate.getPeso()));
        lb4.setText(String.valueOf(raticate.getFraqueza()));
        lb5.setText(String.valueOf(raticate.getTrainer()));

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
        Treinador norm = new Treinador();
        norm.setNome("Red");
        norm.setApelido("Red");
        norm.setPeso("65 kg");
        norm.setIdade("18 Anos");
        
        Pokemons persian  = new Pokemons(norm);
        persian.setNome("Persian");
        persian.setAltura("1.0 m");
        persian.setPeso("32.0 kg");
        persian.setFraqueza("Fighting");
        persian.setTrainer("Red");
        
        lb1.setText(String.valueOf(persian.getNome()));
        lb2.setText(String.valueOf(persian.getAltura()));
        lb3.setText(String.valueOf(persian.getPeso()));
        lb4.setText(String.valueOf(persian.getFraqueza()));
        lb5.setText(String.valueOf(persian.getTrainer()));
        
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
        Treinador norm = new Treinador();
        norm.setNome("Red");
        norm.setApelido("Red");
        norm.setPeso("65 kg");
        norm.setIdade("18 Anos");
        
        Pokemons lickitung  = new Pokemons(norm);
        lickitung.setNome("Lickitung");
        lickitung.setAltura("1.2 m");
        lickitung.setPeso("65.5 kg");
        lickitung.setFraqueza("Fighting");
        lickitung.setTrainer("Red");
        
        lb1.setText(String.valueOf(lickitung.getNome()));
        lb2.setText(String.valueOf(lickitung.getAltura()));
        lb3.setText(String.valueOf(lickitung.getPeso()));
        lb4.setText(String.valueOf(lickitung.getFraqueza()));
        lb5.setText(String.valueOf(lickitung.getTrainer()));
        
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
        Treinador norm = new Treinador();
        norm.setNome("Red");
        norm.setApelido("Red");
        norm.setPeso("65 kg");
        norm.setIdade("18 Anos");
        
        Pokemons chansey  = new Pokemons(norm);
        chansey.setNome("Chansey");
        chansey.setAltura("1.1 m");
        chansey.setPeso("34.6 kg");
        chansey.setFraqueza("Fighting");
        chansey.setTrainer("Red");
        
        lb1.setText(String.valueOf(chansey.getNome()));
        lb2.setText(String.valueOf(chansey.getAltura()));
        lb3.setText(String.valueOf(chansey.getPeso()));
        lb4.setText(String.valueOf(chansey.getFraqueza()));
        lb5.setText(String.valueOf(chansey.getTrainer()));
        
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
        Treinador norm = new Treinador();
        norm.setNome("Red");
        norm.setApelido("Red");
        norm.setPeso("65 kg");
        norm.setIdade("18 Anos");
        
        Pokemons eevee = new Pokemons(norm);
        eevee.setNome("Eevee");
        eevee.setAltura("0.3 m");
        eevee.setPeso("6.5 kg");
        eevee.setFraqueza("Fighting");
        eevee.setTrainer("Red");
        
        lb1.setText(String.valueOf(eevee.getNome()));
        lb2.setText(String.valueOf(eevee.getAltura()));
        lb3.setText(String.valueOf(eevee.getPeso()));
        lb4.setText(String.valueOf(eevee.getFraqueza()));
        lb5.setText(String.valueOf(eevee.getTrainer()));
        
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
        Treinador norm = new Treinador();
        norm.setNome("Red");
        norm.setApelido("Red");
        norm.setPeso("65 kg");
        norm.setIdade("18 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(norm.getNome()));
        lb7.setText(String.valueOf(norm.getApelido()));
        lb8.setText(String.valueOf(norm.getPeso()));
        lb9.setText(String.valueOf(norm.getIdade()));
        
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
        // TODO
    }    
    
}
