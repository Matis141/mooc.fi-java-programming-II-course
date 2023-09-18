package ticTacToe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        GameLogic logic = new GameLogic();
        BorderPane layout = new BorderPane();
        GridPane buttonGrid = new GridPane();
        Label turnLabel = new Label("Turn: " + logic.getTurn());
        ArrayList<Button> buttonList = new ArrayList<>();
        
        BorderPane endLayout = new BorderPane();
        Label endLabel = new Label("The end!");
        endLayout.setTop(endLabel);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttonList.add(new Button(" "));
                buttonGrid.add(buttonList.get(buttonList.size() - 1), i, j);
            }
        }   
        
        for (Button button : buttonList) {
            button.setFont(Font.font("Monospaced", 40));
            button.setOnAction((event) ->  {
                if (button.getText().equals(" ")) {
                    button.setText(logic.getTurn());
                    logic.changeTurn();
                    turnLabel.setText("Turn: " + logic.getTurn());
                }
                if (logic.checkScore(buttonList)) {
                    turnLabel.setText("The end!");
                    Scene endView = new Scene(endLayout);
                    stage.setScene(endView);
                }
            });
        }
        
        layout.setTop(turnLabel);
        layout.setCenter(buttonGrid);


        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
