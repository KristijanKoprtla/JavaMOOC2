
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class IOU {
    private HashMap<String, Double> debt;

    public IOU() {
        this.debt = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        
        this.debt.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
       return this.debt.getOrDefault(toWhom, 0.0);
       
    }
    
    
    
}
