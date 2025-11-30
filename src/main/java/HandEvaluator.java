import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class HandEvaluator {
    List<Player> players;
    List<Card> board;

    public HandEvaluator(List<Player> players, List<Card> board) {
        this.players = players;
        this.board = board;
    }

    public HandValue evaluateHand(Player player) {
        List<Card> playerHand = new ArrayList<>();
        playerHand.addAll(board);
        playerHand.addAll(player.hand);

        playerHand.sort((a,b)->b.getRank().getValue() - a.getRank().getValue());

        List<Card> bestFiveCards = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            bestFiveCards.add(playerHand.get(i));
        }

        List<Integer> tiebreakers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            tiebreakers.add(playerHand.get(i).getRank().getValue());
        }

        return new HandValue(1,bestFiveCards,tiebreakers,"High Card");
    }


}
