package aims;
import java.util.ArrayList;
import java.util.List;
import media.*;
public class cart_test {
	public static void main(String[] args) {
        cart userCart = new cart();
        
        book book_01 = new book("no title","no category",9.9f);
        List<String> authors = new ArrayList<String>();
        authors.add("author01");
        authors.add("author02");
        authors.add("author03");
        book book_02 = new book("Algebra","Math",29.9f,authors);
        System.out.println(book_02.getAuthors());
        userCart.addMedia(book_01);
        
        book_01.addAuthor("author01");
        book_01.addAuthor("author01");
        book_01.addAuthor("author02");
        book_01.removeAuthor("author01");
        book_02.removeAuthor("author03");
        userCart.addMedia(book_02);
//      ---------------------------------------------------
        media DVD_01 = new DigitalVideoDisc("DVD01");
        userCart.addMedia(DVD_01);
        
        Track track_01 = new Track("track01",15);
        Track track_02 = new Track("track02",25);
        Track track_03 = new Track("track03",0);
        Track track_00 = new Track("track00",0);
        List<Track> tracks = new ArrayList<Track>();
        tracks.add(track_01);
        tracks.add(track_02);
        tracks.add(track_03);
        CompactDisc CD_01 = new CompactDisc("CD01","category01","director01",20f,"artist01",tracks);
        track_01.play();
        CD_01.play();
        
        System.out.println(CD_01.getLen());
        CD_01.removeTrack(track_00);
        userCart.addMedia(CD_01);
        
        
//        ---------------------------------------------------
        List<media> mediae = new ArrayList<media>();
        mediae.add(book_02);
        mediae.add(CD_01);
        mediae.add(DVD_01);
        for(media media : mediae) {
        	System.out.println(media.toString());
        }
        System.out.println("---------------------------------------------------");
        
        
    }
}
