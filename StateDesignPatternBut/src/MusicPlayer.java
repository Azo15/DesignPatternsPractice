public class MusicPlayer {
    private PlayerState playingState;
    private PlayerState pausedState;
    private PlayerState stoppedState;
    private PlayerState currentState;

    public MusicPlayer() {
        playingState = new PlayingState(this);
        pausedState = new PausedState(this);
        stoppedState = new StoppedState(this);
        currentState = stoppedState;
    }
    public void setState(PlayerState State) {
        this.currentState = State;
    }
    public PlayerState getCurrentState() {
        return currentState;
    }
    public void pressPlay() {
        currentState.pressPlay();
    }
    public void pressPause() {
        currentState.pressPause();
    }
    public void pressStop() {
        currentState.pressStop();
    }

    public PlayerState getPlayingState() {
        return playingState;
    }
    public PlayerState getPausedState() {
        return pausedState;
    }
    public PlayerState getStoppedState() {
        return stoppedState;
    }

}
