import java.util.Comparator;

public class CarMileageComparator implements Comparator<Car3> {
    @Override
    public int compare(Car3 o1, Car3 o2) {
        return o1.getGarbeni() - o2.getGarbeni();
    }
}