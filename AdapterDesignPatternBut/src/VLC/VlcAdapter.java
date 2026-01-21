package VLC;

public class VlcAdapter implements MediaPlayer {
    VlcPlayer player = new VlcPlayer();
    public VlcAdapter(VlcPlayer player) {
        this.player = player;
    }
    @Override
    public void play(String fileName) {
        player.playVlcFile(fileName);
    }
}
