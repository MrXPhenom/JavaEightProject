package HomeWork.HomeWork4.part1;

public class Student {
    int id;
    String fName;
    String lName;
    double course;
    double mathGrade;
    double economicsGrade;
    double foreignLanguageGrade;

    public Student(int id, String fName, String lName, int course, int mathGrade, int economicsGrade, int foreignLanguageGrade) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.course = course;
        this.mathGrade = mathGrade;
        this.economicsGrade = economicsGrade;
        this.foreignLanguageGrade = foreignLanguageGrade;
    }
}
