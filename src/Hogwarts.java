public class Hogwarts {
    private String firstName;
    private String lastName;

    private byte powerOfMagic;
    private byte transgressionDistance;

    public Hogwarts(String firstName, String lastName, byte powerOfMagic, byte transgressionDistance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(byte powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public byte getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(byte transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }


    @Override
    public String toString() {
        return "Имя: " + getFirstName() + ", Фамилия: " + getLastName() +
                '\n' + "Сила магии: " + getPowerOfMagic() + ", дистанция трансгресии: "+ getTransgressionDistance();

    }
}
