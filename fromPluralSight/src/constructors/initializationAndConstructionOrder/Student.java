package constructors.initializationAndConstructionOrder;

public class Student {

    int id = 123;

    {
        this.id = 12;
    }

    public Student(){
    }

    public Student(int id) {
        this.id = id;
    }


    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println( s1.id );

    }
}

/*

    Initialization and Construction Order:
        1. Field Initialization
        2. Initialization Block
        3. Constructor

 */
