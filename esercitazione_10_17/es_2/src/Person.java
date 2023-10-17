public class Person {
    private int age;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) throws VeryOldException {
        if(age >= 120 && age <= 150){
            throw new VeryOldException();
        } else if (age > 150) {
            throw new TooOldException();
        }
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) throws VeryOldException{
        if(age >= 120 && age <= 150){
            throw new VeryOldException();
        } else if (age > 150) {
            throw new TooOldException();
        }
        this.age = age;
    }
}
