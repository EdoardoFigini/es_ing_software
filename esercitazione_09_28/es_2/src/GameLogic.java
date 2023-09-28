import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private final Scanner scanner;

    public GameLogic(InputStream in) {
        this.scanner = new Scanner(in);
    }

    public void close(){
        this.scanner.close();
    }

    public Outcome choiceSubmitted(Choice userChoice) {
        Choice computerChoice = Choice.getRandomChoice(new Random());
        System.out.println("You chose: " + userChoice.toString());
        return userChoice.resultAgainst(computerChoice);
    }

    public boolean round() {
        System.out.println("Insert your choice: ");
        String input = this.scanner.next();
        try{
            Choice choice = Choice.parseInput(input);
            Outcome o = choiceSubmitted(choice);
            System.out.println(o.toString());
            return true;
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        GameLogic gl = new GameLogic(System.in);
        boolean check;
        do {
            check = gl.round();
        } while (check);
        gl.close();
    }
}
