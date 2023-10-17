import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);

        System.out.println(myStack.toString());

        System.out.println("-----------------------------------------------------");

        try {
            myStack.pop();
            myStack.pop();
            System.out.println(myStack.toString());
        } catch (NoElementException e){
            throw new RuntimeException(e);
        }

        System.out.println("-----------------------------------------------------");

        for(Object i : myStack){
            System.out.println(i);
        }

        System.out.println("-----------------------------------------------------");

        for(Object i : myStack){
            int x = (Integer) i;
            System.out.println(x);
        }

        System.out.println("-----------------------------------------------------");

        // funziona solo cambiando la dichiarazione della classe con il generico Iterable<E>

        for(Integer i: myStack){
            int x = (Integer) i;
            System.out.println(x);
        }
    }
}