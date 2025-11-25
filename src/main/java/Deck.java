import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public List<Card> allCards;

    public Deck(){
        allCards = new ArrayList<>();
        for (Suits suit : Suits.values()) {
            for (int i = 2; i < 14; i++) {
                allCards.add(new Card(i,suit));
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(allCards);
    }
}
