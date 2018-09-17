package objectEquality;

public class LoteryEqualsMethodTest {

    public static void main(String[] args) {

        Lotery los3 = new Lotery(13);
        Lotery los4 = new Lotery(13);
        boolean isEqual = false;

        if(los3.equals(los4)) {
            isEqual = true;
            System.out.println("Dwa obiekty są równe");
        } else {
            isEqual = false;
            System.out.println("Metoda equals() również porównuje czy referencje wskazują na ten sam obiekt");
        }

        System.out.println("Wynik logiczny operacji porównania: " + isEqual);

    }
}
