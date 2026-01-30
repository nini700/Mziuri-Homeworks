import java.util.Scanner;
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
public class davaleba3 {
    public static void checkNegativeNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("sheni sheyvanili ricxvi ar unda iyos uaryofiti sheyvanili: " + number);
        }
        System.out.println("ricxvi sworia: " + number);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("sheiyvanet ricxvi (dadebiti): ");
            int number = scanner.nextInt();
            checkNegativeNumber(number);
        } catch (NegativeNumberException e) {
            System.out.println("errori: " + e.getMessage());
        }
        scanner.close();
    }
}