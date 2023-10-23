import java.util.List;

class Group {
    public List<Person> getMembers();
}

public class Main {
    public static List<Person> namesInGroups(List<Group> groups) {
        return groups.stream().flatMap(x -> x.getMembers().stream()).filter(x -> x.getage() >= 18).toList();
    }
}
