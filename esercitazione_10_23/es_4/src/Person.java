public class Person {
    private final int age;
    private final String name;

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int getage() {
        return this.age;
    }

    public int ageDifference(Person p1, Person p2){
        return p2.age - p1.age;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
