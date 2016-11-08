package questao01;

public class Music {
	
	private String name;
	private String artist;
	private String album;
	private String duration;
	
	public Music(String name, String artist, String album, String duration) {
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
}
