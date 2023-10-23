import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Giovanni", 35));
        people.add(new Person("Mario", 90));
        people.add(new Person("Alberto", 5));
        people.add(new Person("Achille", 22));

        people.stream().sorted((p1, p2) -> {
            // return Integer.compare(p2.getage(), p1.getage());
            if(p1.getage() < p2.getage()) return 1;
            if(p2.getage() < p1.getage()) return -1;
            return 0;
        }).forEach(System.out::println);

        // people.stream().sorted((p1, p2) -> p1.ageDifference(p2)).forEach(System.out::println);
        // people.stream().sorted(Person::ageDifference).forEach(System.out::println);
    }
}
