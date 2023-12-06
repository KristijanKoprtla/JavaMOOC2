
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ana
 */
public class ChangeHistory {

    private ArrayList<Double> changes;

    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }

    public void add(double status) {
        this.changes.add(status);
    }

    public void clear() {
        this.changes.clear();
    }

    @Override
    public String toString() {
        return this.changes.toString();
    }

    public double maxValue() {
        double max = changes.get(0);
        if (this.changes.isEmpty()) {
            return 0;
        }
        for (Double value : changes) {
            if (value > max) {
                max = value;
            }

        }
        return max;
    }
    
    public double minValue(){
        double min = changes.get(0);
        if (this.changes.isEmpty()) {
            return 0;
        }
        
        for (Double value : changes){
            if(value < min){
                min = value;
            }
        }
        return min;
    }
    
    public double average(){
        double sum = 0.0;
        if (this.changes.isEmpty()) {
            return 0;
        }
        for (Double value : changes){
            sum += value;
        }
        return sum / changes.size();
    }

}
