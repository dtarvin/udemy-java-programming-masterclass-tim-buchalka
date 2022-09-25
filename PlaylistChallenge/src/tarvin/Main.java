package tarvin;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("====================");
		
		Song badName = new Song("You Give Love A Bad Name", 3.72);
		Song neverSayGoodbye = new Song("Never Say Goodbye", 4.83);
		Song prayer = new Song("Living On A Prayer", 4.17);
		
		Album slipperyWhenWet = new Album("Slippery When Wet");
		
		slipperyWhenWet.addSongsToAlbum(prayer);
		slipperyWhenWet.addSongsToAlbum(badName);
		slipperyWhenWet.addSongsToAlbum(neverSayGoodbye);
		slipperyWhenWet.addSongsToAlbum(prayer);
		
		System.out.println("====================");
		
		slipperyWhenWet.printSongsOnAlbum(slipperyWhenWet.getSongsOnAlbum());
		
		System.out.println("====================");
		
		Album countryClubAlbum = new Album("Country Club");
		Song countryClub = new Song("Country Club", 3.17);
		Song somebody = new Song("I'm Gonna Be Somebody", 4.07);
		Song holdOn = new Song("Help Me Hold On", 4.0);
		countryClubAlbum.addSongsToAlbum(countryClub);
		countryClubAlbum.addSongsToAlbum(somebody);
		countryClubAlbum.addSongsToAlbum(holdOn);
		
		System.out.println("====================");
		
		Album aboutToChange = new Album("It's All About to Change");
		Song whiskeyWorking = new Song("The Whiskey Ain't Workin", 2.67);
		Song quarter = new Song("Here's a Quarter (Call Someone Who Cares)", 2.53);
		aboutToChange.addSongsToAlbum(quarter);
		aboutToChange.addSongsToAlbum(whiskeyWorking);
		
		System.out.println("====================");
		
		Album troubleAlbum = new Album("T-R-O-U-B-L-E");
		Song trouble = new Song("T-R-O-U-B-L-E", 3.0);
		Song mercy = new Song("Lord Have Mercy on the Working Man", 4.92);
		troubleAlbum.addSongsToAlbum(mercy);
		troubleAlbum.addSongsToAlbum(trouble);
		
		System.out.println("=========================");
		
		Song notReal = new Song("Not a Real Song", 0.5);
		
		System.out.println("====================");
		
		Playlist firstPlaylist = new Playlist("firstPlaylist");
		firstPlaylist.addAlbumToAlbumsList(troubleAlbum);
		firstPlaylist.addAlbumToAlbumsList(slipperyWhenWet);
		firstPlaylist.addAlbumToAlbumsList(countryClubAlbum);
		firstPlaylist.addAlbumToAlbumsList(aboutToChange);
		
		System.out.println("====================");
		
		firstPlaylist.printAlbumList(firstPlaylist.getAlbumsList());
		
		System.out.println("====================");
		
		
		firstPlaylist.addSongsToPlaylist(mercy);
		firstPlaylist.addSongsToPlaylist(badName);
		firstPlaylist.addSongsToPlaylist(notReal);
		firstPlaylist.addSongsToPlaylist(quarter);
		firstPlaylist.addSongsToPlaylist(prayer);
		firstPlaylist.addSongsToPlaylist(trouble);
		firstPlaylist.addSongsToPlaylist(whiskeyWorking);
		firstPlaylist.addSongsToPlaylist(countryClub);
		firstPlaylist.addSongsToPlaylist(holdOn);
		firstPlaylist.addSongsToPlaylist(neverSayGoodbye);
		firstPlaylist.addSongsToPlaylist(somebody);
		
		firstPlaylist.printSongsInPlaylist();
		
		firstPlaylist.playSongs(firstPlaylist.getSongsOnPlaylist());
	}

}
