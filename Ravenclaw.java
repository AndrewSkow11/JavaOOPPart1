//Когтевранцы умны, мудры, остроумны и полны творчества.
//Ravenclaws are smart, wise, witty and full of creativity.

public class Ravenclaw extends Hogwarts {
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

    @Override
    public String toString() {
        return super.toString() +
                "умность: " + smart +
                ", мудрость: " + wise +
                ", остроумие: " + witty +
                ", креативность: " + fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }
}
