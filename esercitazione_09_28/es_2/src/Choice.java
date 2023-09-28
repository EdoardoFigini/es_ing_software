import java.util.Random;

public enum Choice {
    SCISSORS, PAPER, ROCK;

    public Outcome resultAgainst(Choice other) {
        if(this == other) {
            return Outcome.DRAW;
        } else {
            switch (this) {
                case ROCK:
                    Outcome.winIfTrue(other == SCISSORS);
                case PAPER:
                    Outcome.winIfTrue(other == ROCK);
                case SCISSORS:
                    Outcome.winIfTrue(other == PAPER);
                default:
                    throw new RuntimeException("Unexpected move");
            }
        }
    }

    public static Choice parseInput(String in) {
        return Choice.valueOf(Choice.class, in.toUpperCase());
    }

    public static Choice getRandomChoice(Random rand) {
        Choice[] values = Choice.values();
        return values[rand.nextInt(values.length)];
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
