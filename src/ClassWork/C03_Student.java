package ClassWork;

public class C03_Student {
    int mathScore;
    int programmingScore;
    public C03_Student(int mathScore, int programmingScore) {
        this.mathScore = mathScore;
        this.programmingScore = programmingScore;
    }

    public static void main(String[] args) {
        C03_Student student1 = new C03_Student(3, 5);
        C03_Student student2 = new C03_Student(4, 3);
    }
}
