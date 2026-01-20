public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(
                "Toyota",
                "Corolla",
                2021,
                "Ab-200-BA"
        );
        Vehicle vehicle2 = new Vehicle(
                "Audi",
                "Q7",
                2023,
                "CD-300-DC"
        );
        vehicle1.displayInfo();
        vehicle2.displayInfo();

        System.out.println(MathOperations.calculateMultiples(1, 12, 3));

        System.out.println(MathOperations.sumNumbers(6));

        System.out.println(MathOperations.calculatePower(2, 3));

        MathOperations.checkEvenOddZeros(
                MathOperations.zeroCount(100_000_000)
        );
    }
}