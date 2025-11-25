public class Card {
    public int rank;
    public Suits suit;

    public Card(int rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suits getSuit() {
        return suit;
    }
}
