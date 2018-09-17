package parameterImmutability;

public class PrimitiveTypes {

    public static void main(String[] args) {

        int val_1 = 10;
        int val_2 = 20;
        System.out.println("BEFORE swap value1 = " + val_1);
        System.out.println("BEFORE swap value2 = " + val_2);
        System.out.println();

        swap(val_1, val_2);

        System.out.println();

        System.out.println("AFTER swap value1 = " + val_1);
        System.out.println("AFTER swap value2 = " + val_2);
    }

    public static void swap(int i, int j) {

        // Swap just inside the function, but before and after the function - no change of original values!

        int k = i;
        i = j;
        j = k;

        System.out.println("INSIDE swap value1 = " + i);
        System.out.println("INSIDE swap value2 = " + j);
        System.out.println();
    }

}
