package aims;
import java.util.ArrayList;
import java.util.List;
import media.*;

public class manage_store {
	public static List<media> avaiable_media = new ArrayList<media>();

	public static void Import() {
		List<String> authors = new ArrayList<String>();
        authors.add("author01");
        authors.add("author02");
        authors.add("author03");
		media book_01 = new book("no title","no category",0f);
		media book_02 = new book("Algebra","Math",19.9f,authors);
		authors.add("author02");
		media book_03 = new book("Calculator","Math",29.9f,authors);
		authors.add("author03");
		media book_04 = new book("Static","Math",39.9f,authors);
		media book_05 = new book("Machin learning","AI",99.9f,authors);
		
		media DVD_01 = new DigitalVideoDisc("DVD01");
		media DVD_02 = new DigitalVideoDisc("DVD00","animation",15.9f,20);
		media DVD_03 = new DigitalVideoDisc("DVD00","jav",19.9f,40);
		media DVD_04 = new DigitalVideoDisc("DVD02","anime",15.9f,0);
		media DVD_05 = new DigitalVideoDisc("DVD02","invisible",25.9f,10);
//		----------------------------
		Track track_01 = new Track("track01",15);
        Track track_02 = new Track("track02",25);
        Track track_03 = new Track("track03",30);
        Track track_00 = new Track("track00",0);
        List<Track> tracks = new ArrayList<Track>();
        tracks.add(track_00);
        media CD_01 = new CompactDisc("CD01","horror","director01",49.99f,"artist01",tracks);
        tracks.remove(0);
        tracks.add(track_01);
        media CD_02 = new CompactDisc("CD02","science fiction","director02",99.9f,"artist02",tracks);
        tracks.add(track_02);
        media CD_03 = new CompactDisc("CD03","seg","porn hub dot com",99.9f,"artist02",tracks);
        tracks.add(track_03);
        media CD_04 = new CompactDisc("CD04","phim ngon lu","director02",9.9f,"artist02",tracks);
        
        
        
        avaiable_media.add(book_01);
        avaiable_media.add(book_02);
        avaiable_media.add(book_03);
        avaiable_media.add(book_04);
        avaiable_media.add(book_05);
        
        avaiable_media.add(DVD_01);
        avaiable_media.add(DVD_02);
        avaiable_media.add(DVD_03);
        avaiable_media.add(DVD_04);
        avaiable_media.add(DVD_05);
        
        avaiable_media.add(CD_01);
        avaiable_media.add(CD_02);
        avaiable_media.add(CD_03);
        avaiable_media.add(CD_04);
        
        
        store.addMedia(book_01);
        store.addMedia(book_02);
        store.addMedia(DVD_01);
        store.addMedia(DVD_02);
        store.addMedia(CD_01);
        store.addMedia(CD_02);
	}
	
	public static void showAvailableMedia() {
		for (media m : avaiable_media)
			System.out.println(m.toString());
	}
}
