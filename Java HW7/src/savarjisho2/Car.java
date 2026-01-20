package savarjisho2;

public class Car {
    private String manufacturer;
    private String model;
    private String licensePlate;

    public Car(String manufacturer, String model, String licensePlate) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public void printInfo() {
        System.out.println("მწარმოებელი: " + manufacturer);
        System.out.println("მოდელი: " + model);
        System.out.println("სახელმწიფო ნომერი: " + licensePlate);
    }

    public class Engine {
        private String fuelType;
        private int numberOfCylinders;
        private int mileageCapacity;

        public Engine(String fuelType, int numberOfCylinders, int mileageCapacity) {
            this.fuelType = fuelType;
            this.numberOfCylinders = numberOfCylinders;
            this.mileageCapacity = mileageCapacity;
        }

        public int getMileageCapacity() {
            return mileageCapacity;
        }

        public void printInfo() {
            System.out.println("საწვავის ტიპი: " + fuelType);
            System.out.println("ცილინდრების რაოდენობა: " + numberOfCylinders);
            System.out.println("რესურსი: " + mileageCapacity + " კმ");
        }
    }
}