package media;

public class DigitalVideoDisc extends Disc implements Playable{
	
	public DigitalVideoDisc(String title) {
		super(title);
	}

	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director) {
		super(title, category, director);
	}
	
	public DigitalVideoDisc(String title, String category, float cost, float length) {
		super(title, category, cost, length);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float length, float cost) {
		super(title, category, director, length, cost);
		// TODO Auto-generated constructor stub
	}
//---------------------------------------------------
	public void play() {
		if (this.getLength()==0f) {
			System.out.println("\t\t\t\t\tThe track "+this.getTitle()+" cannot be play!");
			return;
		}
		System.out.println("\t\t\t\t\tPlaying DVD: " + this.getTitle());
		System.out.println("\t\t\t\t\tDVD length: " + this.getLength());
	}

	@Override
	public String toString() {
		return "DigitalVideoDisc [ID=" + getID() + ", title=" + getTitle() + ", category="
				+ getCategory() + ", director=" + getDirector() + ", length=" + getLength() + ", cost="
				+ getCost() + "]";
	}
	
	

}
