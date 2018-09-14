package skroconyZapisReturnIfElse;

public class Skrot {

    public int totalSeats, reservedSeats;

    public Skrot() {
        this.totalSeats = 0;
        this.reservedSeats = 0;
    }

    public Skrot(int totalSeats, int reservedSeats) {
        this.totalSeats = totalSeats;
        this.reservedSeats = reservedSeats;
    }

    public boolean isEnoughPlace() {

        /*
            Zapis:

        if(totalSeats > reservedSeats)
            return true;
        else return false;

        mozna zastapic zapisem skroconym:
        */

        return (totalSeats > reservedSeats);
    }


    public static void main(String[] args) {

        Skrot skrot = new Skrot(100, 80);
        boolean result = skrot.isEnoughPlace();
        System.out.println(result);
    }

}
