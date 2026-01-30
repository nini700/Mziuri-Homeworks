import java.util.Scanner;

public class davaleba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("sheiyvanet ricxvi: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            int result = 100 / number;
            System.out.println("shedegi: 100 / " + number + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("errori: tqveni sheyvanili teqsti ar aris ricxvi");
        } catch (ArithmeticException e) {
            System.out.println("erorri: nulze gayofa ar sheidzleba");
        }
        scanner.close();
    }
}