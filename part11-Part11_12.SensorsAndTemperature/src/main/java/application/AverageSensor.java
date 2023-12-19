/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ana
 */
public class AverageSensor implements Sensor{ 
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    
    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
       
    }
    
    public List<Integer> readings() {
        return readings;
        
    }

    @Override
    public boolean isOn() {
        return sensors.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        if(!sensors.isEmpty()) {
            sensors.get(0).setOff();
        }
    }

    @Override
    public int read() {
        if(!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor is off or no sensors added");
        }
        int sum = sensors.stream().mapToInt(Sensor::read).sum();
        int average =  sum / sensors.size();
        readings.add(average);
        return average;
    }
    
    
    
}
