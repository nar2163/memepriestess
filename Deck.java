import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class Deck{
    private Card[] cards;
    private final int total = 22;
    private int top = 0;

    public Deck(String a){
        this.cards = new Card[total];
        cards[0] = new Arcana("world");
        cards[1] = new Arcana("judgement");
        cards[2] = new Arcana("sun");
        cards[3] = new Arcana("moon");
        cards[4] = new Arcana("star");
        cards[5] = new Arcana("tower");
        cards[6] = new Arcana("devil");
        cards[7] = new Arcana("temperance");
        cards[8] = new Arcana("death");
        cards[9] = new Arcana("hanged");
        cards[10] = new Arcana("justice");
        cards[11] = new Arcana("wheel");
        cards[12] = new Arcana("hermit");
        cards[13] = new Arcana("strength");
        cards[14] = new Arcana("chariot");
        cards[15] = new Arcana("lovers");
        cards[16] = new Arcana("hierophant");
        cards[17] = new Arcana("emperor");
        cards[18] = new Arcana("empress");
        cards[19] = new Arcana("priestess");
        cards[20] = new Arcana("magician");
        cards[21] = new Arcana("fool");
    }

    public void shuffle(){
        List<Card> temp = Arrays.asList(this.cards);
        Collections.shuffle(temp);
        temp.toArray(this.cards);
    }

    public void flipShuffle(){
        Random r = new Random();
        for(Card c : cards){
            c.setDirection(r.nextInt(2));
        }
    }

    public Card deal(){
        Card c = cards[top];
        top++;
        return c;
    }

    public Card[] getCards() {
        return cards;
    }


}