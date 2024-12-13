package hust.soict.ite6.test.media;
import java.util.ArrayList;
import java.util.List;
import hust.soict.ite6.aims.media.*;

public class MediaTest {

	public static void main(String[] args) {
		List<Media> media1 = new ArrayList<Media>();
		
		CompactDisc cd1 = new CompactDisc("=", "Pop", "Ed Sheeran", 5.99f);
		
        Track track1 = new Track("Tides", 183);
        Track track2 = new Track("Overpass Graffiti", 162);
        Track track3 = new Track("Collide", 200);

        cd1.addTrack(track1);
        cd1.addTrack(track2);
        cd1.addTrack(track3);
		
        DigitalVideoDisc dvd = new DigitalVideoDisc("Inside Out", "Animation", "Pete Docter", 120, 9.99f);
        
        Book book = new Book("American Prometheus", "Biography", 4.99f);
        
        media1.add(cd1);
        media1.add(book);
        media1.add(dvd); 
        
        for (Media media : media1) {
            System.out.println(media.toString());
        }
	}

}
