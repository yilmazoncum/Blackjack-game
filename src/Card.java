public class Card {

    String[] Suits = {
            "Kupa", "Karo", "Maça", "Sinek"
    };

    String[] Ranks = {
            "As", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Vale", "Kiz", "Papaz"
    };


    String rank;
    String suit;
    int Value;

    Card(int rankNum, int suitNum) {

        rank = Ranks[rankNum];
        suit = Suits[suitNum];

        if (rankNum == 10 ||rankNum == 11 || rankNum == 12) {
            Value = 10;
        } else {
            Value = rankNum + 1;
        }

    }

    public void setRank(int rankNum) {
        rank = Ranks[rankNum];
    }

    public void setSuit(int suitNum) {
        suit = Suits[suitNum];
    }
}
