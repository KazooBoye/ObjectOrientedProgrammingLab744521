package hust.soict.ite6.aims.media;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
    @Override
    public int compare(Media obj1, Media obj2) {
        int costComparison = Double.compare(obj2.getCost(), obj1.getCost());
        if (costComparison != 0) {
            return costComparison;
        }
        return obj1.getTitle().compareTo(obj2.getTitle());        
    }
}
