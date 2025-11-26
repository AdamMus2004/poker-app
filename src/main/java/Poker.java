public class Poker {
     int rounds;
     int numberOfPlayers;
     int startChips;

    public Poker(int rounds, int numberOfPlayers, int startChips) {
        this.rounds = rounds;
        this.numberOfPlayers = numberOfPlayers;
        this.startChips = startChips;
    }

    public void play() {
        for (int i = 1; i <= rounds; i++) {

            Deck deck = new Deck();
            Game game = new Game(deck,numberOfPlayers,startChips);
            game.startGame();
            game.dealTwoCardsToEachPlayer();
            game.showTheGameState();
            game.flop();
            game.showBoard();
            game.turn();
            game.showBoard();
            game.river();
            game.showBoard();
        }
    }
}
