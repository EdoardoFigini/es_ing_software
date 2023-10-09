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
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.toString());
    }
}