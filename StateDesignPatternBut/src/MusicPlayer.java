public class MusicPlayer {
    private PlayerState playingState;
    private PlayerState pausedState;
    private PlayerState stoppedState;
    private PlayerState currentState;

    public MusicPlayer() {
        playingState = new PlayingState(this);
    }
}
