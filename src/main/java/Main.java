public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (Card card : deck.allCards) {
            System.out.println(card);
        }
        deck.shuffle();
        for (Card card : deck.allCards) {
            System.out.println(card);
        }
    }
}
