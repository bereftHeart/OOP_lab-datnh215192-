package media;

public class Disc extends media {
	private String director;
	private float length=0f;
	
//	-----------------------------------------------------------------
//	constructor
	public Disc(String title) {
		super(title);
	}

	public Disc(String title, String category) {
		super(title, category);
	}

	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	

	public Disc(String title, String category, String director) {
		super(title, category);
		this.director = director;
	}

	public Disc(String title, String category, float cost, float length) {
		super(title, category, cost);
		this.length = length;
	}

	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}

	public Disc(String title, String category, String director, float length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
//-------------------------------------------------
	public String getDirector() {
		return director;
	}
	
	public float getLength() {
		return length;
	}
	

	
}