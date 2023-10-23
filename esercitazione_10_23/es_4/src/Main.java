import java.util.List;

class Group{
    List<Person> getMembers();
}

public class Main {
    public static void printAverage(Group group){
        group.getMembers().stream().mapToInt(Person::getage).average().ifPresent(System.out::println);
    }
}
