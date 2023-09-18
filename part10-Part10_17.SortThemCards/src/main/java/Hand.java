
import java.util.ArrayList;
import java.util.Collections;


public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        this.hand.forEach(c -> System.out.println(c.getSuit() + " " + c));
    }
    
    public void sort() {
        Collections.sort(this.hand);
    }
    
    public int handValue() {
        int value = this.hand.stream().mapToInt(c->c.getValue()).sum();
        return value;
    }

    @Override
    public int compareTo(Hand o) {
        return this.handValue() - o.handValue();
    }
    
    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
    
}
