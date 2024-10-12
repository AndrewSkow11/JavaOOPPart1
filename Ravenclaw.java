//Когтевранцы умны, мудры, остроумны и полны творчества.
//Ravenclaws are smart, wise, witty and full of creativity.

public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String firstName, String lastName, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(firstName, lastName, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }
}
