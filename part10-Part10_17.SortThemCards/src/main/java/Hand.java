
import java.util.ArrayList;
import java.util.Collections;
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
public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.forEach(card -> System.out.println(card));
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());

    }

    @Override
    public int compareTo(Hand hand) {
        int sumOfThisHand = this.cards.stream().mapToInt(card -> card.getValue()).sum();
        int sumOfOtherHand = hand.cards.stream().mapToInt(Card::getValue).sum();

        return Integer.compare(sumOfThisHand, sumOfOtherHand);
    }

}
