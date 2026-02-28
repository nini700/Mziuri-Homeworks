import java.util.Comparator;

public class CarYearComparator implements Comparator<Car3> {
    @Override
    public int compare(Car3 o1, Car3 o2) {
        return o1.getGamoshvebisweli() - o2.getGamoshvebisweli();
    }
}