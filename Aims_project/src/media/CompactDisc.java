package media;
import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
// constructor
	
	public CompactDisc(String title, String artist, List<Track> tracks) {
		super(title);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public CompactDisc(String title, String category, String artist, List<Track> tracks) {
	super(title, category);
	this.artist = artist;
	this.tracks = tracks;
	}
	
	public CompactDisc(String title, String category, String director, String artist, List<Track> tracks) {
		super(title, category, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	public CompactDisc(String title, String category, String director, float cost, String artist,
		List<Track> tracks) {
	super(title, category, director, cost);
	this.artist = artist;
	this.tracks = tracks;
	}
//	-----------------------------------------------------------------
	public boolean contains(Track track) {
		for (Track track_ : tracks) {
			if (track_.getTitle().equals(track.getTitle()) && track_.getLength()==track.getLength()) {
				return true;
			}
		}
		return false;
	}
	
//	-----------------------------------------------------------------
	public void addTrack(Track track) {
		if (contains(track)) {
			System.out.println("The track is already exist!");
			return;
		}
		tracks.add(track);
		System.out.println("The track has been added!");
	}
//	-----------------------------------------------------------------
	public void removeTrack(Track track) {
		if (!contains(track)) {
			System.out.println("Error 404! The track " + track.getTitle() + " is not found!");
			return;
		}
		tracks.remove(track);
		System.out.println("The track has been removed!");
	}
	
//	-----------------------------------------------------------------
	public int getLen() {
		int totalLength=0;
		for (Track track : tracks) {
			totalLength+=track.getLength();
		}
		return totalLength;
	}
	
//	-----------------------------------------------------------------
	
	public void play() {
		for (Track track : tracks) {
			track.play();
		}
		System.out.println("\t\t\t\t\tCD END");
	}
//	-----------------------------------------------------------------

	@Override
	public String toString() {
		return "CompactDisc [ ID=" + getID() + ", title=" + getTitle()+ ", director="
				+ getDirector()+ ", length=" + getLength() + ", category=" + getCategory() +
				", cost=" + getCost() + ",artist=" + artist + ", tracks=" + tracks + "]";
	}
	
	
}
