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

    public static void main(String[] args) {

        Person p1 = new Person("Maniek", 12);
        System.out.println(p1.name + " " + p1.age);

    }
}
