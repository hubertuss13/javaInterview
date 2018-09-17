package parameterImmutability;

public class Classes {

    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Classes() {}

    public Classes(int number) {
        this.number = number;
    }


    public static void main(String[] args) {

        Classes val_1 = new Classes(50);
        Classes val_2 = new Classes(100);

        System.out.println("BEFORE swap value1 = " + val_1.getNumber());
        System.out.println("BEFORE swap value2 = " + val_2.getNumber());
        System.out.println();

        swap(val_1, val_2);

        System.out.println();
        System.out.println("AFTER swap value1 = " + val_1.getNumber());
        System.out.println("AFTER swap value2 = " + val_2.getNumber());

    }

    public static void swap(Classes i, Classes j) {
        Classes k = i;
        i = j;
        j = k;

        System.out.println("INSIDE swap: val_1 = " + i.getNumber());
        System.out.println("INSIDE swap: val_2 = " + j.getNumber());
    }
}
