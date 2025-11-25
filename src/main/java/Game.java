import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> players;
    Deck deck;
    int numberOfPlayers;
    List<Card> board;

    public Game(Deck deck, int numberOfPlayers) {
        this.deck = deck;
        this.numberOfPlayers = numberOfPlayers;
    }

    public  void startGame(){
        this.players = new ArrayList<>();
        this.board = new ArrayList<>();
        deck.shuffle();
        for (int i = 1; i <= numberOfPlayers; i++) {
            players.add(new Player("Player"+i,100));
        }
    }
    public void dealTwoCardsToEachPlayer() {
        for (Player player : players) {

            player.hand.add(deck.drawCard());
            player.hand.add(deck.drawCard());
        }
    }
    public void showTheGameState() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void flop(){
        board.add(deck.drawCard());
        board.add(deck.drawCard());
        board.add(deck.drawCard());
    }

    public void turn(){
        board.add(deck.drawCard());
    }

    public void river(){
        board.add(deck.drawCard());
    }

    public void showBoard(){
        for (Card card : board) {
            System.out.print(card);
        }
        System.out.println();
    }
    public void showDeckSize(){
        System.out.println(deck.allCards.size());
    }



}
