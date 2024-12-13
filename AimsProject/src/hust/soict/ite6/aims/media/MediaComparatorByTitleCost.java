package hust.soict.ite6.aims.media;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media obj1, Media obj2) {
        int titleComparison = obj1.getTitle().compareTo(obj2.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }
        return Double.compare(obj2.getCost(), obj1.getCost());
    }
}
