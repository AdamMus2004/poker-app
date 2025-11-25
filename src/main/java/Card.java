public class Card {
    private final Rank rank;
    private final Suits suit;

    public Card(Rank rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString() {

        return formatRank(rank.getValue()) + " " + suit.getValue();
    }
    public static String formatRank(int num) {
        switch (num){
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            case 14: return "A";
            default: return String.valueOf(num);
        }
    }

}
