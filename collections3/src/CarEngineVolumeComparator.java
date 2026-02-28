import java.util.Comparator;

public class CarEngineVolumeComparator implements Comparator<Car3> {
    @Override
    public int compare(Car3 o1, Car3 o2) {
        double mocul1 = o1.getDzravi().getMoculoba();
        double mocul2 = o2.getDzravi().getMoculoba();

        if (mocul1 > mocul2) {
            return 1;
        } else if (mocul1 < mocul2) {
            return -1;
        }
        return 0;
    }
}