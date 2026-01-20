public class Vehicle {
    String brand;
    String carModel;
    int productionYear;
    String plateNumber;

    public Vehicle(String brand, String carModel, int productionYear, String plateNumber) {
        this.brand = brand;
        this.carModel = carModel;
        this.productionYear = productionYear;
        this.plateNumber = plateNumber;
    }

    void displayInfo() {
        System.out.println(
                "{\n" +
                        "\t\"Brand\": \"" + brand + "\",\n" +
                        "\t\"Car Model\": \"" + carModel + "\",\n" +
                        "\t\"Production Year\": \"" + productionYear + "\",\n" +
                        "\t\"Plate Number\": \"" + plateNumber + "\"" +
                        "\n}"
        );
    }
}