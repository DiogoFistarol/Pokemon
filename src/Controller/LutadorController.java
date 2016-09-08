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
public class LutadorController implements Initializable {
    
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
        Treinador lut = new Treinador();
        lut.setNome("Marshal");
        lut.setApelido("Elite 4 Marshal");
        lut.setPeso("100 kg");
        lut.setIdade("18 Anos");

        Pokemons hitmonlee  = new Pokemons(lut);
        hitmonlee.setNome("Hitmonlee");
        hitmonlee.setAltura("1.5 m");
        hitmonlee.setPeso("49.8 kg");
        hitmonlee.setFraqueza("Flying, Psychic e Fairy");
        hitmonlee.setTrainer("Marshal");

        lb1.setText(String.valueOf(hitmonlee.getNome()));
        lb2.setText(String.valueOf(hitmonlee.getAltura()));
        lb3.setText(String.valueOf(hitmonlee.getPeso()));
        lb4.setText(String.valueOf(hitmonlee.getFraqueza()));
        lb5.setText(String.valueOf(hitmonlee.getTrainer()));

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
        Treinador lut = new Treinador();
        lut.setNome("Marshal");
        lut.setApelido("Elite 4 Marshal");
        lut.setPeso("100 kg");
        lut.setIdade("18 Anos");
        
        Pokemons hitmonchan  = new Pokemons(lut);
        hitmonchan.setNome("Hitmonchan");
        hitmonchan.setAltura("1.4 m");
        hitmonchan.setPeso("50.2 kg");
        hitmonchan.setFraqueza("Flying, Psychic e Fairy");
        hitmonchan.setTrainer("Marshal");
        
        lb1.setText(String.valueOf(hitmonchan.getNome()));
        lb2.setText(String.valueOf(hitmonchan.getAltura()));
        lb3.setText(String.valueOf(hitmonchan.getPeso()));
        lb4.setText(String.valueOf(hitmonchan.getFraqueza()));
        lb5.setText(String.valueOf(hitmonchan.getTrainer()));
        
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
        Treinador lut = new Treinador();
        lut.setNome("Marshal");
        lut.setApelido("Elite 4 Marshal");
        lut.setPeso("100 kg");
        lut.setIdade("18 Anos");
        
        Pokemons hitmontop  = new Pokemons(lut);
        hitmontop.setNome("Hitmontop");
        hitmontop.setAltura("1.4 m");
        hitmontop.setPeso("48.0 kg");
        hitmontop.setFraqueza("Flying, Psychic e Fairy");
        hitmontop.setTrainer("Marshal");
        
        lb1.setText(String.valueOf(hitmontop.getNome()));
        lb2.setText(String.valueOf(hitmontop.getAltura()));
        lb3.setText(String.valueOf(hitmontop.getPeso()));
        lb4.setText(String.valueOf(hitmontop.getFraqueza()));
        lb5.setText(String.valueOf(hitmontop.getTrainer()));
        
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
        Treinador lut = new Treinador();
        lut.setNome("Marshal");
        lut.setApelido("Elite 4 Marshal");
        lut.setPeso("100 kg");
        lut.setIdade("18 Anos");
        
        Pokemons riolu  = new Pokemons(lut);
        riolu.setNome("Riolu");
        riolu.setAltura("0.7 m");
        riolu.setPeso("20.2 kg");
        riolu.setFraqueza("Flying, Psychic e Fairy");
        riolu.setTrainer("Marshal");
        
        lb1.setText(String.valueOf(riolu.getNome()));
        lb2.setText(String.valueOf(riolu.getAltura()));
        lb3.setText(String.valueOf(riolu.getPeso()));
        lb4.setText(String.valueOf(riolu.getFraqueza()));
        lb5.setText(String.valueOf(riolu.getTrainer()));
        
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
        Treinador lut = new Treinador();
        lut.setNome("Marshal");
        lut.setApelido("Elite 4 Marshal");
        lut.setPeso("100 kg");
        lut.setIdade("18 Anos");
        
        Pokemons mienshao = new Pokemons(lut);
        mienshao.setNome("Mienshao");
        mienshao.setAltura("1.4 m");
        mienshao.setPeso("35.5 kg");
        mienshao.setFraqueza("Flying, Psychic e Fairy");
        mienshao.setTrainer("Marshal");
        
        lb1.setText(String.valueOf(mienshao.getNome()));
        lb2.setText(String.valueOf(mienshao.getAltura()));
        lb3.setText(String.valueOf(mienshao.getPeso()));
        lb4.setText(String.valueOf(mienshao.getFraqueza()));
        lb5.setText(String.valueOf(mienshao.getTrainer()));
        
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
        Treinador lut = new Treinador();
        lut.setNome("Marshal");
        lut.setApelido("Elite 4 Marshal");
        lut.setPeso("100 kg");
        lut.setIdade("18 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(lut.getNome()));
        lb7.setText(String.valueOf(lut.getApelido()));
        lb8.setText(String.valueOf(lut.getPeso()));
        lb9.setText(String.valueOf(lut.getIdade()));
        
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
        tit.setVisible(true);
    }    
    
}
