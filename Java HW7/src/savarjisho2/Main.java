package savarjisho2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        cars[0] = new Car("Toyota", "Camry", "AA-444-BB");
        Car.Engine engine1 = cars[0].new Engine("ბენზინი", 4, 300000);

        cars[1] = new Car("BMW", "X5", "CC-444-DD");
        Car.Engine engine2 = cars[1].new Engine("დიზელი", 6, 500000);

        cars[2] = new Car("Honda", "E-Class", "EE-777-FF");
        Car.Engine engine3 = cars[2].new Engine("ბენზინი", 8, 400000);

        Car.Engine[] engines = {engine1, engine2, engine3};

        int maxIndex = 0;
        int maxMileage = engines[0].getMileageCapacity();

        for (int i = 1; i < engines.length; i++) {
            if (engines[i].getMileageCapacity() > maxMileage) {
                maxMileage = engines[i].getMileageCapacity();
                maxIndex = i;
            }
        }

        System.out.println("=== მაქსიმალური რესურსის მქონე ავტომობილი ===");
        cars[maxIndex].printInfo();
        engines[maxIndex].printInfo();
    }
}