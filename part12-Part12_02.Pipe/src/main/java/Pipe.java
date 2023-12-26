
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
public class Pipe <T>{
    private List<T> pipes;

    public Pipe() {
        this.pipes = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipes.add(value);
    }
    
    public T takeFromPipe() {
       return this.pipes.isEmpty() ? null : this.pipes.remove(0);
    }
    
    public boolean isInPipe() {
        return this.pipes.isEmpty() ? false : true;
    }
    
    
}
