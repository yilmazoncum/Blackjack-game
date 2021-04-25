import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck = new ArrayList<Card>();

Deck(){
    for(int i=0 ; i < 4; i++){ // tip
        for(int j =0 ; j < 13 ; j++ ){ //değer
            deck.add(new Card(j,i));
        }
    }
    Shuffle();
}

void Print(){//yazdır
    for(int i = 0 ;i < 52 ; i++ ){
        System.out.println(deck.get(i).suit + " " + deck.get(i).rank+ " "+ deck.get(i).Value);
    }
}

void Shuffle(){
    Collections.shuffle(deck);
}

Card top(){
    return deck.get(0);
}

void removeTop(){
    deck.remove(0);

}













































}

