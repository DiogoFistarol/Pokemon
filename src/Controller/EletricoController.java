/*
 *Fogo: Magmar, (Moltress), Flareon, (Charizard) e Arcanine
 *
 *Elétrico: Electabuzz, (Zapdos), Jolteon, Elekid e Raikou
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
 *
 * @author Aluno
 */
    
public class EletricoController implements Initializable {
    
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
        Treinador inst = new Treinador();
        inst.setNome("Spark");
        inst.setApelido("Leader S.K.");
        inst.setPeso("70 kg");
        inst.setIdade("16 Anos");

        Pokemons electabuzz = new Pokemons(inst);
        electabuzz.setNome("Electabuzz");
        electabuzz.setAltura("1.1 m");
        electabuzz.setPeso("30.0 kg");
        electabuzz.setFraqueza("Ground");
        electabuzz.setTrainer("Spark");

        lb1.setText(String.valueOf(electabuzz.getNome()));
        lb2.setText(String.valueOf(electabuzz.getAltura()));
        lb3.setText(String.valueOf(electabuzz.getPeso()));
        lb4.setText(String.valueOf(electabuzz.getFraqueza()));
        lb5.setText(String.valueOf(electabuzz.getTrainer()));

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
        Treinador inst = new Treinador();
        inst.setNome("Spark");
        inst.setApelido("Leader S.K.");
        inst.setPeso("70 kg");
        inst.setIdade("16 Anos");
        
        Pokemons jolteon  = new Pokemons(inst);
        jolteon.setNome("Jolteon");
        jolteon.setAltura("0.8 m");
        jolteon.setPeso("24.5 kg");
        jolteon.setFraqueza("Ground");
        jolteon.setTrainer("Spark");
        
        lb1.setText(String.valueOf(jolteon.getNome()));
        lb2.setText(String.valueOf(jolteon.getAltura()));
        lb3.setText(String.valueOf(jolteon.getPeso()));
        lb4.setText(String.valueOf(jolteon.getFraqueza()));
        lb5.setText(String.valueOf(jolteon.getTrainer()));
        
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
        Treinador inst = new Treinador();
        inst.setNome("Spark");
        inst.setApelido("Leader S.K.");
        inst.setPeso("70 kg");
        inst.setIdade("16 Anos");
        
        Pokemons elekid  = new Pokemons(inst);
        elekid.setNome("Elekid");
        elekid.setAltura("0.6 m");
        elekid.setPeso("23.5 kg");
        elekid.setFraqueza("Ground");
        elekid.setTrainer("Spark");
        
        lb1.setText(String.valueOf(elekid.getNome()));
        lb2.setText(String.valueOf(elekid.getAltura()));
        lb3.setText(String.valueOf(elekid.getPeso()));
        lb4.setText(String.valueOf(elekid.getFraqueza()));
        lb5.setText(String.valueOf(elekid.getTrainer()));
        
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
        Treinador inst = new Treinador();
        inst.setNome("Spark");
        inst.setApelido("Leader S.K.");
        inst.setPeso("70 kg");
        inst.setIdade("16 Anos");
        
        Pokemons raikou  = new Pokemons(inst);
        raikou.setNome("Raikou");
        raikou.setAltura("1.9 m");
        raikou.setPeso("178 kg");
        raikou.setFraqueza("Ground");
        raikou.setTrainer("Spark");
        
        lb1.setText(String.valueOf(raikou.getNome()));
        lb2.setText(String.valueOf(raikou.getAltura()));
        lb3.setText(String.valueOf(raikou.getPeso()));
        lb4.setText(String.valueOf(raikou.getFraqueza()));
        lb5.setText(String.valueOf(raikou.getTrainer()));
        
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
        Treinador inst = new Treinador();
        inst.setNome("Spark");
        inst.setApelido("Leader S.K.");
        inst.setPeso("70 kg");
        inst.setIdade("16 Anos");
        
        Pokemons luxray = new Pokemons(inst);
        luxray.setNome("Luxray");
        luxray.setAltura("1.4 m");
        luxray.setPeso("42.0 kg");
        luxray.setFraqueza("Ground");
        luxray.setTrainer("Spark");
        
        lb1.setText(String.valueOf(luxray.getNome()));
        lb2.setText(String.valueOf(luxray.getAltura()));
        lb3.setText(String.valueOf(luxray.getPeso()));
        lb4.setText(String.valueOf(luxray.getFraqueza()));
        lb5.setText(String.valueOf(luxray.getTrainer()));
        
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
        Treinador inst = new Treinador();
        inst.setNome("Spark");
        inst.setApelido("Leader S.K.");
        inst.setPeso("70 kg");
        inst.setIdade("16 Anos");
        
        listv1.setVisible(true);
        
        image6.setVisible(true);
        lb6.setText(String.valueOf(inst.getNome()));
        lb7.setText(String.valueOf(inst.getApelido()));
        lb8.setText(String.valueOf(inst.getPeso()));
        lb9.setText(String.valueOf(inst.getIdade()));
        
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
