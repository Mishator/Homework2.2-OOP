public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Griffindor("Harry Potter", 90, 90, 95, 98, 91),
                new Griffindor("Hermiona Granger", 90, 90, 90, 91, 95),
                new Griffindor("Ron Weasley", 82, 85, 80, 81, 89),
                new Puffenduy("Zachariah Smith", 87, 81, 91, 88, 93),
                new Puffenduy("Cedric Diggory", 82, 85, 93, 94, 83),
                new Puffenduy("Джастин Финч-Флетчли", 88, 91, 87, 88, 93 ),
                new Kogtevran("Zhou Chang", 91, 89, 85,81, 91, 96),
                new Kogtevran("Padma Patil", 91, 96, 89, 87, 92, 95),
                new Kogtevran("Marcus Belby", 90, 93, 91, 89, 93, 94),

        };
        HogwartsStudentPrinter printer = new HogwartsStudentPrinter();
        for (Hogwarts student : students) {
            printer.print(student);
        }
        Hogwarts hogwarts = new Hogwarts("Harry Potter",81, 89);
        hogwarts.compareGriffindor((Griffindor) students[0], (Griffindor) students[1]);
        hogwarts.comparePuffenduy ((Puffenduy)students[3], (Puffenduy)students[4]);
        hogwarts.compareKogtevran ((Kogtevran) students[6], (Kogtevran) students[7]);
    }
}