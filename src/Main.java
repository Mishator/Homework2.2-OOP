public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Griffindor("Harry Potter", 90, 90, 95, 98, 91),
                new Griffindor("Hermiona Granger", 90, 90, 90, 91, 95),
                new Griffindor("Ron Weasley", 82, 85, 80, 81, 89)
        };
        HogwartsStudentPrinter printer = new HogwartsStudentPrinter();
        for (Hogwarts student : students) {
            printer.print(student);
        }
        Hogwarts hogwarts = new Hogwarts("Harry Potter",81, 89);
        hogwarts.compareGriffindor((Griffindor) students[0], (Griffindor) students[1]);
    }
}