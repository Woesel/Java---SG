package com.tenzin.bullsandcows.dto;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author Tenzin Woesel Aug 22, 2020
 */
public class GameRound {

    int roundId;
    String userGuess;
    LocalDateTime timeOfGuess;
    String result;
    int gameId;

    public GameRound() {
    }

    public int getRoundId() {
        return roundId;
    }

    public void setRoundId(int roundId) {
        this.roundId = roundId;
    }

    public String getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(String userGuess) {
        this.userGuess = userGuess;
    }

    public LocalDateTime getTimeOfGuess() {
        return timeOfGuess;
    }

    public void setTimeOfGuess(LocalDateTime timeOfGuess) {
        this.timeOfGuess = timeOfGuess;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.roundId;
        hash = 37 * hash + Objects.hashCode(this.userGuess);
        hash = 37 * hash + Objects.hashCode(this.timeOfGuess);
        hash = 37 * hash + Objects.hashCode(this.result);
        hash = 37 * hash + this.gameId;
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
        final GameRound other = (GameRound) obj;
        if (this.roundId != other.roundId) {
            return false;
        }
        if (this.gameId != other.gameId) {
            return false;
        }
        if (!Objects.equals(this.userGuess, other.userGuess)) {
            return false;
        }
        if (!Objects.equals(this.result, other.result)) {
            return false;
        }
        if (!Objects.equals(this.timeOfGuess, other.timeOfGuess)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GameRound{" + "roundId=" + roundId + ", userGuess=" + userGuess + ", timeOfGuess=" + timeOfGuess + ", result=" + result + ", gameId=" + gameId + '}';
    }
    
    
}
