import java.util.Scanner;

public class davaleba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("chaweret pirveli ricxvi: ");
            int num1 = scanner.nextInt();
            System.out.print("chaweret meore ricxvi: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("shedegi: " + num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("erorri: nulze gayofa ar sheiddzleba");
        }
        scanner.close();
    }
}