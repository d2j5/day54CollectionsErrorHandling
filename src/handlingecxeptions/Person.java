package handlingecxeptions;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid name: Name cannot be null or empty.");
        }
        if(name.length() > 40) {
            throw new IllegalArgumentException("Invalid name: Name length should be under 40 characters");
        }
        if(age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age: Age should be between 0 and 120");
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
