package com.tenzin.bullsandcows.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Tenzin Woesel Aug 29, 2020
 */
public class GameVM {

    String gameStatus;
    String answer;
    String gameId;
    List<GameRoundVM> gameRound = new ArrayList<>();

    public GameVM() {
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public List<GameRoundVM> getGameRound() {
        return gameRound;
    }

    public void setGameRound(List<GameRoundVM> gameRound) {
        this.gameRound = gameRound;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.gameStatus);
        hash = 17 * hash + Objects.hashCode(this.answer);
        hash = 17 * hash + Objects.hashCode(this.gameId);
        hash = 17 * hash + Objects.hashCode(this.gameRound);
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
        final GameVM other = (GameVM) obj;
        if (!Objects.equals(this.gameStatus, other.gameStatus)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.gameId, other.gameId)) {
            return false;
        }
        if (!Objects.equals(this.gameRound, other.gameRound)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GameVM{" + "gameStatus=" + gameStatus + ", answer=" + answer + ", gameId=" + gameId + ", gameRound=" + gameRound + '}';
    }

}
