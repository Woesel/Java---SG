package com.tenzin.bullsandcows.dao;

import com.tenzin.bullsandcows.dto.Game;
import java.util.List;

/**
 *
 * @author Tenzin Woesel Aug 22, 2020
 */
public interface GameDao {

    Game addGame(Game game);

    Game getGameById(int gameId);

    List<Game> getAllGames();

    void updateGame(Game game);

    void deleteGame(int gameId);
    
}
