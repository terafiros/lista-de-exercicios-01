package questão01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		Music musica1 = MusicFactory.createMusic("The quiet observer","The Ocean","Peleagial","12:44");
		Music musica2 = MusicFactory.createMusic("The Illumination theory", "Dream Theater", "Dream Theater", "19;09");
		Music musica3 = MusicFactory.createMusic("The Firmament", "The Ocean", "Heliocentric", "07;09");
		Music musica4 = MusicFactory.createMusic("Let them believe", "The Ocean", "Pelagial", "09:37");
		List<Music> musics = new ArrayList<Music>(Arrays.asList(musica1, musica2, musica3, musica4));
		
		MusicPlayer mp = new MusicPlayer(musics);
		mp.playRamdom();
		mp.nextMusic();
		mp.play();
		mp.playRamdom();
		mp.previousMusic();
		mp.play();
	
		
	}

}
