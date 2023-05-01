public class Puffenduy extends Hogwarts {
    private int hardworking;
    private int fidelity;
    private int honesty;

    public Puffenduy(String nameStudent, int witchcraft, int transgression, int hardworking, int fidelity, int honesty) {
        super(nameStudent, witchcraft, transgression);
        this.hardworking = hardworking;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getFidelity() {
        return fidelity;
    }

    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
