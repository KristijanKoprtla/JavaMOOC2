/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class Cat extends Animal implements NoiseCapable {
    private String name;

    public Cat(String name) {
        super(name);
        this.name = name;
    }
    
    public Cat(){
        super("Cat");
        this.name = "Cat";
    }
    
    public void purr(){
        System.out.println(this.name + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
    
    

    
    
}
