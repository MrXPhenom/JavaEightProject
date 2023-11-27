package ClassWork;

public class C01_Car {
    String engineModel;
    double weight;
    void showWeightAndEngineModel(){
        System.out.println("A car has those characteristics " + weight + " " + engineModel);
    }

    public static void main(String[] args) {
        C01_Car c1 = new C01_Car();
        c1.engineModel = "V8";
        c1.weight = 1300;
        c1.showWeightAndEngineModel();
    }
}
