package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {

        Button firstButton = new Button("To the second view!");
        Button secondButton = new Button("To the third view!");
        Button thirdButton = new Button("To the first view!");

        BorderPane firstSceneLayout = new BorderPane();
        firstSceneLayout.setTop(new Label("First view!"));
        firstSceneLayout.setCenter(firstButton);
        
        VBox secondSceneLayout = new VBox();
        secondSceneLayout.setSpacing(5);
        secondSceneLayout.getChildren().add(secondButton);
        secondSceneLayout.getChildren().add(new Label("Second view"));
        
        GridPane thirdSceneLayout = new GridPane();
        thirdSceneLayout.add(new Label("Third view!"), 0, 0);
        thirdSceneLayout.add(thirdButton, 1, 1);
        
        Scene firstScene = new Scene(firstSceneLayout);
        Scene secondScene = new Scene(secondSceneLayout);
        Scene thirdScene = new Scene(thirdSceneLayout);

        firstButton.setOnAction((event) -> {
            window.setScene(secondScene);
        });

        secondButton.setOnAction((event) -> {
            window.setScene(thirdScene);
        });

        thirdButton.setOnAction((event) -> {
            window.setScene(firstScene);
        });
        
        window.setScene(firstScene);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
