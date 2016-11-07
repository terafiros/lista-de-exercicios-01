package questão01;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
	
	private List<Music> musics;
	private int atualMusic;
	
	public MusicPlayer(List<Music> musics){
		this.musics = musics;
		this.atualMusic = 0;
	}
	
	public void play(){
		displayDataOfMusic();
		
	}
	
	private void displayDataOfMusic() {
		Music atual = musics.get(atualMusic);
		System.out.println("Tocando");
		System.out.println(atual.getName());
		System.out.println(atual.getArtist());
		System.out.println(atual.getAlbum());
		System.out.println(atual.getDuration());
		System.out.println("--------------");
	}
	
	public void pause(){
		System.out.println("Pausado");
	}
	
	public void stop(){
		System.out.println("Parado. Voltara da primeira música");
		this.atualMusic = 0;
	}
	
	public void nextMusic(){
		if(isLastSong()){
			this.atualMusic = 0;
			play();
		}
		this.atualMusic++;
		play();
	}
	
	private boolean isLastSong() {
		return this.atualMusic == musics.size()-1;
	}
	
	public void previousMusic(){
		if(isFirstSong()){
			this.atualMusic = this.musics.size()-1;
			play();
		}
	}
	private boolean isFirstSong() {
		return atualMusic == 0;
	}
	
	public void reapeatAtualMusic(){
		System.out.println("Repitindo música atual");
	}
	
	public void reapeatAllMusics(){
		System.out.println("Repetindo todas as músicas");
	}
	
	public void playRamdom(){
		this.atualMusic = (int)new Random().nextInt(this.musics.size());
		play();
	}
	
	
}