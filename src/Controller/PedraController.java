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
 * @author Adm
 */
public class PedraController implements Initializable {
    
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
        Treinador ped = new Treinador();
        ped.setNome("Karen");
        ped.setApelido("Elite 4 Karen");
        ped.setPeso("65 kg");
        ped.setIdade("18 Anos");

        Pokemons sudowoodo  = new Pokemons(ped);
        sudowoodo.setNome("Sudowoodo");
        sudowoodo.setAltura("1.2 m");
        sudowoodo.setPeso("38.0 kg");
        sudowoodo.setFraqueza("Fighting, Grass, Ground, Steel e Water");
        sudowoodo.setTrainer("Karen");

        lb1.setText(String.valueOf(sudowoodo.getNome()));
        lb2.setText(String.valueOf(sudowoodo.getAltura()));
        lb3.setText(String.valueOf(sudowoodo.getPeso()));
        lb4.setText(String.valueOf(sudowoodo.getFraqueza()));
        lb5.setText(String.valueOf(sudowoodo.getTrainer()));

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
        Treinador ped = new Treinador();
        ped.setNome("Karen");
        ped.setApelido("Elite 4 Karen");
        ped.setPeso("65 kg");
        ped.setIdade("18 Anos");
        
        Pokemons nosepass  = new Pokemons(ped);
        nosepass.setNome("Nosepass");
        nosepass.setAltura("1.0 m");
        nosepass.setPeso("97.0 kg");
        nosepass.setFraqueza("Fighting, Grass, Ground, Steel e Water");
        nosepass.setTrainer("Karen");
        
        lb1.setText(String.valueOf(nosepass.getNome()));
        lb2.setText(String.valueOf(nosepass.getAltura()));
        lb3.setText(String.valueOf(nosepass.getPeso()));
        lb4.setText(String.valueOf(nosepass.getFraqueza()));
        lb5.setText(String.valueOf(nosepass.getTrainer()));
        
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
        Treinador ped = new Treinador();
        ped.setNome("Karen");
        ped.setApelido("Elite 4 Karen");
        ped.setPeso("65 kg");
        ped.setIdade("18 Anos");
        
        Pokemons regirock  = new Pokemons(ped);
        regirock.setNome("Regirock");
        regirock.setAltura("1.7 m");
        regirock.setPeso("230.0 kg");
        regirock.setFraqueza("Fighting, Grass, Ground, Steel e Water");
        regirock.setTrainer("Karen");
        
        lb1.setText(String.valueOf(regirock.getNome()));
        lb2.setText(String.valueOf(regirock.getAltura()));
        lb3.setText(String.valueOf(regirock.getPeso()));
        lb4.setText(String.valueOf(regirock.getFraqueza()));
        lb5.setText(String.valueOf(regirock.getTrainer()));
        
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
        Treinador ped = new Treinador();
        ped.setNome("Karen");
        ped.setApelido("Elite 4 Karen");
        ped.setPeso("65 kg");
        ped.setIdade("18 Anos");
        
        Pokemons rampardos  = new Pokemons(ped);
        rampardos.setNome("Rampardos");
        rampardos.setAltura("1.6 m");
        rampardos.setPeso("102.5 kg");
        rampardos.setFraqueza("Fighting, Grass, Ground, Steel e Water");
        rampardos.setTrainer("Karen");
        
        lb1.setText(String.valueOf(rampardos.getNome()));
        lb2.setText(String.valueOf(rampardos.getAltura()));
        lb3.setText(String.valueOf(rampardos.getPeso()));
        lb4.setText(String.valueOf(rampardos.getFraqueza()));
        lb5.setText(String.valueOf(rampardos.getTrainer()));
        
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
        Treinador ped = new Treinador();
        ped.setNome("Karen");
        ped.setApelido("Elite 4 Karen");
        ped.setPeso("65 kg");
        ped.setIdade("18 Anos");
        
        Pokemons bonsly = new Pokemons(ped);
        bonsly.setNome("Bonsly");
        bonsly.setAltura("0.5 m");
        bonsly.setPeso("15.0 kg");
        bonsly.setFraqueza("Fighting, Grass, Ground, Steel e Water");
        bonsly.setTrainer("Karen");
        
        lb1.setText(String.valueOf(bonsly.getNome()));
        lb2.setText(String.valueOf(bonsly.getAltura()));
        lb3.setText(String.valueOf(bonsly.getPeso()));
        lb4.setText(String.valueOf(bonsly.getFraqueza()));
        lb5.setText(String.valueOf(bonsly.getTrainer()));
        
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
        Treinador ped = new Treinador();
        ped.setNome("Karen");
        ped.setApelido("Elite 4 Karen");
        ped.setPeso("65 kg");
        ped.setIdade("18 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(ped.getNome()));
        lb7.setText(String.valueOf(ped.getApelido()));
        lb8.setText(String.valueOf(ped.getPeso()));
        lb9.setText(String.valueOf(ped.getIdade()));
        
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
