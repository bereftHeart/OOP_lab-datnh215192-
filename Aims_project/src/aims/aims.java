package aims;
import java.util.Scanner;
import media.*;
public class aims {

//	author: datnh215192
//	date: 30/5/2023
	private static Scanner input1;
	private static Scanner input2;
	private static Scanner input3;
	private static Scanner input4;
	private static Scanner input5;
	private static Scanner input_title;
	private static cart yourcart = new cart();
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void updateStore() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add media to store");
		System.out.println("2. Remove media from store");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void sortCart() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Sort by title-cost");
		System.out.println("2. Sort by cost-title");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
//	------------------------------------------------------------------------------
	
	public static void playMedia() {
		System.out.print("Enter media's title to play: ");
		Scanner input_title = new Scanner(System.in);
		String title = input_title.nextLine();
		boolean title_valid=false;
		
		for (media m : store.itemsInStore) {
			if (m.getTitle().equalsIgnoreCase(title)) {
				title_valid = true;
				System.out.print("                    ");
				if (m instanceof book)
					System.out.println("Play is only valid with CD and DVD!");
				else if (m instanceof CompactDisc)
					((CompactDisc) m).play();
				else 
					((DigitalVideoDisc) m).play();
				
				break;
			}							
		}
		if (!title_valid)
			System.out.println("\t\t\t\t\tEror 404 title is not valid!");
	}

//	--------------------------------------------------------------------------
//	--------------------------------------------------------------------------
	public static void seeCurrentCart() {
		int option1_1_2=-1;
		while (option1_1_2!=0) {
			yourcart.showsCart();
			
			cartMenu();
			input3 = new Scanner(System.in);
			do {
				System.out.print("Your Option: ");
				option1_1_2 = input3.nextInt();
			}	while (option1_1_2<0 && option1_1_2>5);
			
			switch(option1_1_2) {
			case 0:
				break;
			case 1:
//--------Filter media in cart------
				System.out.println("\t\t\t\t\t Sorry but this part doesnot developed yet (>_<') ");
				break;
			case 2:
//--------Sort media in cart--------
				int option1_1_2_1=-1;
				while (option1_1_2_1!=0) {
					sortCart();
					input4= new Scanner(System.in);
					do {
						System.out.print("Your Option: ");
						option1_1_2_1 = input4.nextInt();
					}	while (option1_1_2_1<0 && option1_1_2_1>2);
					
					switch (option1_1_2_1) {
					case 0:
						break;
					case 1:
//		-------Sort by title-cost------
						yourcart.sortByTitleCost();
						break;
					case 2:
//		-------Sort by cost-title------
						yourcart.sortByCostTitle();
						break;	
					}
				}
				break;
			case 3:
//--------Remove media from cart----
				System.out.print("Enter media's title to remove from your cart: ");
				input_title = new Scanner(System.in);
				String title = input_title.nextLine();
				boolean title_valid=false;
				
				for (media m : store.itemsInStore) {
					if (m.getTitle().equalsIgnoreCase(title)) {
						title_valid = true;
						System.out.print("                    ");
						yourcart.removeMedia(m);
						System.out.println("\t\t\t\t\tYour current cart has "+yourcart.itemsOrdered.size()+" mediums");
						break;
					}							
				}
				if (!title_valid)
					System.out.println("\t\t\t\t\tEror 404 title is not found!");
				break;
			case 4: 
//--------Play a media-------------
				playMedia();
				break;
			case 5:
//--------Place order--------------	
				yourcart.totalCost();
				System.out.println("\t\t\t\t\t Sorry but this part doesnot developed yet (>_<') ");
				break;
			}
		}
	}
//	--------------------------------------------------------------------------
//	--------------------------------------------------------------------------
	public static void main(String[] args) {
		manage_store.Import();
		
		int option1 = -1;
		while (option1!=0) {
			showMenu();
			
			input1 = new Scanner(System.in);
			do {
				System.out.print("Your Option: ");
				option1 = input1.nextInt();				
			} while (option1<0 && option1>3);
			switch(option1) {
			case 1:
//	----------------------------1---View store---------------------------------------
				int option1_1=-1;
				while (option1_1!=0) {
					store.showStore();
					storeMenu();
					input2 = new Scanner(System.in);
					do {
						System.out.print("Your Option: ");
						option1_1 = input2.nextInt();
					}	while (option1_1<0 && option1_1>4);
					
					switch(option1_1) {
					case 1:
//	---------------1-1---See media's detail----------------------					
						System.out.print("Enter media's title to see them detail: ");
						Scanner input_title = new Scanner(System.in);
						String title = input_title.nextLine();
						boolean title_valid=false;
						for (media m : store.itemsInStore) {
							if (m.getTitle().equalsIgnoreCase(title)) {
								title_valid = true;
								System.out.print("                    ");
								System.out.println(m.toString()+"\n");
								
//			   			----------Media detail menu--------		
								int option1_1_1=-1;
								while (option1_1_1!=0) {
									mediaDetailsMenu();
									
									input3 = new Scanner(System.in);
									do {
										System.out.print("Your Option: ");
										option1_1_1 = input3.nextInt();
									}	while (option1_1_1<0 && option1_1_1>2);
									
									switch(option1_1_1) {
									case 1:
//						------1-1-1---Add to cart-----------
										System.out.print("                    ");
										yourcart.addMedia(m);
										
										break;
//						------1-1-2------Play---------------
									case 2:
										
										if (m instanceof book)
											System.out.println("\t\t\t\t\tPlay is only valid with CD and DVD!");
										else if (m instanceof CompactDisc)
											((CompactDisc) m).play();
										else 
											((DigitalVideoDisc) m).play();
										break;
									case 0:
										break;
									}
								}
								
								break;
							}							
						}
						if (!title_valid)
							System.out.println("\t\t\t\t\tEror 404 title is not valid!");
						break;
									
					
					case 2:
//  ---------------1-2---Add media to cart by title-------------------
						System.out.print("Enter media's title to add to your cart: ");
						input_title = new Scanner(System.in);
						title = input_title.nextLine();
						title_valid=false;
						
						for (media m : store.itemsInStore) {
							if (m.getTitle().equalsIgnoreCase(title)) {
								title_valid = true;
								System.out.print("                    ");
								yourcart.addMedia(m);
								System.out.println("\t\t\t\t\tYour current cart has "+yourcart.itemsOrdered.size()+" mediums");
								break;
							}							
						}
						if (!title_valid)
							System.out.println("\t\t\t\t\tEror 404 title is not valid!");
						break;
					case 3:
//	--------------------1-3---Play a media-----------------------
						playMedia();
						break;
					case 4:
//	--------------------1-4---See current cart-------------------	
						seeCurrentCart();
						
						break;
					case 0:
						break;
					}
					
				}
				break;
				
//				++++++++++++++++++++++++++++++++++++++++++++++++++++
			case 2:
//	--------------------------2---Update store-----------------------------------------		
				int option1_2=-1;
				while (option1_2!=0) {
					store.showStore();
					updateStore();
					input5 = new Scanner(System.in);
					do {
						System.out.print("Your Option: ");
						option1_2 = input5.nextInt();
					}	while (option1_2<0 && option1_2>2);
				
					switch(option1_2) {
					case 0:
						break;
					case 1:
//			-------2-1---add media to store----------
						manage_store.showAvailableMedia();
						System.out.print("Enter media's title to add to store: ");
						input_title = new Scanner(System.in);
						String title = input_title.nextLine();
						boolean title_valid=false;
						
						for (media m : manage_store.avaiable_media) {
							if (m.getTitle().equalsIgnoreCase(title)) {
								title_valid = true;
								store.addMedia(m);
								System.out.println("\t\t\t\t\t New media has been added to store!");
								break;
							}							
						}
						if (!title_valid)
							System.out.println("\t\t\t\t\tEror 404 title is not found!");
						break;
					case 2:
//			-------2-2---remove media from store-----	
						store.showStore();
						System.out.print("Enter media's title to remove from store: ");
						input_title = new Scanner(System.in);
						title = input_title.nextLine();
						title_valid=false;
						
						for (media m : manage_store.avaiable_media) {
							if (m.getTitle().equalsIgnoreCase(title)) {
								title_valid = true;
								store.removeMedia(m);
								System.out.println("\t\t\t\t\t Media has been removed from store!");
								break;
							}							
						}
						if (!title_valid)
							System.out.println("\t\t\t\t\tEror 404 title is not found!");
						break;
					}
				
				}
				break;
				
//				++++++++++++++++++++++++++++++++++++++++++++++++++++
			case 3:
//  --------------------------3---See current cart-----------------------------------------	
				seeCurrentCart();
				break;
//				++++++++++++++++++++++++++++++++++++++++++++++++++++
			case 0:
				System.out.println("----------Thanks for visiting (>.<) <3 <3 <3 \n \t----------Hope u have an enoermous day (-_-') <3 <3 <3 \n \t\t ---------- See you again (.^_^.) <3 <3 <3-------------");
				break;
        }
        	
        }
    }
}
