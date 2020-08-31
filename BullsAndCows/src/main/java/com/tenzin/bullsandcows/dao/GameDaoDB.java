package com.tenzin.bullsandcows.dao;

import com.tenzin.bullsandcows.dto.Game;
import com.tenzin.bullsandcows.dto.GameRound;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tenzin Woesel Aug 23, 2020
 */
@Repository
public class GameDaoDB implements GameDao {

    @Autowired
    JdbcTemplate jdbc;

    public static final class GameMapper implements RowMapper<Game> {

        @Override
        public Game mapRow(ResultSet rs, int index) throws SQLException {
            Game game = new Game();
            game.setGameId(rs.getInt("gameId"));
            game.setGameStatus(rs.getBoolean("gameStatus"));
            game.setAnswer(rs.getString("answer"));
            return game;
        }

    }

    @Override
    @Transactional
    public Game addGame(Game game) { //brought in game object
        final String INSERT_GAME = "INSERT INTO game(gameStatus, answer)" + "VALUES(?,?)";
        jdbc.update(INSERT_GAME,
                false,
                game.getAnswer());
        //got newId
        int newId = jdbc.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        //added the Id to the object
        game.setGameId(newId);

        return game;
    }

    @Override
    public Game getGameById(int gameId) {
        
        try {
            final String SELECT_GAME_BY_ID = "SELECT * FROM game WHERE gameId = ?";

            Game game = jdbc.queryForObject(SELECT_GAME_BY_ID, new GameMapper(), gameId);

            return addGameRoundsToGames(game);

        } catch (DataAccessException ex) {

            return null;
        }

    }

    @Override
    public List<Game> getAllGames() {

        final String SELECT_ALL_GAMES = "SELECT * FROM game";

        //collect 
        List<Game> games = jdbc.query(SELECT_ALL_GAMES, new GameMapper());

        for (Game game : games) {

            addGameRoundsToGames(game);

        }

        return games;

    }

    @Override
    public void updateGame(Game game) {
        final String UPDATE_GAME = "UPDATE game SET answer = ?, gameStatus = ? WHERE gameId = ?";
        jdbc.update(UPDATE_GAME,
                game.getAnswer(),
                game.isGameStatus(),
                game.getGameId());

    }

    @Override
    @Transactional
    public void deleteGame(int gameId) {
        final String DELETE_GAMEROUND_BY_GAME = "DELETE FROM gameRound WHERE gameId = ?";
        jdbc.update(DELETE_GAMEROUND_BY_GAME, gameId);

        final String DELETE_GAME = "DELETE FROM game WHERE gameId = ?";
        jdbc.update(DELETE_GAME, gameId);

    }

    //May be needed
    private Game addGameRoundsToGames(Game game) {
        //call on DB get all rounds for this gameid
        final String SELECT_ALL_GAMEROUND = "SELECT * FROM gameRound WHERE gameId = ?";

        List<GameRound> gameRounds = jdbc.query(SELECT_ALL_GAMEROUND, new GameRoundDaoDB.GameRoundMapper(), game.getGameId());
        //add to the game
        game.setGameRound(gameRounds);
        //return the game
        return game;
    }

}
