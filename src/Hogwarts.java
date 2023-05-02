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
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return  "nameStudent='" + nameStudent  + ", witchcraft=" + witchcraft + ", transgression=" + transgression;
    }
    public void compareGriffindor(Griffindor first,
                                  Griffindor second) {
        int firstPoints = first.getBravery() + first.getHonor() + first.getNobility();
        int secondPoints = second.getBravery() + second.getHonor() + second.getNobility();
        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getNameStudent() + " лучше чем " + second.getNameStudent());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getNameStudent() + " лучше чем " + first.getNameStudent());
        } else {
            System.out.println("Студенеты " + second.getNameStudent() + " и " + first.getNameStudent() + " равны.");

        }
    }

    public void comparePuffenduy(Puffenduy first,
                                 Puffenduy second) {
        int firstPoints = first.getHardworking() + first.getFidelity() + first.getHonesty();
        int secondPoints = second.getHardworking() + second.getFidelity() + second.getHonesty();
        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getNameStudent() + " лучше чем " + second.getNameStudent());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getNameStudent() + " лучше чем " + first.getNameStudent());
        } else {
            System.out.println("Студенеты " + second.getNameStudent() + " и " + first.getNameStudent() + " равны.");

        }
    }

    public void compareKogtevran(Kogtevran first,
                                 Kogtevran second) {
        int firstPoints = first.getMind() + first.getWisdom() + first.getWit() + first.getCreativity();
        int secondPoints = second.getMind() + second.getWisdom() + second.getWit() + second.getCreativity();
        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getNameStudent() + " лучше чем " + second.getNameStudent());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getNameStudent() + " лучше чем " + first.getNameStudent());
        } else {
            System.out.println("Студенеты " + second.getNameStudent() + " и " + first.getNameStudent() + " равны.");

        }
    }

    public void compareSlytherin(Slytherin first,
                                 Slytherin second) {
        int firstPoints = first.getCunning() + first.getDecisiveness() + first.getAmbition() + first.getResourcefulness() + first.getRule();
        int secondPoints = second.getCunning() + second.getDecisiveness() + second.getAmbition() + second.getResourcefulness() + second.getRule();
        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getNameStudent() + " лучше чем " + second.getNameStudent());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getNameStudent() + " лучше чем " + first.getNameStudent());
        } else {
            System.out.println("Студенеты " + second.getNameStudent() + " и " + first.getNameStudent() + " равны.");

        }
    }
}

