/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class Dog extends Animal implements NoiseCapable {

    private String name;

    public Dog() {
        super("Dog");
        this.name = "Dog";
    }

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    public void bark() {
        System.out.println(this.name + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
