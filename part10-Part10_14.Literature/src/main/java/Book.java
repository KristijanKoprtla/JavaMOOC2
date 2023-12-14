/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class Book{
    private String name;
    private int yearRestriction;

    public Book(String name, int yearRestriction) {
        this.name = name;
        this.yearRestriction = yearRestriction;
    }

    public String getName() {
        return name;
    }

    public int getYearRestriction() {
        return yearRestriction;
    }
    
    public String toString(){
        return this.getName() + " (recommended for " + this.getYearRestriction() + " year-olds or older)";
    }
    
}
