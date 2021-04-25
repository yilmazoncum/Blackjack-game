import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();
        CroupierHand croupierHand = new CroupierHand();
        PlayerHand playerHand = new PlayerHand();

        gameStart(deck,croupierHand,playerHand);

        while (true){ //
            System.out.println();
            System.out.println("Kart çek(1) Kal(2)");

            if(sc.nextInt() == 1){
                playerHand.hit();
                croupierHand.printHand();
                System.out.println();
                playerHand.printHand();
                System.out.println();
            }else{
                break;
            }
        }

        croupierHand.midGame();
        playerHand.printHand();



















    }
    static void gameStart(Deck deck,CroupierHand croupierHand,PlayerHand playerHand){

        deck.Shuffle();

        croupierHand.hit();
        croupierHand.hit();

        System.out.print("Krupiyerin eli :  ");
        croupierHand.printHand();

        playerHand.hit();
        playerHand.hit();

        System.out.println();
        System.out.print("Oyuncunun eli :  ");
        playerHand.printHand();
    }



}
