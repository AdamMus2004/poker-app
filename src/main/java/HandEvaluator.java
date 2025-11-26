import java.util.ArrayList;
import java.util.List;

public class HandEvaluator {
    List<Player> players;
    List<Card> board;

    public HandEvaluator(List<Player> players, List<Card> board) {
        this.players = players;
        this.board = board;
    }

    public String winner(){
        Card highestValueCard = null;
        Player winnerPlayer = null;
        int max = Integer.MIN_VALUE;
        for (Player player : players) {
            List<Card> playerCardsPlusBoard = new ArrayList<>();
            playerCardsPlusBoard.addAll(player.hand);
            playerCardsPlusBoard.addAll(board);

            for (Card card : playerCardsPlusBoard) {
                int valueOfCard = card.getRank().getValue();
                if (valueOfCard>max){
                    max=valueOfCard;
                    highestValueCard=card;
                    winnerPlayer = player;

                }
            }
        }
        return "The winner is "+ winnerPlayer.getName()+ " with highest card: "+ highestValueCard;
    }
}
