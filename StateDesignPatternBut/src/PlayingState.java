public class PlayingState implements PlayerState {
    private MusicPlayer musicPlayer;
    public PlayingState(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }


    @Override
    public void pressPlay() {
        System.out.println("Hata: Müzik zaten çalıyor.");
    }

    @Override
    public void pressPause() {
        System.out.println("Müzik duraklatıldı.");

        musicPlayer.setState(musicPlayer.getPausedState());
    }

    @Override
    public void pressStop() {
        System.out.println("Müzik durduruldu ve başa alındı.");
        musicPlayer.setState(musicPlayer.getStoppedState());
    }
}
