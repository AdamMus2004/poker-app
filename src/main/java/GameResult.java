import java.util.List;

public class GameResult {
    List<PlayerResult> playerResults;
    List<Player> winners;
    HandValue winningHand;
    List<Card> board;
    String summary;

    public GameResult(List<PlayerResult> playerResults,
                      List<Player> winners,
                      HandValue winningHand,
                      List<Card> board,
                      String summary) {
        this.playerResults = playerResults;
        this.winners = winners;
        this.winningHand = winningHand;
        this.board = board;
        this.summary = summary;
    }

    public String getSummary() {
        StringBuilder sb = new StringBuilder();

        sb.append("Board");
        for (Card card : board) {
            sb.append(card).append(" ");
        }
        sb.append("\n");

        for (PlayerResult result : playerResults) {
            sb.append(result).append("\n");
        }

        if (winners.size()>1){
            sb.append("Winners: ");
        } else sb.append("Winner: ");

        for (Player player : winners) {
            sb.append(player.getName()).append(" ");
        }
        sb.append("with hand: ").append(winningHand).append("\n");
        return sb.toString();
    }

}
