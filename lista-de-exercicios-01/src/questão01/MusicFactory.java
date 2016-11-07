package questão01;

public class MusicFactory {

	public static Music createMusic(String name, String artist, String album, String duration) {
		return new Music(name, artist, album, duration);
	}
}