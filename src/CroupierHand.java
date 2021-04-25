import java.util.ArrayList;

public class CroupierHand extends HandManager{


    void midGame(){
        while (true){
            if(handSum < 17){
                hit();
                printHand();
                System.out.println();
            }
            else break;

        }



    }
}
