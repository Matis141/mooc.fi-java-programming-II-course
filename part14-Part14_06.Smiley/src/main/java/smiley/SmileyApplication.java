package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {

    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);

        painter.setFill(Color.BLACK);
        painter.fillRect(90, 30, 50, 50);
        painter.fillRect(420, 30, 50, 50);
        
        painter.fillRect(50, 250, 50, 50);
        painter.fillRect(450, 250, 50, 50);
        painter.fillRect(225, 290, 50, 50);

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
