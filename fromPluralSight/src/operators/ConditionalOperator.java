package operators;

public class ConditionalOperator {

    public static void main(String[] args) {

        int students = 150;
        int rooms = 0;

        if(rooms >0 && (students/rooms) > 30 ) {

            /*
                Dwuargumentowy operator && sprawdza do pierwszego składnika, którego wartość logiczna będzie FALSE.
                Skoro rooms>0 = FALSE to drugiego składnika już nie sprawdza i nie wchodzi do IFa
             */


            // to się nie wykona, bo składnik rooms>0 wynosi FALSE
            System.out.println("Inside conditional operator");
        }

        System.out.println("Outside conditional operator");

    }
}
