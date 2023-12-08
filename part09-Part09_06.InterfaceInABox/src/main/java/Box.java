
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
public class Box implements Packable{
    private double maxCapacity;
    private ArrayList<Packable> items;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item){
        if(getCurrentWeight() + item.weight() <= maxCapacity){
            items.add(item);
        }
    }
    
    public double getCurrentWeight(){
        double totalWeight = 0;
        for (Packable item : items){
            totalWeight += item.weight();
        }
        return totalWeight;
    }
    
    public double weight(){
        return getCurrentWeight();
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
    
    

    
    
    
    
}
