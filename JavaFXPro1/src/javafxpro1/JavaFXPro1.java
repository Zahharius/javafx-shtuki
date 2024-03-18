/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxpro1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class JavaFXPro1 extends Application {

    private Stage primaryStage;
    
    
    
    @Override
    public void start(Stage primaryStage) {
        this.setPrimaryStage(primaryStage);
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/javafxpro1/home.fxml"));
        Parent vbRootContentRoot=null;
        try {
            vbRootContentRoot = loader.load();
        } catch (IOException ex) {
            Logger.getLogger(JavaFXPro1.class.getName()).log(Level.SEVERE, null, ex);
        }
        HomeController homeController = loader.getController();
        homeController.setApp(this);
        Scene scene = new Scene(vbRootContentRoot);
        
        primaryStage.setTitle("Hello Zahhar Simanski");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    
}
