public enum Outcome {
    WINNER("You won"), LOSER("You lost"), DRAW("It's a draw");

    public final String message;

    private Outcome(String msg){
        this.message = msg;
    }
    public static Outcome winIfTrue(boolean val) {
        return (val) ? WINNER : LOSER;
    }
}
