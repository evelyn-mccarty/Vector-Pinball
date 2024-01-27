package com.dozingcatsoftware.vectorpinball.model;

import com.badlogic.gdx.Game;

import org.junit.jupiter.api.Test;

class GameStateTest {

    @Test
    void startNewGameBaseline() {
        GameState g = new GameState();
        g.startNewGame();
        assert (g.getScore() == 0);
        assert (g.getBallNumber() == 1);
        assert (g.getScoreMultiplier() == 1);
        assert (g.isGameInProgress());
    }

    @Test
    void doNextBallNotFinal() {
        GameState g = new GameState();
        g.startNewGame();
        g.doNextBall();
        assert (g.getBallNumber() == 2);
    }

    @Test
    void doNextBallFinal() {
        GameState g = new GameState();

        g.startNewGame();
        g.doNextBall();
        g.doNextBall();
        g.doNextBall();
        assert (!g.isGameInProgress());
    }

    @Test
    void doNextBallScoreMultHalved() {
        GameState g = new GameState();
        g.startNewGame();
        g.setScoreMultiplier(25);
        g.doNextBall();
        assert (g.getScoreMultiplier() == 12);

    }

    @Test
    void doNextBallRemoveCheck() {
        GameState g = new GameState();
        g.startNewGame();
        g.setMultiplierBehavior(GameState.MultiplierBehavior.REMOVE);
        g.doNextBall();
        assert (g.getScoreMultiplier() == 1);
    }

    @Test
    void doNextBallHoldCheck() {
        GameState g = new GameState();
        g.startNewGame();
        g.setMultiplierBehavior(GameState.MultiplierBehavior.HOLD);
        g.setScoreMultiplier(13.13);
        g.doNextBall();

        assert (g.getScoreMultiplier() == 13.13);
    }

    @Test
    void doNextBallRemovesOneExtraBall() {
        GameState g = new GameState();
        g.startNewGame();
        g.setExtraBalls(2);
        g.doNextBall();
        assert (g.getExtraBalls() == 1);
    }

    @Test
    void addScoreFunctionality() {
        GameState g = new GameState();
        g.startNewGame();
        g.addScore(5);
        assert (g.getScore() == 5);
    }

    @Test
    void addExtraBallIncrements() {
        GameState g = new GameState();
        g.addExtraBall();
        assert (g.getExtraBalls() == 1);
    }

    @Test
    void incrementScoreMultiplierMultiplies() {
        GameState g = new GameState();
        g.startNewGame();
        g.incrementScoreMultiplier();
        assert (g.getScoreMultiplier() == 2);

    }

    @Test
    void isGameInProgress() {
        GameState g = new GameState();
        g.startNewGame();
        assert (g.isGameInProgress());
    }

    @Test
    void pauseCheck() {
        GameState g = new GameState();
        g.startNewGame();

        assert (!g.isPaused());

        g.setPaused(true);

        assert (g.isPaused());
    }

    @Test
    void setBallNumberCheck() {
        GameState g = new GameState();
        g.startNewGame();
        g.setBallNumber(3);
        assert (g.getBallNumber() == 3);
    }
}