/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxpro1;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class HomeController implements Initializable {
    @FXML private Button btnClickMe;
    @FXML private Label info;
    private int count = 0;
    private JavaFXPro1 app;
    Random random = new  Random();
    
    @FXML
    private void clickMe(){
        app.getPrimaryStage().setTitle("hello from home controller");
        info.setText(String.format("Нажато %d раз%nНажми меня ещё разок", ++count));
        double flip = btnClickMe.getRotate();
        flip = flip + random.nextInt(100-(-100)+1)+(-100);
        btnClickMe.setRotate(flip);
        double left = btnClickMe.getLayoutX();
        double right = btnClickMe.getLayoutY();
        left = left + random.nextInt(100-(-100)+1)+(-100);
        right = right + random.nextInt(100-(-100)+1)+(-100);
        btnClickMe.setLayoutX(left);
        btnClickMe.setLayoutY(right);
        btnClickMe.setText("не поймаешь");
        btnClickMe.setCursor(Cursor.HAND);
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    void setApp(JavaFXPro1 app) {
       this.app = app;
    }
    
}
