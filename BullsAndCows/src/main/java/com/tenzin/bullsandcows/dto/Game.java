package com.tenzin.bullsandcows.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Tenzin Woesel Aug 22, 2020
 */
public class Game {

    int gameId;
    boolean gameStatus;
    String answer;
    List<GameRound> gameRound = new ArrayList<>();

    public Game() {
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public boolean isGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(boolean gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String Answer) {
        this.answer = Answer;
    }

    public List<GameRound> getGameRound() {
        return gameRound;
    }

    public void setGameRound(List<GameRound> gameRound) {
        this.gameRound = gameRound;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.gameId;
        hash = 71 * hash + (this.gameStatus ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.answer);
        hash = 71 * hash + Objects.hashCode(this.gameRound);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.gameId != other.gameId) {
            return false;
        }
        if (this.gameStatus != other.gameStatus) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.gameRound, other.gameRound)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "gameId=" + gameId + ", status=" + gameStatus + ", Answer=" + answer + ", gameRound=" + gameRound + '}';
    }

}
