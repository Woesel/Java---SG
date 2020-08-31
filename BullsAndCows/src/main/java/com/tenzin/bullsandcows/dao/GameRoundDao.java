/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.bullsandcows.dao;

import com.tenzin.bullsandcows.dto.Game;
import com.tenzin.bullsandcows.dto.GameRound;
import java.util.List;

/**
 *
 * @author Tenzin Woesel
 */
public interface GameRoundDao {

    GameRound addGameRound(GameRound gameRound);

    GameRound getGameRoundById(int roundId);

    List<GameRound> getAllGameRounds();

    void updateGameRound(GameRound gameRound);

    void deleteGameRound(int roundId);
    
    List<GameRound> getGameRoundsForGame(Game game);

}
