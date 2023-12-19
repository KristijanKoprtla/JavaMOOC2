/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Ana
 */
public class TemperatureSensor implements Sensor{
    private boolean isOn;
    
    
    public void setOff(){
        isOn = false;
        
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public int read() {
        int randomNum = new Random().nextInt(61) - 30;
        if(!isOn) {
            throw new IllegalStateException("Temp sensor is off!");
        }
        return randomNum;
        
    }
    
    
}
