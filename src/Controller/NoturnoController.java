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
public class NoturnoController implements Initializable {
    
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
        Treinador not = new Treinador();
        not.setNome("Shauntal");
        not.setApelido("Elite 4 Shauntal");
        not.setPeso("50 kg");
        not.setIdade("17 Anos");

        Pokemons umbreon  = new Pokemons(not);
        umbreon.setNome("Umbreon");
        umbreon.setAltura("1.0 m");
        umbreon.setPeso("27.0 kg");
        umbreon.setFraqueza("Fighting, Bug e Fairy");
        umbreon.setTrainer("Shauntal ");

        lb1.setText(String.valueOf(umbreon.getNome()));
        lb2.setText(String.valueOf(umbreon.getAltura()));
        lb3.setText(String.valueOf(umbreon.getPeso()));
        lb4.setText(String.valueOf(umbreon.getFraqueza()));
        lb5.setText(String.valueOf(umbreon.getTrainer()));

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
        Treinador not = new Treinador();
        not.setNome("Shauntal");
        not.setApelido("Elite 4 Shauntal");
        not.setPeso("50 kg");
        not.setIdade("17 Anos");
        
        Pokemons mightyena  = new Pokemons(not);
        mightyena.setNome("Mightyena");
        mightyena.setAltura("1.0 m");
        mightyena.setPeso("37.0 kg");
        mightyena.setFraqueza("Fighting, Bug e Fairy");
        mightyena.setTrainer("Marshal");
        
        lb1.setText(String.valueOf(mightyena.getNome()));
        lb2.setText(String.valueOf(mightyena.getAltura()));
        lb3.setText(String.valueOf(mightyena.getPeso()));
        lb4.setText(String.valueOf(mightyena.getFraqueza()));
        lb5.setText(String.valueOf(mightyena.getTrainer()));
        
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
        Treinador not = new Treinador();
        not.setNome("Shauntal");
        not.setApelido("Elite 4 Shauntal");
        not.setPeso("50 kg");
        not.setIdade("17 Anos");
        
        Pokemons absol  = new Pokemons(not);
        absol.setNome("Absol");
        absol.setAltura("1.2 m");
        absol.setPeso("47.0 kg");
        absol.setFraqueza("Fighting, Bug e Fairy");
        absol.setTrainer("Shauntal");
        
        lb1.setText(String.valueOf(absol.getNome()));
        lb2.setText(String.valueOf(absol.getAltura()));
        lb3.setText(String.valueOf(absol.getPeso()));
        lb4.setText(String.valueOf(absol.getFraqueza()));
        lb5.setText(String.valueOf(absol.getTrainer()));
        
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
        Treinador not = new Treinador();
        not.setNome("Shauntal");
        not.setApelido("Elite 4 Shauntal");
        not.setPeso("50 kg");
        not.setIdade("17 Anos");
        
        Pokemons darkrai  = new Pokemons(not);
        darkrai.setNome("Darkrai");
        darkrai.setAltura("1.5 m");
        darkrai.setPeso("50.5 kg");
        darkrai.setFraqueza("Fighting, Bug e Fairy");
        darkrai.setTrainer("Shauntal");
        
        lb1.setText(String.valueOf(darkrai.getNome()));
        lb2.setText(String.valueOf(darkrai.getAltura()));
        lb3.setText(String.valueOf(darkrai.getPeso()));
        lb4.setText(String.valueOf(darkrai.getFraqueza()));
        lb5.setText(String.valueOf(darkrai.getTrainer()));
        
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
        Treinador not = new Treinador();
        not.setNome("Shauntal");
        not.setApelido("Elite 4 Shauntal");
        not.setPeso("50 kg");
        not.setIdade("17 Anos");
        
        Pokemons liepard = new Pokemons(not);
        liepard.setNome("Liepard");
        liepard.setAltura("1.1 m");
        liepard.setPeso("37.5 kg");
        liepard.setFraqueza("Fighting, Bug e Fairy");
        liepard.setTrainer("Shauntal");
        
        lb1.setText(String.valueOf(liepard.getNome()));
        lb2.setText(String.valueOf(liepard.getAltura()));
        lb3.setText(String.valueOf(liepard.getPeso()));
        lb4.setText(String.valueOf(liepard.getFraqueza()));
        lb5.setText(String.valueOf(liepard.getTrainer()));
        
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
        Treinador not = new Treinador();
        not.setNome("Shauntal");
        not.setApelido("Elite 4 Shauntal ");
        not.setPeso("50 kg");
        not.setIdade("17 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(not.getNome()));
        lb7.setText(String.valueOf(not.getApelido()));
        lb8.setText(String.valueOf(not.getPeso()));
        lb9.setText(String.valueOf(not.getIdade()));
        
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
