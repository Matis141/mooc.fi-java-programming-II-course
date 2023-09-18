/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author augma
 */
public class TemperatureSensor implements Sensor {
    
    private boolean state;
    private int read;

    public TemperatureSensor(){
        this.state = false;
    }
    
    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void setOn() {
        this.state = true;
    }

    @Override
    public void setOff() {
        this.state = false;
    }

    @Override
    public int read() {
        if (!this.isOn()) {
            throw new IllegalStateException();
        }
        return new Random().nextInt(61) - 30;
    }
    
    
    
}
