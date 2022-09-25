package tarvin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
	private String playlistName;
	private ArrayList<Album> albumsList;
	private LinkedList<Song> songsOnPlaylist;
	
	public Playlist(String playlistName) {
		this.playlistName = playlistName;
		this.albumsList = new ArrayList<Album>();
		this.songsOnPlaylist = new LinkedList<Song>();
	}
	
	public String getPlaylistName() {
		return this.playlistName;
	}
	
	public ArrayList<Album> getAlbumsList() {
		return this.albumsList;
	}
	
	public LinkedList<Song> getSongsOnPlaylist() {
		return this.songsOnPlaylist;
	}
	
	public void printAlbumList(ArrayList<Album> albums) {
		if(albums == null || albums.size() == 0) {
			System.out.println("No albums in list.");
		} else {
			System.out.println("The albums in the album list are as follows:");
			for(int i=0; i < albums.size(); i++) {
				System.out.println(albums.get(i).getAlbumName());
			}
		}
	}
	
	public void printSongsInPlaylist() {
		String playList = this.getPlaylistName();
		Iterator<Song> i = this.songsOnPlaylist.iterator();
		System.out.println("=========================");
		System.out.println("The songs on " + playList + " are as follows:");
		while(i.hasNext()) {
			System.out.println(i.next().getSongTitle());
		}
		System.out.println("=========================");
	}
	
	public boolean addAlbumToAlbumsList(Album album) {
		Album albumToAdd = album;
		if(!findAlbum(albumToAdd)) {
			System.out.println("Adding " + albumToAdd.getAlbumName() + " to album list.");
			this.albumsList.add(albumToAdd);
			return true;
		} else {
			System.out.println("Not adding " + albumToAdd.getAlbumName() + " to album list.");
			return false;
		}
	}
		
	public boolean checkForSongInAlbumList(Song song) {
		if(this.albumsList != null && this.albumsList.size() > 0) {
			for(int i=0; i < this.albumsList.size(); i++) {
				if(this.albumsList.get(i).searchForSongOnAlbum(song)) {
					System.out.println("Found " + song.getSongTitle() + " in album list.");
					return true;
				}
			}
			System.out.println(song.getSongTitle() + " not found in album list.");
			return false;
		} else {
			System.out.println("No albums in list.");
			return false;
		}
			
	}
	
	public boolean addSongsToPlaylist(Song newSong) {
		if(checkForSongInAlbumList(newSong)) {
			this.songsOnPlaylist.add(newSong);
			return true;
		}
		System.out.println("Unable to add " + newSong.getSongTitle() + " to " + this.getPlaylistName());
		return false;
	}
	
	public void playSongs(LinkedList songsOnPlaylist) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<Song> listIterator = songsOnPlaylist.listIterator();
		
		if(songsOnPlaylist.isEmpty()) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().getSongTitle());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action) {
				case 0:
					System.out.println("Shutting down music");
					quit = true;
					break;
				case 1:
					if(!goingForward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						goingForward = true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next().getSongTitle());
					} else {
						System.out.println("End of the playlist");
						goingForward = false;
					}
					break;
				case 2:
					if(goingForward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						goingForward = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().getSongTitle());
					} else {
						System.out.println("Start of the playlist");
						goingForward = true;
					}
					break;
				case 3:
					printMenu();
					break;
			}
		}
	}
	
	private void printMenu() {
		System.out.println("Available actions:\npress ");
		System.out.println("0 - to quit\n" + 
							"1 - go to next song\n" + 
							"2 - go to previous song\n" + 
							"3 - print menu options");
	}
	
	private boolean findAlbum(Album album) {
		int position = this.albumsList.indexOf(album);
		if (position < 0) {
			System.out.println("Album " + album.getAlbumName() + " not in album list.");
			return false;
		} else {
			System.out.println("Album " + album.getAlbumName() + " already in album list.");
			return true;
		}
	}
}
