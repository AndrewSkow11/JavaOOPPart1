public class Hogwarts {
    private String firstName;
    private String lastName;
    private int powerOfMagic;
    private int transgressionDistance;

    private void validationPowerOfMagic() {
        if (powerOfMagic < 0) powerOfMagic = 0;
        if (powerOfMagic > 100) powerOfMagic = 100;
    }

    private void validationTransgressionDistance() {
        if (transgressionDistance < 0) transgressionDistance = 0;
        if (transgressionDistance > 100) transgressionDistance = 100;
    }

    public Hogwarts(String firstName, String lastName, int powerOfMagic, int transgressionDistance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
        validationPowerOfMagic();
        validationTransgressionDistance();
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

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }


    @Override
    public String toString() {
        return "Имя: " + firstName + ", фамилия: " + lastName + '\n' +
                "сила магии: " + powerOfMagic + ", дистанция трансгресии: " + transgressionDistance;
    }
}
