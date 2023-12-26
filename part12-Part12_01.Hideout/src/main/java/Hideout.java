
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class Hideout <T> {
    private List<T> list;

    public Hideout() {
        this.list = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        this.list.clear();
        this.list.add(toHide);
    }
    
    public T takeFromHideout() {
       
        if(this.list.isEmpty()){
            return null;
        } else {
             T taken = this.list.remove(0);
            return taken;
        }
    }
    
    public boolean isInHideout(){
        if(this.list.isEmpty()){
            return false;
        }else {
            return true;
        }
    }
    
    
}
