package objectEquality;

public class LoteryOperatorTest {

    public static void main(String[] args) {

        Lotery los1 = new Lotery(7);
        Lotery los2 = new Lotery(7);
        boolean isEqual = false;

        if(los1 == los2) {
            isEqual = true;
            System.out.println("Dwa obiekty są równe!");
        } else {
            isEqual = false;
            System.out.println("Operator == porównuje czy referencje los1 i los2 wskazują na ten sam obiekt");
        }

        System.out.println("Wartosc logiczna operacji porownania: " + isEqual);

    }
}
