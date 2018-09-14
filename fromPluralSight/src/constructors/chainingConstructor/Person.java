package constructors.chainingConstructor;

public class Person {

    String name;
    int age;

    public Person() {
        this.age = 1;
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }
}
