package tarvin;

import java.util.ArrayList;

public class Album {
	private String albumName;
	private ArrayList<Song> songsOnAlbum;
	
	public Album(String albumName) {
		this.albumName = albumName;
		this.songsOnAlbum = new ArrayList<Song>();
	}
	
	public String getAlbumName() {
		return this.albumName;
	}
	
	public ArrayList<Song> getSongsOnAlbum() {
		return this.songsOnAlbum;
	}
	
	public void printSongsOnAlbum(ArrayList<Song> songsOnAlbum) {
		if(songsOnAlbum == null || songsOnAlbum.size() == 0) {
			System.out.println("No songs on the album " + this.albumName);
		} else {
			System.out.println("The songs on the album " + this.albumName + " are as follows:");
			for(int i=0; i < songsOnAlbum.size(); i++) {
				System.out.println(songsOnAlbum.get(i).getSongTitle());
			}
		}
	}
	
	public boolean addSongsToAlbum(Song song) {
		System.out.println("The song title is " + song.getSongTitle());
		if(!findSong(song)) {
			songsOnAlbum.add(song);
			System.out.println("Song " + song.getSongTitle() + " added to album " + this.albumName);
			return true;
		} else {
			System.out.println("Song " + song.getSongTitle() + " already on album " + this.albumName);
			return false;
		}
	}
	
	public boolean searchForSongOnAlbum(Song song) {
		if(findSong(song)) {
			System.out.println("Found song " + song.getSongTitle() + " on album " + this.getAlbumName());
			return true;
		} else {
			System.out.println("Could not find song searched on album " + this.getAlbumName());
			return false;
		}
	}
	
	private boolean findSong(Song song) {
		int position = this.songsOnAlbum.indexOf(song);
//		System.out.println("findSong - position is " + position);
		if(position < 0) {
//			System.out.println("findSong - returning false");
			return false;
		} else {
//			System.out.println("findSong - returning true");
			return true;
		}
	}
}
