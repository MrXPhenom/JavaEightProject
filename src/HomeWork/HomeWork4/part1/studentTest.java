package HomeWork.HomeWork4.part1;

public class studentTest {
    public static void main(String[] args) {
        student st1 = new student(1, "Alan", "Wake", 3, 70, 60, 100);
        student st2 = new student(2, "Rose", "Marigold", 5, 90, 70, 80);
        student st3 = new student(3, "Barry", "Wheeler", 4, 100, 80, 80);

        int gpa1 = (st1.gpaEconomy + st1.gpaEnglish + st1.gpaMath) / 3;
        int gpa2 = (st2.gpaEconomy + st2.gpaEnglish + st2.gpaMath) / 3;
        int gpa3 = (st3.gpaEconomy + st3.gpaEnglish + st3.gpaMath) / 3;

        System.out.println("GPA for " + st1.fName + " " + st1.lName + " is " + gpa1 + "\n" +
                "GPA for " + st2.fName + " " + st2.lName + " is " + gpa2 + "\n" +
                "GPA for " + st3.fName + " " + st3.lName + " is " + gpa3);
    }
}
