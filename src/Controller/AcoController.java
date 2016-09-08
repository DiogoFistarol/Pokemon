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
public class AcoController implements Initializable {
    
    @FXML
    private StackPane stack;
    
    @FXML
    private Button button1;
    
    @FXML
    private ListView listv1;
    
    @FXML
    private Label lbesp;
    
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
        Treinador aco = new Treinador();
        aco.setNome("Cynthia");
        aco.setApelido("Cynthia");
        aco.setPeso("60 kg");
        aco.setIdade("17 Anos");

        Pokemons registeel  = new Pokemons(aco);
        registeel.setNome("Registeel");
        registeel.setAltura("1.9 m");
        registeel.setPeso("205.0 kg");
        registeel.setFraqueza("Fighting, Fire e Ground");
        registeel.setTrainer("Cynthia");

        lb1.setText(String.valueOf(registeel.getNome()));
        lb2.setText(String.valueOf(registeel.getAltura()));
        lb3.setText(String.valueOf(registeel.getPeso()));
        lb4.setText(String.valueOf(registeel.getFraqueza()));
        lb5.setText(String.valueOf(registeel.getTrainer()));

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
        
        lbesp.setVisible(false);
        }
        
    @FXML
    private void touch2(ActionEvent event){
        Treinador aco = new Treinador();
        aco.setNome("Cynthia");
        aco.setApelido("Cynthia");
        aco.setPeso("60 kg");
        aco.setIdade("17 Anos");
        
        Pokemons dialga  = new Pokemons(aco);
        dialga.setNome("Dialga");
        dialga.setAltura("5.4 m");
        dialga.setPeso("683.0 kg");
        dialga.setFraqueza("Fighting, Fire e Ground");
        dialga.setTrainer("Marshal");
        
        lb1.setText(String.valueOf(dialga.getNome()));
        lb2.setText(String.valueOf(dialga.getAltura()));
        lb3.setText(String.valueOf(dialga.getPeso()));
        lb4.setText(String.valueOf(dialga.getFraqueza()));
        lb5.setText(String.valueOf(dialga.getTrainer()));
        lbesp.setVisible(true);
        lbesp.setText("Especial:  Pokemon de dois tipos");
        
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
        Treinador aco = new Treinador();
        aco.setNome("Cynthia");
        aco.setApelido("Cynthia");
        aco.setPeso("60 kg");
        aco.setIdade("17 Anos");
        
        Pokemons klink  = new Pokemons(aco);
        klink.setNome("Klink");
        klink.setAltura("0.3 m");
        klink.setPeso("21.0 kg");
        klink.setFraqueza("Fighting, Fire e Ground");
        klink.setTrainer("Cynthia");
        
        lb1.setText(String.valueOf(klink.getNome()));
        lb2.setText(String.valueOf(klink.getAltura()));
        lb3.setText(String.valueOf(klink.getPeso()));
        lb4.setText(String.valueOf(klink.getFraqueza()));
        lb5.setText(String.valueOf(klink.getTrainer()));
        
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
        
        lbesp.setVisible(false);
    }
        
    @FXML
    private void touch4(ActionEvent event){
        Treinador aco = new Treinador();
        aco.setNome("Cynthia");
        aco.setApelido("Cynthia");
        aco.setPeso("60 kg");
        aco.setIdade("17 Anos");
        
        Pokemons klang  = new Pokemons(aco);
        klang.setNome("Klang");
        klang.setAltura("0.6 m");
        klang.setPeso("51.0 kg");
        klang.setFraqueza("Fighting, Fire e Ground");
        klang.setTrainer("Cynthia");
        
        lb1.setText(String.valueOf(klang.getNome()));
        lb2.setText(String.valueOf(klang.getAltura()));
        lb3.setText(String.valueOf(klang.getPeso()));
        lb4.setText(String.valueOf(klang.getFraqueza()));
        lb5.setText(String.valueOf(klang.getTrainer()));
        
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
        
        lbesp.setVisible(false);
    }
        
    @FXML
    private void touch5(ActionEvent event){
        Treinador aco = new Treinador();
        aco.setNome("Cynthia");
        aco.setApelido("Cynthia");
        aco.setPeso("60 kg");
        aco.setIdade("17 Anos");
        
        Pokemons klinklang = new Pokemons(aco);
        klinklang.setNome("Klinklang");
        klinklang.setAltura("0.6 m");
        klinklang.setPeso("81.0 kg");
        klinklang.setFraqueza("Fighting, Fire e Ground");
        klinklang.setTrainer("Cynthia");
        
        lb1.setText(String.valueOf(klinklang.getNome()));
        lb2.setText(String.valueOf(klinklang.getAltura()));
        lb3.setText(String.valueOf(klinklang.getPeso()));
        lb4.setText(String.valueOf(klinklang.getFraqueza()));
        lb5.setText(String.valueOf(klinklang.getTrainer()));
        
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
        
        lbesp.setVisible(false);
    }
        
    @FXML
    private void handleButtonAction(ActionEvent event){
        Treinador aco = new Treinador();
        aco.setNome("Cynthia");
        aco.setApelido("Cynthia");
        aco.setPeso("60 kg");
        aco.setIdade("17 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(aco.getNome()));
        lb7.setText(String.valueOf(aco.getApelido()));
        lb8.setText(String.valueOf(aco.getPeso()));
        lb9.setText(String.valueOf(aco.getIdade()));
        
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
        
        lbesp.setVisible(false);
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
        
        lbesp.setVisible(false);
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
