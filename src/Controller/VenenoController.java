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
public class VenenoController implements Initializable {
    
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
        lut.setNome("Koga");
        lut.setApelido("Elite 4 Koga");
        lut.setPeso("90 kg");
        lut.setIdade("50 Anos");

        Pokemons arbok  = new Pokemons(lut);
        arbok.setNome("Arbok");
        arbok.setAltura("3.5 m");
        arbok.setPeso("65.0 kg");
        arbok.setFraqueza("Ground e Psychic");
        arbok.setTrainer("Koga");

        lb1.setText(String.valueOf(arbok.getNome()));
        lb2.setText(String.valueOf(arbok.getAltura()));
        lb3.setText(String.valueOf(arbok.getPeso()));
        lb4.setText(String.valueOf(arbok.getFraqueza()));
        lb5.setText(String.valueOf(arbok.getTrainer()));

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
        Treinador ven = new Treinador();
        ven.setNome("Koga");
        ven.setApelido("Elite 4 Koga");
        ven.setPeso("90 kg");
        ven.setIdade("50 Anos");
        
        Pokemons nidorina  = new Pokemons(ven);
        nidorina.setNome("Nidorina");
        nidorina.setAltura("0.8 m");
        nidorina.setPeso("20.0 kg");
        nidorina.setFraqueza("Ground e Psychic");
        nidorina.setTrainer("Koga");
        
        lb1.setText(String.valueOf(nidorina.getNome()));
        lb2.setText(String.valueOf(nidorina.getAltura()));
        lb3.setText(String.valueOf(nidorina.getPeso()));
        lb4.setText(String.valueOf(nidorina.getFraqueza()));
        lb5.setText(String.valueOf(nidorina.getTrainer()));
        
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
        Treinador ven = new Treinador();
        ven.setNome("Koga");
        ven.setApelido("Elite 4 Koga");
        ven.setPeso("90 kg");
        ven.setIdade("50 Anos");
        
        Pokemons nidorino  = new Pokemons(ven);
        nidorino.setNome("Nidorino");
        nidorino.setAltura("0.9 m");
        nidorino.setPeso("19.5 kg");
        nidorino.setFraqueza("Ground e Psychic");
        nidorino.setTrainer("Koga");
        
        lb1.setText(String.valueOf(nidorino.getNome()));
        lb2.setText(String.valueOf(nidorino.getAltura()));
        lb3.setText(String.valueOf(nidorino.getPeso()));
        lb4.setText(String.valueOf(nidorino.getFraqueza()));
        lb5.setText(String.valueOf(nidorino.getTrainer()));
        
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
        Treinador ven = new Treinador();
        ven.setNome("Koga");
        ven.setApelido("Elite 4 Koga");
        ven.setPeso("90 kg");
        ven.setIdade("50 Anos");
        
        Pokemons muk  = new Pokemons(ven);
        muk.setNome("Muk");
        muk.setAltura("1.2 m");
        muk.setPeso("30.0 kg");
        muk.setFraqueza("Ground e Psychic");
        muk.setTrainer("Koga");
        
        lb1.setText(String.valueOf(muk.getNome()));
        lb2.setText(String.valueOf(muk.getAltura()));
        lb3.setText(String.valueOf(muk.getPeso()));
        lb4.setText(String.valueOf(muk.getFraqueza()));
        lb5.setText(String.valueOf(muk.getTrainer()));
        
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
        Treinador ven = new Treinador();
        ven.setNome("Koga");
        ven.setApelido("Elite 4 Koga");
        ven.setPeso("90 kg");
        ven.setIdade("50 Anos");
        
        Pokemons seviper = new Pokemons(ven);
        seviper.setNome("Seviper");
        seviper.setAltura("2.7 m");
        seviper.setPeso("52.5 kg");
        seviper.setFraqueza("Ground e Psychic");
        seviper.setTrainer("Koga");
        
        lb1.setText(String.valueOf(seviper.getNome()));
        lb2.setText(String.valueOf(seviper.getAltura()));
        lb3.setText(String.valueOf(seviper.getPeso()));
        lb4.setText(String.valueOf(seviper.getFraqueza()));
        lb5.setText(String.valueOf(seviper.getTrainer()));
        
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
        Treinador ven = new Treinador();
        ven.setNome("Koga");
        ven.setApelido("Elite 4 Koga");
        ven.setPeso("90 kg");
        ven.setIdade("50 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(ven.getNome()));
        lb7.setText(String.valueOf(ven.getApelido()));
        lb8.setText(String.valueOf(ven.getPeso()));
        lb9.setText(String.valueOf(ven.getIdade()));
        
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
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tit.setVisible(true);
    }    
    
}
