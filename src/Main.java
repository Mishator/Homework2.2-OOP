public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Griffindor("Harry Potter", 90, 90, 95, 98, 91),
                new Griffindor("Hermiona Granger", 90, 90, 90, 91, 95),
                new Griffindor("Ron Weasley", 82, 85, 80, 81, 89),
                new Puffenduy("Zachariah Smith", 87, 81, 91, 88, 93),
                new Puffenduy("Cedric Diggory", 82, 85, 93, 94, 83),
                new Puffenduy("Джастин Финч-Флетчли", 88, 91, 87, 88, 93 )

        };
        HogwartsStudentPrinter printer = new HogwartsStudentPrinter();
        for (Hogwarts student : students) {
            printer.print(student);
        }
        Hogwarts hogwarts = new Hogwarts("Harry Potter",81, 89);
        hogwarts.compareGriffindor((Griffindor) students[0], (Griffindor) students[1]);
        hogwarts.comparePuffenduy ((Puffenduy)students[3], (Puffenduy)students[4]);
    }
}