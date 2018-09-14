package operators;

public class LogicalOperator {

    public static void main(String[] args) {

        // logical operator = single &

        int students = 150;
        int rooms = 0;

        if(rooms > 0 & (students/rooms) > 30) {
            /*
                Jednoargumentowy operator & sprawdza zawsze oba składniki, nawet jeśli pierwszy to FALSE!
                Pierwszy składnik to FALSE, ale przy drugim będzie dzielił przez 0!!!
                Wynikiem jest wyjątek:
                ************************************
                Exception in thread "main" java.lang.ArithmeticException: / by zero
                ************************************
             */

            // To się nigdy nie wywoła, bo wcześniej zostanie rzucony wyjątek ArithmeticException!
            System.out.println("Inside logical operator AND");
        }

    }
}
