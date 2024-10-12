//Студенты Пуффендуя трудолюбивы, верны, честны.
//Hufflepuff students are hardworking, loyal, and honest.

public class Hufflepuff extends Hogwarts{

    private int hardworking;
    private int loyal;
    private int honest;


    public Hufflepuff(String firstName, String lastName, int powerOfMagic, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(firstName, lastName, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
}
