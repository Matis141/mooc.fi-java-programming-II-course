package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public void start(Stage stage) {
        
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        
        String yearRow = "1968	1972	1976	1980	1984	1988	1992	1996	2000	2004	2008";
        List<String> yearStringList = Arrays.asList(yearRow.split("\t"));

        List<Integer> yearList = new ArrayList<>();
        for (String year : yearStringList) {
            yearList.add(Integer.valueOf(year));
        }
        
        String kokRow = "16.1	18.1	20.9	22.9	23.0	22.9	19.1	21.6	20.8	21.8	23.4";
        List<String> kokPieces = Arrays.asList(kokRow.split("\t"));
        ArrayList<Double> kokList = new ArrayList<>();
        kokPieces.forEach(piece -> {
            kokList.add(Double.valueOf(piece));
        });
        
        String sdpRow = "23.9	27.1	24.8	25.5	24.7	25.2	27.1	24.5	23.0	24.1	21.2";
        List<String> sdpPieces = Arrays.asList(sdpRow.split("\t"));
        ArrayList<Double> sdpList = new ArrayList<>();
        sdpPieces.forEach(piece -> {
            sdpList.add(Double.valueOf(piece));
        });
        
        String keskRow = "18.9	18.0	18.4	18.7	20.2	21.1	19.2	21.8	23.8	22.8	20.1";
        List<String> keskPieces = Arrays.asList(keskRow.split("\t"));
        ArrayList<Double> keskList = new ArrayList<>();
        keskPieces.forEach(piece -> {
            keskList.add(Double.valueOf(piece));
        });
        
        String vihrRow = "2.8	2.3	6.9	6.3	7.7	7.4	8.9";
        List<String> vihrPieces = Arrays.asList(vihrRow.split("\t"));
        ArrayList<Double> vihrList = new ArrayList<>();
        vihrPieces.forEach(piece -> {
            vihrList.add(Double.valueOf(piece));
        });
        
        String vasRow = "16.9	17.5	18.5	16.6	13.1	12.6	11.7	10.4	9.9	9.6	8.8";
        List<String> vasPieces = Arrays.asList(vasRow.split("\t"));
        ArrayList<Double> vasList = new ArrayList<>();
        vasPieces.forEach(piece -> {
            vasList.add(Double.valueOf(piece));
        });
        
        String psRow = "7.3	5.0	2.1	3.0	5.3	3.6	2.4	0.9	0.7	0.9	5.4";
        List<String> psPieces = Arrays.asList(psRow.split("\t"));
        ArrayList<Double> psList = new ArrayList<>();
        psPieces.forEach(piece -> {
            psList.add(Double.valueOf(piece));
        });
        
        String rkpRow = "5.6	5.2	4.7	4.7	5.1	5.3	5.0	5.4	5.1	5.2	4.7";
        List<String> rkpPieces = Arrays.asList(rkpRow.split("\t"));
        ArrayList<Double> rkpList = new ArrayList<>();
        rkpPieces.forEach(piece -> {
            rkpList.add(Double.valueOf(piece));
        });
        
        XYChart.Series kokData = new XYChart.Series();
        kokData.setName("KOK");
        for (int i = 0; i < kokList.size(); i++) {
            kokData.getData().add(new XYChart.Data(yearList.get(i), kokList.get(i)));
        }

        XYChart.Series sdpData = new XYChart.Series();
        sdpData.setName("SDP");
        for (int i = 0; i < sdpList.size(); i++) {
            sdpData.getData().add(new XYChart.Data(yearList.get(i), sdpList.get(i)));
        }
        
        XYChart.Series keskData = new XYChart.Series();
        keskData.setName("KESK");
        for (int i = 0; i < keskList.size(); i++) {
            keskData.getData().add(new XYChart.Data(yearList.get(i), keskList.get(i)));
        }

        XYChart.Series vihrData = new XYChart.Series();
        vihrData.setName("VIHR");
        for (int i = 0; i < vihrList.size(); i++) {
            vihrData.getData().add(new XYChart.Data(yearList.get(i+4), vihrList.get(i)));
        }
        
        XYChart.Series vasData = new XYChart.Series();
        vasData.setName("VAS");
        for (int i = 0; i < vasList.size(); i++) {
            vasData.getData().add(new XYChart.Data(yearList.get(i), vasList.get(i)));
        }
        
        XYChart.Series psData = new XYChart.Series();
        psData.setName("PS");
        for (int i = 0; i < psList.size(); i++) {
            psData.getData().add(new XYChart.Data(yearList.get(i), psList.get(i)));
        }
        
        XYChart.Series rkpData = new XYChart.Series();
        rkpData.setName("RKP");
        for (int i = 0; i < rkpList.size(); i++) {
            System.out.println(yearList.get(i) + " " + rkpList.get(i));
            rkpData.getData().add(new XYChart.Data(yearList.get(i), rkpList.get(i)));
        }

        lineChart.getData().add(kokData);
        lineChart.getData().add(sdpData);
        lineChart.getData().add(keskData);
        lineChart.getData().add(vihrData);
        lineChart.getData().add(vasData);
        lineChart.getData().add(psData);
        lineChart.getData().add(rkpData);

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
