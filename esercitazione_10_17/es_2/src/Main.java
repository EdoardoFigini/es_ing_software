public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mario");;
        Person p2;
        Person p3;
        Person p4;
        try {
            p2 = new Person("Giuseppe", 20);
            p3 = new Person("Arcibaldo", 120);
            p4 = new Person("Romualdo", 180);
        } catch (VeryOldException e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("---------------------------------------");
        }

        try {
            p1.setAge(190);
        } catch (VeryOldException | TooOldException e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("End of program");
        }
    }
}
