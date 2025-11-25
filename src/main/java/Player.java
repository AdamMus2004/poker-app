import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    int playersChips;
    List<Card> hand;


    public Player(String name, int playersChips) {
        this.name = name;
        this.playersChips = playersChips;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPlayersChips() {
        return playersChips;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayersChips(int playersChips) {
        this.playersChips = playersChips;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playersChips=" + playersChips +
                ", hand=" + hand +
                '}';
    }
}
