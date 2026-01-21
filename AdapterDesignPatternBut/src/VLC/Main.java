package VLC;

public class Main {
    public static void main(String[] args) {
        VlcPlayer eskiOynatici = new VlcPlayer();
        MediaPlayer adapter = new VlcAdapter(eskiOynatici);
        System.out.println("--- Medya Oynatıcı Başlatıldı ---");
        adapter.play("en_sevdigim_sarki.vlc");
    }
}
