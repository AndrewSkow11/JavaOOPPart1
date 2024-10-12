// Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
// All Slytherin students are characterized by cunning,
// determination,
// ambition,
// resourcefulness
// and a thirst for power.
public class Slytherin  extends Hogwarts{

    private int characterizedByCunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String firstName, String lastName, int powerOfMagic, int transgressionDistance, int characterizedByCunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(firstName, lastName, powerOfMagic, transgressionDistance);

        if (characterizedByCunning < 0) characterizedByCunning = 0;
        if (characterizedByCunning > 100) characterizedByCunning = 100;


        if (determination < 0) determination = 0;
        if (determination > 100) determination = 100;

        if (ambition < 0) ambition = 0;
        if (ambition > 100) ambition = 100;

        if (resourcefulness < 0) resourcefulness = 0;
        if (resourcefulness > 100) resourcefulness = 100;

        if (thirstForPower < 0) thirstForPower = 0;
        if (thirstForPower > 100) thirstForPower = 100;

        this.characterizedByCunning = characterizedByCunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
}
