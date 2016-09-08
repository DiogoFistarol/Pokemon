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
public class PSIQUICOController implements Initializable {
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
    private void poke065(ActionEvent event) {
        Treinador psi = new Treinador();
        psi.setNome("Lucian");
        psi.setApelido("Elite 4 Lucian");
        psi.setPeso("80 kg");
        psi.setIdade("23 Anos");
        
        Pokemons p065 = new Pokemons(psi);
        p065.setNome("Alakazam");
        p065.setAltura("1.5 m");
        p065.setPeso("48.0 kg");
        p065.setFraqueza("Bug, Dark, Ghost");
        p065.setTrainer("Lucian");
        lb1.setText(String.valueOf(p065.getNome()));
        lb2.setText(String.valueOf(p065.getAltura()));
        lb3.setText(String.valueOf(p065.getPeso()));
        lb4.setText(String.valueOf(p065.getFraqueza()));
        lb5.setText(String.valueOf(p065.getTrainer()));

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
    private void poke096(ActionEvent event){
        Treinador psi = new Treinador();
        psi.setNome("Lucian");
        psi.setApelido("Elite 4 Lucian");
        psi.setPeso("80 kg");
        psi.setIdade("23 Anos");
        
        Pokemons p096  = new Pokemons(psi);
        p096.setNome("Drowzee");
        p096.setAltura("1.0 m");
        p096.setPeso("32.4 kg");
        p096.setFraqueza("Bug, Dark, Ghost");
        p096.setTrainer("Lucian");
        
        lb1.setText(String.valueOf(p096.getNome()));
        lb2.setText(String.valueOf(p096.getAltura()));
        lb3.setText(String.valueOf(p096.getPeso()));
        lb4.setText(String.valueOf(p096.getFraqueza()));
        lb5.setText(String.valueOf(p096.getTrainer()));
        
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
    private void poke150(ActionEvent event){
        Treinador psi = new Treinador();
        psi.setNome("Lucian");
        psi.setApelido("Elite 4 Lucian");
        psi.setPeso("80 kg");
        psi.setIdade("23 Anos");
        
        Pokemons p150  = new Pokemons(psi);
        p150.setNome("Mewtwo");
        p150.setAltura("2.0 m");
        p150.setPeso("122.0 kg");
        p150.setFraqueza("Bug, Dark, Ghost");
        p150.setTrainer("Lucian");
        
        lb1.setText(String.valueOf(p150.getNome()));
        lb2.setText(String.valueOf(p150.getAltura()));
        lb3.setText(String.valueOf(p150.getPeso()));
        lb4.setText(String.valueOf(p150.getFraqueza()));
        lb5.setText(String.valueOf(p150.getTrainer()));
        
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
    private void poke196(ActionEvent event){
        Treinador psi = new Treinador();
        psi.setNome("Lucian");
        psi.setApelido("Elite 4 Lucian");
        psi.setPeso("80 kg");
        psi.setIdade("23 Anos");
        
        Pokemons p196  = new Pokemons(psi);
        p196.setNome("Espeon");
        p196.setAltura("0.9 m");
        p196.setPeso("26.5 kg");
        p196.setFraqueza("Bug, Dark, Ghost");
        p196.setTrainer("Lucian");
        
        lb1.setText(String.valueOf(p196.getNome()));
        lb2.setText(String.valueOf(p196.getAltura()));
        lb3.setText(String.valueOf(p196.getPeso()));
        lb4.setText(String.valueOf(p196.getFraqueza()));
        lb5.setText(String.valueOf(p196.getTrainer()));
        
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
    private void poke326(ActionEvent event){
        Treinador psi = new Treinador();
        psi.setNome("Lucian");
        psi.setApelido("Elite 4 Lucian");
        psi.setPeso("80 kg");
        psi.setIdade("23 Anos");
         
        Pokemons p326 = new Pokemons(psi);
        p326.setNome("Grumpig");
        p326.setAltura("0.9 m");
        p326.setPeso("71.5 kg");
        p326.setFraqueza("Bug, Dark, Ghost");
        p326.setTrainer("Lucian");
        
        lb1.setText(String.valueOf(p326.getNome()));
        lb2.setText(String.valueOf(p326.getAltura()));
        lb3.setText(String.valueOf(p326.getPeso()));
        lb4.setText(String.valueOf(p326.getFraqueza()));
        lb5.setText(String.valueOf(p326.getTrainer()));
        
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
        Treinador psi = new Treinador();
        psi.setNome("Lucian");
        psi.setApelido("Elite 4 Lucian");
        psi.setPeso("80 kg");
        psi.setIdade("23 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(psi.getNome()));
        lb7.setText(String.valueOf(psi.getApelido()));
        lb8.setText(String.valueOf(psi.getPeso()));
        lb9.setText(String.valueOf(psi.getIdade()));
        
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
