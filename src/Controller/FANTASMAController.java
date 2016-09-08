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
public class FANTASMAController implements Initializable {

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
    private void poke200(ActionEvent event) {
        Treinador phant = new Treinador();
        phant.setNome("Agatha");
        phant.setApelido("Elite 4 Agatha");
        phant.setPeso("85 kg");
        phant.setIdade("70 Anos");
        
        Pokemons p200 = new Pokemons(phant);
        p200.setNome("Misdreavus");
        p200.setAltura("0.7 m");
        p200.setPeso("1.0 kg");
        p200.setFraqueza("Dark, Ghost");
        p200.setTrainer("Agatha");

        lb1.setText(String.valueOf(p200.getNome()));
        lb2.setText(String.valueOf(p200.getAltura()));
        lb3.setText(String.valueOf(p200.getPeso()));
        lb4.setText(String.valueOf(p200.getFraqueza()));
        lb5.setText(String.valueOf(p200.getTrainer()));

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
    private void poke354(ActionEvent event){
        Treinador phant = new Treinador();
        phant.setNome("Agatha");
        phant.setApelido("Elite 4 Agatha");
        phant.setPeso("85 kg");
        phant.setIdade("70 Anos");
        
        Pokemons p354 = new Pokemons(phant);
        p354.setNome("Banette");
        p354.setAltura("1.1 m");
        p354.setPeso("12.5 kg");
        p354.setFraqueza("Dark, Ghost");
        p354.setTrainer("Agatha");
        
        lb1.setText(String.valueOf(p354.getNome()));
        lb2.setText(String.valueOf(p354.getAltura()));
        lb3.setText(String.valueOf(p354.getPeso()));
        lb4.setText(String.valueOf(p354.getFraqueza()));
        lb5.setText(String.valueOf(p354.getTrainer()));
        
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
    private void poke356(ActionEvent event){
        Treinador phant = new Treinador();
        phant.setNome("Agatha");
        phant.setApelido("Elite 4 Agatha");
        phant.setPeso("85 kg");
        phant.setIdade("70 Anos");
        
        Pokemons p356 = new Pokemons(phant);
        p356.setNome("Dusclops");
        p356.setAltura("1.6 m");
        p356.setPeso("30.6 kg");
        p356.setFraqueza("Dark, Ghost");
        p356.setTrainer("Agatha");
        
        lb1.setText(String.valueOf(p356.getNome()));
        lb2.setText(String.valueOf(p356.getAltura()));
        lb3.setText(String.valueOf(p356.getPeso()));
        lb4.setText(String.valueOf(p356.getFraqueza()));
        lb5.setText(String.valueOf(p356.getTrainer()));
        
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
    private void poke429(ActionEvent event){
        Treinador phant = new Treinador();
        phant.setNome("Agatha");
        phant.setApelido("Elite 4 Agatha");
        phant.setPeso("85 kg");
        phant.setIdade("70 Anos");
        
        Pokemons p429  = new Pokemons(phant);
        p429.setNome("Mismagius");
        p429.setAltura("0.9 m");
        p429.setPeso("4.4 kg");
        p429.setFraqueza("Dark, Ghost");
        p429.setTrainer("Agatha");
        
        lb1.setText(String.valueOf(p429.getNome()));
        lb2.setText(String.valueOf(p429.getAltura()));
        lb3.setText(String.valueOf(p429.getPeso()));
        lb4.setText(String.valueOf(p429.getFraqueza()));
        lb5.setText(String.valueOf(p429.getTrainer()));
        
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
    private void poke563(ActionEvent event){
        Treinador phant = new Treinador();
        phant.setNome("Agatha");
        phant.setApelido("Elite 4 Agatha");
        phant.setPeso("85 kg");
        phant.setIdade("70 Anos");
        
        Pokemons p563 = new Pokemons(phant);
        p563.setNome("Cofagrigus");
        p563.setAltura("1.7 m");
        p563.setPeso("76.5 kg");
        p563.setFraqueza("Ghost, Dark");
        p563.setTrainer("Agatha");
        
        lb1.setText(String.valueOf(p563.getNome()));
        lb2.setText(String.valueOf(p563.getAltura()));
        lb3.setText(String.valueOf(p563.getPeso()));
        lb4.setText(String.valueOf(p563.getFraqueza()));
        lb5.setText(String.valueOf(p563.getTrainer()));
        
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
        Treinador phant = new Treinador();
        phant.setNome("Agatha");
        phant.setApelido("Elite 4 Agatha");
        phant.setPeso("85 kg");
        phant.setIdade("70 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(phant.getNome()));
        lb7.setText(String.valueOf(phant.getApelido()));
        lb8.setText(String.valueOf(phant.getPeso()));
        lb9.setText(String.valueOf(phant.getIdade()));
        
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
