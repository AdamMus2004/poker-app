import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public List<Card> allCards;

    public Deck(){
        allCards = new ArrayList<>();
        for (Suits suit : Suits.values()) {
            for (Rank rank : Rank.values()) {
                allCards.add(new Card(rank,suit));
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(allCards);
    }
}
