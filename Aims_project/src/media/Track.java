package media;

public class Track implements Playable{
	private String title;
	private int length=0;
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public Track(String title) {
		super();
		this.title = title;
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}

	public void play() {
		if (this.getLength()==0) {
			System.out.println("\t\t\t\t\tThe track "+this.getTitle()+" cannot be play!");
			return;
		}
		System.out.println("\t\t\t\t\tPlaying track: " + this.getTitle());
		System.out.println("\t\t\t\t\tTrack length: " + this.getLength());

	}
	
}
