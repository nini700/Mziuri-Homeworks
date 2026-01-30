import java.util.Scanner;

public class davaleba4 {
    public static double calculateSquareRoot(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("kvadratuli fesvi ar arsebobs uaryofiti ricxvistvis");
        }
        return Math.sqrt(number);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("chaweret ricxvi kvadratuli fesvis gamosatvlelad: ");
            int number = scanner.nextInt();
            double result = calculateSquareRoot(number);
            System.out.println("kvadratuli fesvi " + number + "-is aris: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("errori: " + e.getMessage());
        }
        scanner.close();
    }
}