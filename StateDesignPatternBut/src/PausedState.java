public class PausedState implements PlayerState {
    private MusicPlayer musicPlayer;

    public PausedState(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void pressPause() {
        System.out.println("Hata: Müzik zaten duraklatılmış.");
    }

    @Override
    public void pressStop() {
        System.out.println("Müzik durduruldu.");
        musicPlayer.setState(musicPlayer.getStoppedState());

    }

    @Override
    public void pressPlay() {
        System.out.println("Müzik kaldığı yerden devam ediyor.");
        musicPlayer.setState(musicPlayer.getPlayingState());
    }
}
