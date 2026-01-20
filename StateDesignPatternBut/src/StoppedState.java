public class StoppedState implements PlayerState{
    private MusicPlayer musicPlayer;
    public StoppedState(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void pressPlay() {
        System.out.println("Müzik çalıyor...");
        musicPlayer.setState(musicPlayer.getPlayingState());
    }

    @Override
    public void pressPause() {
        System.out.println("Hata: Müzik zaten durdurulmuş veya çalınmıyor.");
    }

    @Override
    public void pressStop() {
        System.out.println("Hata: Müzik zaten durdurulmuş veya çalınmıyor.");
    }
}
