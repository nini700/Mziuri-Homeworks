import java.util.ArrayList;
import java.util.Collections;

public class Davaleba1 {
    public static void main(String[] args) {
        ArrayList<BasketballPlayer> tamashebi = new ArrayList<>();

        tamashebi.add(new BasketballPlayer("gandalf", "geladze", 25, 8, 3, 12, 4));
        tamashebi.add(new BasketballPlayer("bilbo", "gegeshidze", 18, 12, 5, 7, 2));
        tamashebi.add(new BasketballPlayer("elrond", "rustaveli", 30, 6, 2, 15, 6));
        tamashebi.add(new BasketballPlayer("harry", "potter", 22, 10, 4, 9, 3));
        tamashebi.add(new BasketballPlayer("hermione", "Burjanadze", 15, 15, 6, 5, 1));

        System.out.println("Daulagebeli:");
        tamashebi.forEach(System.out::println);

        Collections.sort(tamashebi, new PlayerRatingComparator());
        System.out.println("\nReitingis klebadobit:");
        tamashebi.forEach(System.out::println);

        Collections.sort(tamashebi);
        System.out.println("\nReitingis zrdadobit:");
        tamashebi.forEach(System.out::println);
    }
}