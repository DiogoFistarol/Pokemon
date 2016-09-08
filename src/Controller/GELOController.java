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
public class GELOController implements Initializable {

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
    private void poke362(ActionEvent event) {
        Treinador gelo = new Treinador();
        gelo.setNome("Lorelei");
        gelo.setApelido("Elite 4 Lorelei");
        gelo.setPeso("80 kg");
        gelo.setIdade("25 Anos");
        
        Pokemons p362 = new Pokemons(gelo);
        p362.setNome("Glalie");
        p362.setAltura("1.5 m");
        p362.setPeso("256.5 kg");
        p362.setFraqueza("Fire, Fighting, Rock, Steel");
        p362.setTrainer("Lorelei");

        lb1.setText(String.valueOf(p362.getNome()));
        lb2.setText(String.valueOf(p362.getAltura()));
        lb3.setText(String.valueOf(p362.getPeso()));
        lb4.setText(String.valueOf(p362.getFraqueza()));
        lb5.setText(String.valueOf(p362.getTrainer()));

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
    private void poke378(ActionEvent event){
        Treinador gelo = new Treinador();
        gelo.setNome("Lorelei");
        gelo.setApelido("Elite 4 Lorelei");
        gelo.setPeso("80 kg");
        gelo.setIdade("25 Anos");
        
        Pokemons p378 = new Pokemons(gelo);
        p378.setNome("Regice");
        p378.setAltura("1.8 m");
        p378.setPeso("175.0 kg");
        p378.setFraqueza("Fire, Fighting, Rock, Steel");
        p378.setTrainer("Lorelei");
        
        lb1.setText(String.valueOf(p378.getNome()));
        lb2.setText(String.valueOf(p378.getAltura()));
        lb3.setText(String.valueOf(p378.getPeso()));
        lb4.setText(String.valueOf(p378.getFraqueza()));
        lb5.setText(String.valueOf(p378.getTrainer()));
        
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
    private void poke471(ActionEvent event){
        Treinador gelo = new Treinador();
        gelo.setNome("Lorelei");
        gelo.setApelido("Elite 4 Lorelei");
        gelo.setPeso("80 kg");
        gelo.setIdade("25 Anos");
        
        Pokemons p471 = new Pokemons(gelo);
        p471.setNome("Glaceon");
        p471.setAltura("0.8 m");
        p471.setPeso("25.9 kg");
        p471.setFraqueza("Fire, Fighting, Rock, Steel");
        p471.setTrainer("Lorelei");
        
        lb1.setText(String.valueOf(p471.getNome()));
        lb2.setText(String.valueOf(p471.getAltura()));
        lb3.setText(String.valueOf(p471.getPeso()));
        lb4.setText(String.valueOf(p471.getFraqueza()));
        lb5.setText(String.valueOf(p471.getTrainer()));
        
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
    private void poke614(ActionEvent event){
        Treinador gelo = new Treinador();
        gelo.setNome("Lorelei");
        gelo.setApelido("Elite 4 Lorelei");
        gelo.setPeso("80 kg");
        gelo.setIdade("25 Anos");
        
        Pokemons p614  = new Pokemons(gelo);
        p614.setNome("Beartic");
        p614.setAltura("2.6 m");
        p614.setPeso("260.0 kg");
        p614.setFraqueza("Fire, Fighting, Rock, Steel");
        p614.setTrainer("Lorelei");
        
        lb1.setText(String.valueOf(p614.getNome()));
        lb2.setText(String.valueOf(p614.getAltura()));
        lb3.setText(String.valueOf(p614.getPeso()));
        lb4.setText(String.valueOf(p614.getFraqueza()));
        lb5.setText(String.valueOf(p614.getTrainer()));
        
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
    private void poke615(ActionEvent event){
        Treinador gelo = new Treinador();
        gelo.setNome("Lorelei");
        gelo.setApelido("Elite 4 Lorelei");
        gelo.setPeso("80 kg");
        gelo.setIdade("25 Anos");
         
        Pokemons p615 = new Pokemons(gelo);
        p615.setNome("Cryogonal");
        p615.setAltura("1.1 m");
        p615.setPeso("148.0 kg");
        p615.setFraqueza("Fire, Fighting, Rock, Steel");
        p615.setTrainer("Lorelei");
        
        lb1.setText(String.valueOf(p615.getNome()));
        lb2.setText(String.valueOf(p615.getAltura()));
        lb3.setText(String.valueOf(p615.getPeso()));
        lb4.setText(String.valueOf(p615.getFraqueza()));
        lb5.setText(String.valueOf(p615.getTrainer()));
        
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
        Treinador gelo = new Treinador();
        gelo.setNome("Lorelei");
        gelo.setApelido("Elite 4 Lorelei");
        gelo.setPeso("80 kg");
        gelo.setIdade("25 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(gelo.getNome()));
        lb7.setText(String.valueOf(gelo.getApelido()));
        lb8.setText(String.valueOf(gelo.getPeso()));
        lb9.setText(String.valueOf(gelo.getIdade()));
        
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
