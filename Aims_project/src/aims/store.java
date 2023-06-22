package aims;
import java.util.ArrayList;
import java.util.List;
import media.*;

public class store {
	public static List<media> itemsInStore = new ArrayList<media>();
	
	public static void addMedia(media media) {
 		if (itemsInStore.indexOf(media)!=-1) {
 			System.out.println("Error! The media " + media.getTitle() + " is already exist!");
			return;
 		}
 		itemsInStore.add(media);
	}
	
	public static void removeMedia(media media) {
		if (itemsInStore.indexOf(media)==-1) {
			System.out.println("Error 404! The media " + media.getTitle() + " is not found!");
			return;
		}
		itemsInStore.remove(media);
	}
    
	public static void showStore() {
		System.out.println("--------------------STORE---------------------");
		for(media media : itemsInStore) {
        	System.out.println(media.toString());
        }
		System.out.println("---------------------END----------------------");
	}
	
	public void searchByTitle(String title) {
		boolean found = false;
		for(media media : itemsInStore) {
        	if (media.getTitle().equalsIgnoreCase(title)) {
        		System.out.println(media.toString());
        		found = true;
        	}
        	if (!found)
        		System.out.println("Error 404 not found!");
        }
	}
	
	
}
