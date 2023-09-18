package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

     @Override
    public void start(Stage window) throws Exception {

        Label instructionText = new Label("Enter your name and start.");
        TextField nameField = new TextField();
        Button startButton = new Button("Start");
        Label greetingsMessage = new Label();

        GridPane layout = new GridPane();
        layout.add(instructionText, 0, 0);
        layout.add(nameField, 0, 1);
        layout.add(startButton, 0, 2);
        
        Scene beginView = new Scene(layout);
        
        greetingsMessage.setText("Welcome " + nameField.getText());
        
        GridPane greetingsLayout = new GridPane();
        
        greetingsLayout.add(greetingsMessage, 0, 0);
        
        Scene greetingsView = new Scene(greetingsLayout);
        
        startButton.setOnAction((event) -> {
            greetingsMessage.setText("Welcome " + nameField.getText() + "!");
            window.setScene(greetingsView);
        });
        
        window.setScene(beginView);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
