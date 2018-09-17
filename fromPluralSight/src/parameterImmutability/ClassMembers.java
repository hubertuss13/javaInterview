package parameterImmutability;

public class ClassMembers {

    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ClassMembers() {}

    public ClassMembers(int number) {
        this.number = number;
    }



    public static void main(String[] args) {

        ClassMembers val_1 = new ClassMembers(30);
        ClassMembers val_2 = new ClassMembers(60);

        System.out.println("BEFORE swap value1 = " + val_1.getNumber());
        System.out.println("BEFORE swap value2 = " + val_2.getNumber());
        System.out.println();

        swap(val_1, val_2);

        System.out.println();
        System.out.println("AFTER swap value1 = " + val_1.getNumber());
        System.out.println("AFTER swap value2 = " + val_2.getNumber());


    }


    public static void swap(ClassMembers i, ClassMembers j) {

        int temp = i.getNumber();
        i.setNumber(j.getNumber());
        j.setNumber(temp);

        System.out.println("INSIDE swap: val_1 = " + i.getNumber());
        System.out.println("INSIDE swap: val_2 = " + j.getNumber());
    }

}
