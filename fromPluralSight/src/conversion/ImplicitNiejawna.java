package conversion;

public class ImplicitNiejawna {

    public static void main(String[] args) {
        //Automatyczna konwersja przez kompilator

        int iVal = 50;
        long lVal = iVal;

        System.out.println("Int converted to long automatically: " + lVal);
    }

}
