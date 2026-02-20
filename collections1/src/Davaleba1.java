import java.util.ArrayList;
import java.util.Random;

public class Davaleba1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(51); // 0-დან 50-მდე
            numbers.add(randomNumber);
            if (randomNumber == 40) {
                break;
            }
        }


        System.out.println("siis sigrdze: " + numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        System.out.println("\nluwebi washlis shemdeg:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}