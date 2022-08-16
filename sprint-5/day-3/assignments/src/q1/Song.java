package q1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

// ***************************************


public class Song {

	
	@Override
	public int hashCode() {
		return Objects.hash(movieName, songName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(movieName, other.movieName) && Objects.equals(songName, other.songName);
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	@Override
	public String toString() {
		return "Song [movieName=" + movieName + ", songName=" + songName + "]";
	}

	private String movieName;
	private String songName;
	
	public Song() {}
	
	public Song(String movieName, String songName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}
	
		public void play() {
			System.out.println(songName+" of "+movieName+" is playing...!");
		}
}


//***************************************


class PlayList{
	
	public List<Song> songs = new ArrayList<>();
	public HashSet<Song> hs=new HashSet<>();
	
	 public void addSong(Song song) {
		 int count=0;
		 for( int i=0;i<songs.size();i++) {
			 if(songs.size()>0&&song.hashCode()==songs.get(i).hashCode()) {
				 {System.out.println("Song is already added in the playlist");count++;break;}
			 }
		 }
		 
		 
		
		 if(count==0) {
			 songs.add(song);
			 System.out.println("Song added to the playlist successfully");
		 }
		 
		 
		 HashSet<Song> hs=new HashSet<>(songs);
		 songs=new ArrayList<>(hs);

	 }
	 
	 
	//***************************************
	 
class Main{
	public static void main(String[] args) {
		
		PlayList playList=new PlayList();
		Song sg=new Song();
		
		System.out.println("enter four movie names and their song name : ");
		Scanner sc=new Scanner(System.in);
		

		
		for(int i=0;i<4;i++) {
			playList.addSong(new Song(sc.next(),sc.next()));
			
		}
		System.out.println();
		
		for(int i=0;i<playList.songs.size();i++) {
			playList.songs.get(i).play();
			
		}
		
		
	}
}
	 
	
}

// addding songs and playing unique songs
// display warning when duplicate is added
// arrayList to HashSet to arrayList
// override equals Hascode to string
// bean class & getSet
// 1st q of assignment













