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

    GameRound calculateResult(GameRound gameRound) throws Exception;

    List<GameRound> getRoundsForGameId(int gameId) throws Exception;
    

    public Game getGameByIdNotHidden(int gameId) throws Exception;
    
    /**
     * This method generates a random number and creates a new game
     * and add it to DB and returns the gameId
     * 
     * @return gameId
     */
    int startGame();
    
    /**
     * This is going to return a game object after adding the generated 
     * number to the DB. This method is similar to the one above, just 
     * written this in case if I need to return the object.
     * 
     * @return Game;
    */
     public Game startNewGame();

}
