/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class MisplacingBox extends Box{
    private Item item;

    public MisplacingBox() {
        this.item = null;
    }
    public void add(Item item) {
        if (this.item == null) {
            this.item = item;
        }
    }

    public boolean isInBox(Item item) {
        return false;
    }
    
    
    
}
