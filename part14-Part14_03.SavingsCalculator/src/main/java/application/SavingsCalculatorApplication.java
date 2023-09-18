package application;

import java.util.ArrayList;
import java.util.function.UnaryOperator;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public void start(Stage stage) throws Exception {
        
        BorderPane mainLayout = new BorderPane();
        CalculatorLogic calculatorLogic = new CalculatorLogic();
        
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings calculator");
        lineChart.setLegendVisible(false);
        mainLayout.setCenter(lineChart);
        
        ArrayList<Integer> savingsList = calculatorLogic.calculateSavings();
        ArrayList<Double> interestList = calculatorLogic.calculateInterest(savingsList);
        
        XYChart.Series savingsData = new XYChart.Series();
        XYChart.Series interestData = new XYChart.Series();
        
        VBox sliderBox = new VBox();
        BorderPane savingsLayout = new BorderPane();
        Label savingsText = new Label("Monthly savings");
        Slider savingsSlider = new Slider(25, 250, 25);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);
        Label savingsValue = new Label (String.valueOf(savingsSlider.getValue()));
        
        savingsLayout.setLeft(savingsText);
        savingsLayout.setCenter(savingsSlider);
        savingsLayout.setRight(savingsValue);
        sliderBox.getChildren().add(savingsLayout);
        
        BorderPane interestLayout = new BorderPane();
        Label interestText = new Label("Yearly interest rate");
        Slider interestSlider = new Slider(0, 10, 0);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        Label interestValue = new Label (String.valueOf(interestSlider.getValue()));
        
        interestLayout.setLeft(interestText);
        interestLayout.setCenter(interestSlider);
        interestLayout.setRight(interestValue);
        sliderBox.getChildren().add(interestLayout);
        
        savingsSlider.valueChangingProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> source, Boolean oldValue, Boolean newValue) {
                savingsValue.textProperty().setValue(String.valueOf((int)savingsSlider.getValue()));
                
                calculatorLogic.setSavings((int)savingsSlider.getValue());
                ArrayList<Integer> tempList = calculatorLogic.calculateSavings();
                
                for (int i = 0; i < savingsList.size(); i++) {
                    savingsList.set(i, tempList.get(i));
                }
                    
                savingsData.getData().clear();
                for (int i = 0; i < savingsList.size(); i++) {
                    savingsData.getData().add(new XYChart.Data(i, savingsList.get(i)));
                }
                
                
            } 
        });

        interestSlider.valueChangingProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> source, Boolean oldValue, Boolean newValue) {
                interestValue.textProperty().setValue(String.valueOf((int)interestSlider.getValue()));
                
                calculatorLogic.setInterest((Double)interestSlider.getValue());
                ArrayList<Double> tempList = calculatorLogic.calculateInterest(savingsList);
                
                for (int i = 0; i < interestList.size(); i++) {
                    interestList.set(i, tempList.get(i));
                }    
                    
                interestData.getData().clear();
                for (int i = 0; i < interestList.size(); i++) {
                    interestData.getData().add(new XYChart.Data(i, interestList.get(i)));
                }
                
                
            } 
        });
        
        lineChart.getData().add(interestData);
        lineChart.getData().add(savingsData); 
        mainLayout.setTop(sliderBox);
        
        Scene view = new Scene(mainLayout);
        stage.setScene(view);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

}
