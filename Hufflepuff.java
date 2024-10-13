//Студенты Пуффендуя трудолюбивы, верны, честны.
//Hufflepuff students are hardworking, loyal, and honest.

public class Hufflepuff extends Hogwarts {

    private int hardworking;
    private int loyal;
    private int honest;


    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public Hufflepuff(String firstName, String lastName, int powerOfMagic, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(firstName, lastName, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;


    }

    @Override
    public String toString() {
        return super.toString() + "\nтрудолюбие: " + hardworking + ", верность: " + loyal +
                ", честность: " + honest;
    }


}
