import java.util.ArrayList;
import java.util.Random;

public class Davaleba3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        System.out.print("masivi: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(51); // 0-დან 50-მდე
            System.out.print(array[i] + " ");
        }
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        int maxIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(maxIndex)) {
                maxIndex = i;
            }
        }

        System.out.println("maksimaluri ricxvi: " + list.get(maxIndex));
        System.out.println("maksimaluri ricxvis indeqsi: " + maxIndex);
    }
}