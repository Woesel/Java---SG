/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.bullsandcows.service;

import com.tenzin.bullsandcows.dto.Game;
import com.tenzin.bullsandcows.dto.GameRound;
import java.util.List;

/**
 *
 * @author Tenzin Woesel Aug 27, 2020
 */
public interface BullsAndCowsService {

    Game addGame(Game game);

    void deleteGameById(int gameId);

    void editGame(Game game);

    List<Game> getAllGames();

    Game getGameById(int gameId);

    int startGame();

    GameRound calculateResult(GameRound gameRound) throws Exception;

    List<GameRound> getRoundsForGameId(int gameId) throws Exception;
    
    public Game getGameByIdNotHidden(int gameId) throws Exception;

}
