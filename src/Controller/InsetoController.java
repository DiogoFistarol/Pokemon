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

public class InsetoController implements Initializable {
    
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
        Treinador ins = new Treinador();
        ins.setNome("Aaron");
        ins.setApelido("Elite 4 Aaron");
        ins.setPeso("60 kg");
        ins.setIdade("16 Anos");

        Pokemons caterpie  = new Pokemons(ins);
        caterpie.setNome("Caterpie");
        caterpie.setAltura("0.3 m");
        caterpie.setPeso("2.9 kg");
        caterpie.setFraqueza("Fire, Flying e Rock");
        caterpie.setTrainer("Aaron");

        lb1.setText(String.valueOf(caterpie.getNome()));
        lb2.setText(String.valueOf(caterpie.getAltura()));
        lb3.setText(String.valueOf(caterpie.getPeso()));
        lb4.setText(String.valueOf(caterpie.getFraqueza()));
        lb5.setText(String.valueOf(caterpie.getTrainer()));

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
        Treinador ins = new Treinador();
        ins.setNome("Aaron");
        ins.setApelido("Elite 4 Aaron");
        ins.setPeso("60 kg");
        ins.setIdade("16 Anos");
        
        Pokemons pinsir  = new Pokemons(ins);
        pinsir.setNome("Pinsir");
        pinsir.setAltura("1.5 m");
        pinsir.setPeso("55.0 kg");
        pinsir.setFraqueza("Flying, Psychic e Fairy");
        pinsir.setTrainer("Aaron");
        
        lb1.setText(String.valueOf(pinsir.getNome()));
        lb2.setText(String.valueOf(pinsir.getAltura()));
        lb3.setText(String.valueOf(pinsir.getPeso()));
        lb4.setText(String.valueOf(pinsir.getFraqueza()));
        lb5.setText(String.valueOf(pinsir.getTrainer()));
        
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
        Treinador ins = new Treinador();
        ins.setNome("Aaron");
        ins.setApelido("Elite 4 Aaron");
        ins.setPeso("60 kg");
        ins.setIdade("16 Anos");
        
        Pokemons pineco  = new Pokemons(ins);
        pineco.setNome("Pineco");
        pineco.setAltura("0.6 m");
        pineco.setPeso("7.2 kg");
        pineco.setFraqueza("Flying, Psychic e Fairy");
        pineco.setTrainer("Aaron");
        
        lb1.setText(String.valueOf(pineco.getNome()));
        lb2.setText(String.valueOf(pineco.getAltura()));
        lb3.setText(String.valueOf(pineco.getPeso()));
        lb4.setText(String.valueOf(pineco.getFraqueza()));
        lb5.setText(String.valueOf(pineco.getTrainer()));
        
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
        Treinador ins = new Treinador();
        ins.setNome("Aaron");
        ins.setApelido("Elite 4 Aaron");
        ins.setPeso("60 kg");
        ins.setIdade("16 Anos");
        
        Pokemons illumise  = new Pokemons(ins);
        illumise.setNome("Illumise");
        illumise.setAltura("0.6 m");
        illumise.setPeso("17.7 kg");
        illumise.setFraqueza("Flying, Psychic e Fairy");
        illumise.setTrainer("Aaron");
        
        lb1.setText(String.valueOf(illumise.getNome()));
        lb2.setText(String.valueOf(illumise.getAltura()));
        lb3.setText(String.valueOf(illumise.getPeso()));
        lb4.setText(String.valueOf(illumise.getFraqueza()));
        lb5.setText(String.valueOf(illumise.getTrainer()));
        
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
        Treinador ins = new Treinador();
        ins.setNome("Aaron");
        ins.setApelido("Elite 4 Aaron");
        ins.setPeso("60 kg");
        ins.setIdade("16 Anos");
        
        Pokemons accelgor = new Pokemons(ins);
        accelgor.setNome("Accelgor");
        accelgor.setAltura("0.8 m");
        accelgor.setPeso("25.3 kg");
        accelgor.setFraqueza("Flying, Psychic e Fairy");
        accelgor.setTrainer("Aaron");
        
        lb1.setText(String.valueOf(accelgor.getNome()));
        lb2.setText(String.valueOf(accelgor.getAltura()));
        lb3.setText(String.valueOf(accelgor.getPeso()));
        lb4.setText(String.valueOf(accelgor.getFraqueza()));
        lb5.setText(String.valueOf(accelgor.getTrainer()));
        
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
        Treinador ins = new Treinador();
        ins.setNome("Aaron");
        ins.setApelido("Elite 4 Aaron");
        ins.setPeso("60 kg");
        ins.setIdade("16 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(ins.getNome()));
        lb7.setText(String.valueOf(ins.getApelido()));
        lb8.setText(String.valueOf(ins.getPeso()));
        lb9.setText(String.valueOf(ins.getIdade()));
        
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
