import java.util.ArrayList;

public class MemePriestess{

    public static void main(String[] args){

        Deck d = new Deck("arcana");
        d.shuffle();
        d.flipShuffle();
        Card[] c = new Card[22];
        c = d.getCards();
        ArrayList<Card> reading = new ArrayList<Card>();
        for(int i = 0; i < 6; i++){
            reading.add(d.deal());
        }

        System.out.println("Your reading:");
        for(Card x : reading){
            System.out.println(x);
        }




    }
}