package kr.ac.gwnu.com.bowling;

public class NormalFrame implements Frame {
    private static final int NOMAL_FRAME = 2;
    private static final int TOTAL_PIN = 10;

    private int turn;
    private Score score;
    private int frameNumber;

    public NormalFrame(int frameNumber) {
        this.frameNumber = frameNumber;
        turn = NOMAL_FRAME;
        score = new Score(turn);
    }

    @Override
    public int[] getScore() {
        return score.getShotScore();
    }

    @Override
    public int getTotalScore() {
        return score.getTotalScore();
    }

    @Override
    public int getFrameNumber() {
        return frameNumber;
    }

    @Override
    public String getState() {
        return score.getState();
    }

    @Override
    public boolean hasTurn() {
        return turn > 0;
    }

    @Override
    public void playBawling(int pinCount) {
        setScore(pinCount);
        setTurn(pinCount);
    }

    private void setScore(int pinCount) {
        score.setScore(pinCount, turn);
    }

    private void setTurn(int pinCount) {
        score.calculateState();
        if (pinCount == TOTAL_PIN) {
            turn -= 2;
            return;
        }
        turn--;
    }
}
