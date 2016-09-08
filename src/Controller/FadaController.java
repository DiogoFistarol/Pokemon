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

public class FadaController implements Initializable {
    
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
        Treinador fada = new Treinador();
        fada.setNome("Blue");
        fada.setApelido("Blue");
        fada.setPeso("65 kg");
        fada.setIdade("16 Anos");

        Pokemons clefabe  = new Pokemons(fada);
        clefabe.setNome("Clefabe");
        clefabe.setAltura("1.3 m");
        clefabe.setPeso("40.0 kg");
        clefabe.setFraqueza("Steel e Poison");
        clefabe.setTrainer("Blue");

        lb1.setText(String.valueOf(clefabe.getNome()));
        lb2.setText(String.valueOf(clefabe.getAltura()));
        lb3.setText(String.valueOf(clefabe.getPeso()));
        lb4.setText(String.valueOf(clefabe.getFraqueza()));
        lb5.setText(String.valueOf(clefabe.getTrainer()));

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
        Treinador fada = new Treinador();
        fada.setNome("Blue");
        fada.setApelido("Blue");
        fada.setPeso("65 kg");
        fada.setIdade("16 Anos");
        
        Pokemons cleffa  = new Pokemons(fada);
        cleffa.setNome("Cleffa");
        cleffa.setAltura("0.3 m");
        cleffa.setPeso("3.0 kg");
        cleffa.setFraqueza("Steel e Poison");
        cleffa.setTrainer("Blue");
        
        lb1.setText(String.valueOf(cleffa.getNome()));
        lb2.setText(String.valueOf(cleffa.getAltura()));
        lb3.setText(String.valueOf(cleffa.getPeso()));
        lb4.setText(String.valueOf(cleffa.getFraqueza()));
        lb5.setText(String.valueOf(cleffa.getTrainer()));
        
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
        Treinador fada = new Treinador();
        fada.setNome("Blue");
        fada.setApelido("Blue");
        fada.setPeso("65 kg");
        fada.setIdade("16 Anos");
        
        Pokemons aromatisse  = new Pokemons(fada);
        aromatisse.setNome("Aromatisse");
        aromatisse.setAltura("0.8 m");
        aromatisse.setPeso("15.5 kg");
        aromatisse.setFraqueza("Steel e Poison");
        aromatisse.setTrainer("Blue");
        
        lb1.setText(String.valueOf(aromatisse.getNome()));
        lb2.setText(String.valueOf(aromatisse.getAltura()));
        lb3.setText(String.valueOf(aromatisse.getPeso()));
        lb4.setText(String.valueOf(aromatisse.getFraqueza()));
        lb5.setText(String.valueOf(aromatisse.getTrainer()));
        
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
        Treinador fada = new Treinador();
        fada.setNome("Blue");
        fada.setApelido("Blue");
        fada.setPeso("65 kg");
        fada.setIdade("16 Anos");
        
        Pokemons sylveon  = new Pokemons(fada);
        sylveon.setNome("Sylveon");
        sylveon.setAltura("1.0 m");
        sylveon.setPeso("23.5 kg");
        sylveon.setFraqueza("Steel e Poison");
        sylveon.setTrainer("Blue");
        
        lb1.setText(String.valueOf(sylveon.getNome()));
        lb2.setText(String.valueOf(sylveon.getAltura()));
        lb3.setText(String.valueOf(sylveon.getPeso()));
        lb4.setText(String.valueOf(sylveon.getFraqueza()));
        lb5.setText(String.valueOf(sylveon.getTrainer()));
        
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
        Treinador fada = new Treinador();
        fada.setNome("Blue");
        fada.setApelido("Blue");
        fada.setPeso("65 kg");
        fada.setIdade("16 Anos");
        
        Pokemons xerneas = new Pokemons(fada);
        xerneas.setNome("Xerneas");
        xerneas.setAltura("3.0 m");
        xerneas.setPeso("215.0 kg");
        xerneas.setFraqueza("Steel e Poison");
        xerneas.setTrainer("Blue");
        
        lb1.setText(String.valueOf(xerneas.getNome()));
        lb2.setText(String.valueOf(xerneas.getAltura()));
        lb3.setText(String.valueOf(xerneas.getPeso()));
        lb4.setText(String.valueOf(xerneas.getFraqueza()));
        lb5.setText(String.valueOf(xerneas.getTrainer()));
        
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
        Treinador fada = new Treinador();
        fada.setNome("Blue");
        fada.setApelido("Blue");
        fada.setPeso("65 kg");
        fada.setIdade("16 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(fada.getNome()));
        lb7.setText(String.valueOf(fada.getApelido()));
        lb8.setText(String.valueOf(fada.getPeso()));
        lb9.setText(String.valueOf(fada.getIdade()));
        
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
