package HomeWork.HomeWork4.part1;

public class studentTest {
    public static double calculateAverageGrade1() {
        Student st1 = new Student(1, "Alan", "Wake", 3, 70, 60, 100);
        return (st1.mathGrade + st1.economicsGrade + st1.foreignLanguageGrade) / 3;
    }

    public static double calculateAverageGrade2() {
        Student st2 = new Student(2, "Rose", "Marigold", 5, 90, 70, 80);
        return (st2.mathGrade + st2.economicsGrade + st2.foreignLanguageGrade) / 3;
    }

    public static double calculateAverageGrade3() {
        Student st3 = new Student(3, "Barry", "Wheeler", 4, 100, 80, 80);
        return (st3.mathGrade + st3.economicsGrade + st3.foreignLanguageGrade) / 3;
    }

    public static void main(String[] args) {
        System.out.println(calculateAverageGrade1() + "\n" + calculateAverageGrade2() + "\n" + calculateAverageGrade3());
    }
}
