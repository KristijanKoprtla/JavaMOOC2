
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
public class Herd implements Movable {

    private List<Movable> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable organism : organisms) {
            result.append(organism.toString()).append("\n");
        }
        return result.toString();
    }

    public void addToHerd(Movable movable) {
        this.organisms.add(movable);
    }

    public void move(int dx, int dy) {
        for(Movable organism : organisms){
            organism.move(dx, dy);
        }
    }
}
