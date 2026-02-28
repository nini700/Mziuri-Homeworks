import java.util.ArrayList;
import java.util.Collections;

public class Davaleba3 {
    public static void main(String[] args) {
        ArrayList<Car3> manqanebi = new ArrayList<>();

        manqanebi.add(new Car3("toiota", "camry", 2018, 45000,
                new Engine("benzini", 4, 2.5)));
        manqanebi.add(new Car3("BMW", "X4", 2020, 25000,
                new Engine("Dizeli", 6, 3.0)));
        manqanebi.add(new Car3("Honda", "jeep", 2015, 80000,
                new Engine("benzini", 4, 1.8)));
        manqanebi.add(new Car3("Mercedes", "E-Class", 2019, 35000,
                new Engine("benzini", 6, 3.5)));
        manqanebi.add(new Car3("Audi", "rv4", 2021, 15000,
                new Engine("Dizeli", 4, 2.0)));

        System.out.println("Daulagebeli:");
        manqanebi.forEach(System.out::println);

        Collections.sort(manqanebi, new CarYearComparator());
        System.out.println("\nGamoshvebis wlis mikhedvit:");
        manqanebi.forEach(System.out::println);

        Collections.sort(manqanebi, new CarMileageComparator());
        System.out.println("\nGarbenis mikhedvit:");
        manqanebi.forEach(System.out::println);

        Collections.sort(manqanebi, new CarEngineVolumeComparator());
        System.out.println("\nDzravis moculobis mikhedvit:");
        manqanebi.forEach(System.out::println);
    }
}