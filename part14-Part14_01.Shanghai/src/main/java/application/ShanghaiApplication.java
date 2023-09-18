package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

        public static Map<Integer, Integer> HashMapFromTextFile()
    {
  
        Map<Integer, Integer> map
            = new HashMap<Integer, Integer>();
        BufferedReader br = null;
  
        try {
  
            // create file object
            File file = new File("src\\data.txt");
  
            // create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));
  
            String line = null;
  
            // read file line by line
            while ((line = br.readLine()) != null) {
  
                // split the line by :
                String[] parts = line.split(" ");
                Integer year = Integer.parseInt(parts[0].trim());
                Integer percent = Integer.parseInt(parts[1].trim());
  
                // put name, number in HashMap if they are
                // not empty
                if (!(year == null  && percent == null)) {
                    map.put(year, percent);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
  
            // Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                }
                catch (Exception e) {
                };
            }
        }
  
        return map;
    }

    
    public void start(Stage stage) {
        
        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis();


        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        /*XYChart.Series rkpData = new XYChart.Series();
        
        Map<Integer, Integer> data = new HashMap<>();
        data = HashMapFromTextFile();
        
        TreeMap<Integer, Integer> sorted = new TreeMap<>();
        sorted.putAll(data);
        
        for (Integer key : sorted.keySet()) {
            //System.out.println(key + " " + sorted.get(key));
            rkpData.getData().add(new XYChart.Data(key, sorted.get(key)));
        }
        
        List<XYChart.Data> points = new ArrayList<>();
        for (int i = 0; i < rkpData.getData().size(); i++) {
            Object piste = rkpData.getData().get(i);
            points.add(XYChart.Data.class.cast(piste));
            //System.out.println(XYChart.Data.class.cast(piste));
        }
        //points.stream().forEach(p -> System.out.println(p.getXValue() + " " + p.getYValue()));
        for (XYChart.Data point : points) {
            if (point.getXValue().equals(2007)) {
                System.out.println("equals kurwa");
            }
        }*/

        XYChart.Series helsinkiRanking = new XYChart.Series();
        // and single points into the data set
        helsinkiRanking.getData().add(new XYChart.Data(2007, 73));
        helsinkiRanking.getData().add(new XYChart.Data(2008, 68));
        helsinkiRanking.getData().add(new XYChart.Data(2009, 72));
        helsinkiRanking.getData().add(new XYChart.Data(2010, 72));
        helsinkiRanking.getData().add(new XYChart.Data(2011, 74));
        helsinkiRanking.getData().add(new XYChart.Data(2012, 73));
        helsinkiRanking.getData().add(new XYChart.Data(2013, 76));
        helsinkiRanking.getData().add(new XYChart.Data(2014, 73));
        helsinkiRanking.getData().add(new XYChart.Data(2015, 67));
        helsinkiRanking.getData().add(new XYChart.Data(2016, 56));
        helsinkiRanking.getData().add(new XYChart.Data(2017, 56));
        
        lineChart.getData().add(helsinkiRanking);
        lineChart.setLegendVisible(false);
        
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }
}
