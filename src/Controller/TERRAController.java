/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import pokemon.Pokemons;
import pokemon.Treinador;

/**
 * FXML Controller class
 *
 * @author SARA
 */
public class TERRAController implements Initializable {

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
    private void poke028(ActionEvent event) {
        Treinador ter = new Treinador();
        ter.setNome("Bertha");
        ter.setApelido("Elite 4 Bertha");
        ter.setPeso("80 kg");
        ter.setIdade("77 Anos");
        
        Pokemons p028 = new Pokemons(ter);
        p028.setNome("Sandslash");
        p028.setAltura("1.0 m");
        p028.setPeso("29.5 kg");
        p028.setFraqueza("Ice, Grass, Water");
        p028.setTrainer("Bertha");

        lb1.setText(String.valueOf(p028.getNome()));
        lb2.setText(String.valueOf(p028.getAltura()));
        lb3.setText(String.valueOf(p028.getPeso()));
        lb4.setText(String.valueOf(p028.getFraqueza()));
        lb5.setText(String.valueOf(p028.getTrainer()));

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
    private void poke105(ActionEvent event){
        Treinador ter = new Treinador();
        ter.setNome("Bertha");
        ter.setApelido("Elite 4 Bertha");
        ter.setPeso("80 kg");
        ter.setIdade("77 Anos");
        
        Pokemons p105  = new Pokemons(ter);
        p105.setNome("Marowak");
        p105.setAltura("1.0 m");
        p105.setPeso("45.0 kg");
        p105.setFraqueza("Grass, Ice, Water");
        p105.setTrainer("Bertha");
        
        lb1.setText(String.valueOf(p105.getNome()));
        lb2.setText(String.valueOf(p105.getAltura()));
        lb3.setText(String.valueOf(p105.getPeso()));
        lb4.setText(String.valueOf(p105.getFraqueza()));
        lb5.setText(String.valueOf(p105.getTrainer()));
        
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
    private void poke232(ActionEvent event){
        Treinador ter = new Treinador();
        ter.setNome("Bertha");
        ter.setApelido("Elite 4 Bertha");
        ter.setPeso("80 kg");
        ter.setIdade("77 Anos");
        
        Pokemons p232  = new Pokemons(ter);
        p232.setNome("Donphan");
        p232.setAltura("1.1 m");
        p232.setPeso("120.0 kg");
        p232.setFraqueza("Grass, Ice, Water");
        p232.setTrainer("Bertha");
        
        lb1.setText(String.valueOf(p232.getNome()));
        lb2.setText(String.valueOf(p232.getAltura()));
        lb3.setText(String.valueOf(p232.getPeso()));
        lb4.setText(String.valueOf(p232.getFraqueza()));
        lb5.setText(String.valueOf(p232.getTrainer()));
        
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
    private void poke328(ActionEvent event){
        Treinador ter = new Treinador();
        ter.setNome("Bertha");
        ter.setApelido("Elite 4 Bertha");
        ter.setPeso("80 kg");
        ter.setIdade("77 Anos");
        
        Pokemons p328  = new Pokemons(ter);
        p328.setNome("Trapinch");
        p328.setAltura("0.7 m");
        p328.setPeso("15.0 kg");
        p328.setFraqueza("Grass, Ice, Water");
        p328.setTrainer("Bertha");
        
        lb1.setText(String.valueOf(p328.getNome()));
        lb2.setText(String.valueOf(p328.getAltura()));
        lb3.setText(String.valueOf(p328.getPeso()));
        lb4.setText(String.valueOf(p328.getFraqueza()));
        lb5.setText(String.valueOf(p328.getTrainer()));
        
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
    private void poke383(ActionEvent event){
        Treinador ter = new Treinador();
        ter.setNome("Bertha");
        ter.setApelido("Elite 4 Bertha");
        ter.setPeso("80 kg");
        ter.setIdade("77 Anos");
        
        Pokemons p383 = new Pokemons(ter);
        p383.setNome("Groudon");
        p383.setAltura("3.5 m");
        p383.setPeso("950.0 kg");
        p383.setFraqueza("Grass, Ice, Water");
        p383.setTrainer("Bertha");
        
        lb1.setText(String.valueOf(p383.getNome()));
        lb2.setText(String.valueOf(p383.getAltura()));
        lb3.setText(String.valueOf(p383.getPeso()));
        lb4.setText(String.valueOf(p383.getFraqueza()));
        lb5.setText(String.valueOf(p383.getTrainer()));
        
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
        Treinador ter = new Treinador();
        ter.setNome("Bertha");
        ter.setApelido("Elite 4 Bertha");
        ter.setPeso("80 kg");
        ter.setIdade("77 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(ter.getNome()));
        lb7.setText(String.valueOf(ter.getApelido()));
        lb8.setText(String.valueOf(ter.getPeso()));
        lb9.setText(String.valueOf(ter.getIdade()));
        
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
