//Всем Гриффиндорцам присущи благородство, честь и храбрость.
// //All Gryffindors are characterized by nobility, honor and courage.

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;


    public Griffindor(String firstName, String lastName, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(firstName, lastName, powerOfMagic, transgressionDistance);

        if (nobility < 0) nobility = 0;
        if (nobility > 100) nobility = 100;

        if (honor < 0) honor = 0;
        if (honor > 100) honor = 100;

        if (courage < 0) courage = 0;
        if (courage > 100) courage = 100;


        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() + "\nблагородство: " + nobility + ", честь: " + honor + ", храбрость: " + courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
}
