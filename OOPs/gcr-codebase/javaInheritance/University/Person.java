package University;

public class Person {
    protected int personId;
    protected String name;

    public Person(int id, String name) {
        this.personId = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "personId " + personId + "\nPerson name: " + name;
    }

}
