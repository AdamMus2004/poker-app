public class PlayerResult {
    Player player;
    HandValue handValue;
    boolean isWinner;

    public PlayerResult(Player player, HandValue handValue, boolean isWinner) {
        this.player = player;
        this.handValue = handValue;
        this.isWinner = isWinner;
    }

    public Player getPlayer() {
        return player;
    }

    public HandValue getHandValue() {
        return handValue;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    @Override
    public String toString() {
        return player.getName() + ": " + handValue + (isWinner ? " (Winner)" : "");
    }
}
