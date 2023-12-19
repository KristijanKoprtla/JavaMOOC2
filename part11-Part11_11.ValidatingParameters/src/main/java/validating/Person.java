package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Person name cant be empty and must be smaller then 40 chars.");
        } else if (age > 120 || age < 0) {
            throw new IllegalArgumentException("Age must be betweenn 0 and 120");
        }
        this.name = name;

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
