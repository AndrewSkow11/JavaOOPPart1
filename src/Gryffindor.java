// Всем Гриффиндорцам присущи благородство, честь и храбрость.

public class Gryffindor extends Hogwarts {
    private byte nobility;
    private byte honor;
    private byte bravery;


    public Gryffindor(String firstName, String lastName, byte powerOfMagic, byte transgressionDistance, byte nobility, byte honor, byte bravery) {
        super(firstName, lastName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nблагородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + bravery +
                '\n';
    }
}



