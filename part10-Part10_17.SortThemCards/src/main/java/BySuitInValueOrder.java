
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ana
 */
public class BySuitInValueOrder implements Comparator<Card> {

    public int compare(Card c1, Card c2) {
        int suitComparison = c1.getSuit().ordinal() - c2.getSuit().ordinal();

        if (suitComparison != 0) {
            return suitComparison;
        } else {
            return c1.compareTo(c2);
        }

    }
}
