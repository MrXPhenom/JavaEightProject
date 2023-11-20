package ClassWork;

public class Car {
    String engineModel;
    double weight;
    void showWeightAndEngineModel(){
        System.out.println("A car has those characteristics " + weight + " " + engineModel);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.engineModel = "V8";
        c1.weight = 1300;
        c1.showWeightAndEngineModel();
    }
}
