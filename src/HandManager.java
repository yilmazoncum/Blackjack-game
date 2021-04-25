import java.util.ArrayList;

public class HandManager extends Deck{

    ArrayList<Card> hand = new ArrayList<Card>();
    int handSum = 0;

    @Override
    void removeTop() {
        super.removeTop();
    }

    @Override
    Card top() {
        return super.top();
    }

    void hit(){
        hand.add(top());
        removeTop();
    }

    void printHand(){
        int sum= 0;
        for (Card x: hand) {
            sum += x.Value;
            System.out.print(x.suit + " " + x.rank+ "  ");
        }
        handSum = sum;
        System.out.print("|" + sum + "|");
    }

}
