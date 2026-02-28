import java.util.Comparator;

public class PlayerRatingComparator implements Comparator<BasketballPlayer> {
    @Override
    public int compare(BasketballPlayer o1, BasketballPlayer o2) {
        double reitingi1 = o1.getReitingi();
        double reitingi2 = o2.getReitingi();

        if (reitingi1 > reitingi2) {
            return -1;
        } else if (reitingi1 < reitingi2) {
            return 1;
        }
        return 0;
    }
}