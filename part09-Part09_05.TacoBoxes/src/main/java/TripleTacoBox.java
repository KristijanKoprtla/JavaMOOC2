/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class TripleTacoBox implements TacoBox {
    private int tacos = 3;

    public TripleTacoBox() {
        this.tacos = tacos;
    }
    
    public int tacosRemaining(){
        return this.tacos;
    }
    
    public void eat(){
        if(this.tacos > 0){
            tacos--;
        }
    }
    
    
}
