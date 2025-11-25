public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Game game = new Game(deck,2);
        game.startGame();
        game.showDeckSize();
        game.dealTwoCardsToEachPlayer();
        game.showDeckSize();
        game.showTheGameState();
        game.flop();
        game.showBoard();
        game.showDeckSize();
        game.turn();
        game.showBoard();
        game.showDeckSize();
        game.river();
        game.showBoard();
        game.showDeckSize();
    }
}
