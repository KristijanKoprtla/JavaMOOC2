/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class Student extends Person {

    private int studCreds = 0;

    public Student(String name, String adress) {
        super(name, adress);
    }

    public void study() {
        this.studCreds++;
    }

    public int credits() {
        return this.studCreds;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + credits();
    }

}
