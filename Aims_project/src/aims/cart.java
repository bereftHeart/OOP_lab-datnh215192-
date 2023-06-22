package aims;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import media.media;

public class cart {
	 	public List<media> itemsOrdered = new ArrayList<media>();
	 	
	 	public boolean contains(media media) {
	 		for (media item : itemsOrdered) {
	 			if (item.getTitle().equals(media.getTitle())) {
	 				return true;
	 			}
	 		}
	 		return false;
	 	}
//		-----------------------------------------------------------------
	 	public void addMedia(media media) {
	 		if (contains(media)) {
	 			System.out.println("Media is already exist");
	 			return;
	 		}
	 		itemsOrdered.add(media);
	 		System.out.println("New media has been added to cart");
	 	}
//		-----------------------------------------------------------------
	 	public void removeMedia(media media) {
	 		int index = itemsOrdered.indexOf(media);
	 		if (index==-1) {
	 			System.out.println("Error 404! The media " + media.getTitle() + " is not found!");
				return;
	 		}
	 		while (index!=-1) {
	 			itemsOrdered.remove(index);
	 			index = itemsOrdered.indexOf(media);
	 			System.out.println("Media has been removed from cart");
	 		}
	 	}
//		-----------------------------------------------------------------
	 	public void totalCost() {
	 		float total=0.0f;
	 		for (media media : itemsOrdered) {
	 			total += media.getCost();
	 		}
	 		System.out.println("\t\t\t\t\tThe total cost: "+total+ "$");
	 	}
//		-----------------------------------------------------------------
	 	public void sortByTitleCost() {
	 		Collections.sort(itemsOrdered,media.COMPARE_BY_TITLE_COST);
	 		System.out.println("\t\t\t\t\t Sort complete!");
	 	}
	 	public void sortByCostTitle() {
	 		Collections.sort(itemsOrdered,media.COMPARE_BY_COST_TITLE);
	 		System.out.println("\t\t\t\t\t Sort complete!");
	 	}
	 	
	 	public void showsCart() {
	 		System.out.println("--------------------YOUR-CART---------------------");
	 		for (media m : itemsOrdered) {
	 			System.out.println(m.toString());
	 		}
	 		System.out.println("-----------------------END------------------------");
	 	}
}
