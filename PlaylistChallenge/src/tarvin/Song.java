package tarvin;

public class Song {
	private String songTitle;
	private double duration;
	
	public Song(String songTitle, double duration) {
		this.songTitle = songTitle;
		this.duration = duration;
	}
	
	public String getSongTitle() {
		return this.songTitle;
	}
	
	public double getDuration() {
		return this.duration;
	}
}
