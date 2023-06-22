package media;

import java.util.ArrayList;
import java.util.List;

public class book extends media{
	private List<String> authors = new ArrayList<String>();
	public List<String> getAuthors() {
		return authors;
	}
//	-----------------------------------------------------------------
//	constructor
	
	public book(String title) {
		super(title);
	}
	
	public book(String title, String category) {
		super(title, category);
	}
	
	public book(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public book(String title, List<String> authors) {
		super(title);
		this.authors = authors;
	}
	
	public book(String title, String category, List<String> authors) {
		super(title, category);
		this.authors = authors;
	}

	public book(String title, String category, float cost, List<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}
//---------------------------------------------


	public void addAuthor(String author) {
		for (String str : authors) {
			if (str.equals(author)) {
				System.out.println("Error! "+author + " is already existed in "+this.getTitle());
				return;
			}
//			check if author is exist
		}
		authors.add(author);
		System.out.println("Author "+author+" has been added to "+this.getTitle());
	}
//	--------------------------------------------
	public void removeAuthor(String author) {
		for (String str : authors) {
			if (str.equals(author)) {
				authors.remove(authors.indexOf(str));
				System.out.println("Author "+author+" has been removed from "+this.getTitle());
				return;
			}
		}
		System.out.println("Eror 404 not found!");
	}
//	--------------------------------------------

	@Override
	public String toString() {
		return "book [ID=" + getID() + ", title=" + getTitle() + ", category="
				+ getCategory() + ", cost=" + getCost() + ", authors=" + authors + "]";
	}
	
}

