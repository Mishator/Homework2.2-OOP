public class Hogwarts {
    private String nameStudent;
    private int witchcraft;
    private int transgression;

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public Hogwarts(String nameStudent, int witchcraft, int transgression) {
        this.nameStudent = nameStudent;
        this.witchcraft = this.witchcraft;
        this.transgression = this.transgression;
    }

    @Override
    public String toString() {
        return  "nameStudent='" + nameStudent  + ", witchcraft=" + witchcraft + ", transgression=" + transgression + '}';
    }
}

