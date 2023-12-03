
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
public class TodoList {
    private ArrayList<String> todos;
    
    public TodoList(){
        this.todos = new ArrayList<>();
    }
    
    public void add(String task){
        this.todos.add(task);
    }
    
    public void print(){
        int index = 0;
        for(String todo : todos){
            index++;
            System.out.println(index + ": " + todo);

        }
    }
    
    public void remove(int number){
        this.todos.remove(number - 1);
        
    }
    
    
}
