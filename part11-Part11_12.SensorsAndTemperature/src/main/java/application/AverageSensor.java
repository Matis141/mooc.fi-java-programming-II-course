package application;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augma
 */
public class AverageSensor implements Sensor {
    
    private ArrayList<Sensor> sensorList;
    private ArrayList<Integer> readingsList;
    
    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.readingsList = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensorList.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        for (Sensor sensor : sensorList) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
         return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensorList) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensorList) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn() || this.sensorList.isEmpty()) {
            throw new IllegalStateException();
        }
        int sum = this.sensorList.stream()
        .mapToInt(Sensor -> Sensor.read())
        .sum();
        
        int average = sum/this.sensorList.size();
        
        this.readingsList.add(average);
        return average;
    }
    
    public List<Integer> readings() {
        return readingsList;
    }    
}
