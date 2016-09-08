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
public class VOADORController implements Initializable {
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
    private void poke012(ActionEvent event) {
        Treinador voa = new Treinador();
        voa.setNome("Grimsley");
        voa.setApelido("Elite 4 Grimsley");
        voa.setPeso("77 kg");
        voa.setIdade("18 Anos");
        
        Pokemons p012 = new Pokemons(voa);
        p012.setNome("Butterfree");
        p012.setAltura("1.1 m");
        p012.setPeso("32.0 kg");
        p012.setFraqueza("Rock, Electric, Fire, Flying, Ice");
        p012.setTrainer("Grimsley");

        lb1.setText(String.valueOf(p012.getNome()));
        lb2.setText(String.valueOf(p012.getAltura()));
        lb3.setText(String.valueOf(p012.getPeso()));
        lb4.setText(String.valueOf(p012.getFraqueza()));
        lb5.setText(String.valueOf(p012.getTrainer()));

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
    private void poke016(ActionEvent event){
        Treinador voa = new Treinador();
        voa.setNome("Grimsley");
        voa.setApelido("Elite 4 Grimsley");
        voa.setPeso("77 kg");
        voa.setIdade("18 Anos");
        
        Pokemons p016  = new Pokemons(voa);
        p016.setNome("Pidgey");
        p016.setAltura("0.3 m");
        p016.setPeso("1.8 kg");
        p016.setFraqueza("Rock, Ice, Electric");
        p016.setTrainer("Grimsley");
        
        lb1.setText(String.valueOf(p016.getNome()));
        lb2.setText(String.valueOf(p016.getAltura()));
        lb3.setText(String.valueOf(p016.getPeso()));
        lb4.setText(String.valueOf(p016.getFraqueza()));
        lb5.setText(String.valueOf(p016.getTrainer()));
        
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
    private void poke021(ActionEvent event){
        Treinador voa = new Treinador();
        voa.setNome("Grimsley");
        voa.setApelido("Elite 4 Grimsley");
        voa.setPeso("77 kg");
        voa.setIdade("18 Anos");
        
        Pokemons p021  = new Pokemons(voa);
        p021.setNome("Spearow");
        p021.setAltura("0.3 m");
        p021.setPeso("2.0 kg");
        p021.setFraqueza("Electric, Ice, Rock");
        p021.setTrainer("Grimsley");
        
        lb1.setText(String.valueOf(p021.getNome()));
        lb2.setText(String.valueOf(p021.getAltura()));
        lb3.setText(String.valueOf(p021.getPeso()));
        lb4.setText(String.valueOf(p021.getFraqueza()));
        lb5.setText(String.valueOf(p021.getTrainer()));
        
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
    private void poke018(ActionEvent event){
        Treinador voa = new Treinador();
        voa.setNome("Grimsley");
        voa.setApelido("Elite 4 Grimsley");
        voa.setPeso("77 kg");
        voa.setIdade("18 Anos");
        
        Pokemons p018  = new Pokemons(voa);
        p018.setNome("Pidgeot");
        p018.setAltura("1.5 m");
        p018.setPeso("39.5 kg");
        p018.setFraqueza("Electric, Ice, Rock");
        p018.setTrainer("Grimsley");
        
        lb1.setText(String.valueOf(p018.getNome()));
        lb2.setText(String.valueOf(p018.getAltura()));
        lb3.setText(String.valueOf(p018.getPeso()));
        lb4.setText(String.valueOf(p018.getFraqueza()));
        lb5.setText(String.valueOf(p018.getTrainer()));
        
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
    private void poke022(ActionEvent event){
        Treinador voa = new Treinador();
        voa.setNome("Grimsley");
        voa.setApelido("Elite 4 Grimsley");
        voa.setPeso("77 kg");
        voa.setIdade("18 Anos");
        
        Pokemons p022 = new Pokemons(voa);
        p022.setNome("Fearow");
        p022.setAltura("1.2 m");
        p022.setPeso("38.0 kg");
        p022.setFraqueza("Electric, Ice, Rock");
        p022.setTrainer("Grimsley");
        
        lb1.setText(String.valueOf(p022.getNome()));
        lb2.setText(String.valueOf(p022.getAltura()));
        lb3.setText(String.valueOf(p022.getPeso()));
        lb4.setText(String.valueOf(p022.getFraqueza()));
        lb5.setText(String.valueOf(p022.getTrainer()));
        
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
        Treinador voa = new Treinador();
        voa.setNome("Grimsley");
        voa.setApelido("Elite 4 Grimsley");
        voa.setPeso("77 kg");
        voa.setIdade("18 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(voa.getNome()));
        lb7.setText(String.valueOf(voa.getApelido()));
        lb8.setText(String.valueOf(voa.getPeso()));
        lb9.setText(String.valueOf(voa.getIdade()));
        
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
