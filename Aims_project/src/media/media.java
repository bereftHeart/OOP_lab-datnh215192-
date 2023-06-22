package media;
import java.util.Comparator;

public class media {
	private int id;
	private String title;
	private String category;
	private float cost;
	private static int nbMedia = 0;
	
	public static final Comparator<media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
//	-----------------------------------------------------------------
//	constructor
	public media(String title) {
		super();
		nbMedia++;
		this.id=nbMedia;
		this.title = title;
	}
	
	public media(String title, String category) {
		super();
		nbMedia++;
		this.id=nbMedia;
		this.title = title;
		this.category = category;
	}

	public media(String title, String category, float cost) {
		super();
		nbMedia++;
		this.id=nbMedia;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
//--------------------------------------------------------------------------
	public int getID() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	
//--------------------------------------------------------------------------
	
}
