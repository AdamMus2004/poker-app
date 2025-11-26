import java.util.List;

public class HandValue {
    int rank;
    List<Card> bestFiveCards;
    List<Integer> tiebreakers;
    String handName;

    public HandValue(int rank, List<Card> bestFiveCards, List<Integer> tiebreakers, String handName) {
        this.rank = rank;
        this.bestFiveCards = bestFiveCards;
        this.tiebreakers = tiebreakers;
        this.handName = handName;
    }

    int compareTo(HandValue other) {
        if (this.rank > other.rank) return 1;
        if (this.rank < other.rank) return -1;

        for (int i = 0; i < this.tiebreakers.size(); i++) {
            int a = this.tiebreakers.get(i);
            int b = other.tiebreakers.get(i);

            if (a > b) return 1;
            if (a < b) return -1;
        }
        return 0;
    }
    @Override
    public String toString() {
        return handName+" "+bestFiveCards;
    }
}
