package com.tenzin.bullsandcows.dao;

import com.tenzin.bullsandcows.dto.Game;
import com.tenzin.bullsandcows.dto.GameRound;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
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
public class GameRoundDaoDB implements GameRoundDao {

    @Autowired
    JdbcTemplate jdbc;

    public static final class GameRoundMapper implements RowMapper<GameRound> {

        @Override
        public GameRound mapRow(ResultSet rs, int index) throws SQLException {
            GameRound gr = new GameRound();
            gr.setRoundId(rs.getInt("roundId"));
            gr.setUserGuess(rs.getString("userGuess"));
            gr.setTimeOfGuess(rs.getTimestamp("timeOfGuess").toLocalDateTime());
            gr.setResult(rs.getString("result"));
            gr.setGameId(rs.getInt("gameId"));
            return gr;

        }
    }

    @Override
    @Transactional
    public GameRound addGameRound(GameRound gameRound) {
        final String INSERT_GAMEROUND = "INSERT INTO gameRound(userGuess, timeOfGuess, result, gameId)" + "VALUES(?,?,?,?)";
        jdbc.update(INSERT_GAMEROUND,
                gameRound.getUserGuess(),
                Timestamp.valueOf(gameRound.getTimeOfGuess()),
                gameRound.getResult(),
                gameRound.getGameId());
        int newId = jdbc.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        gameRound.setRoundId(newId);

        return gameRound;
    }

    @Override
    public GameRound getGameRoundById(int roundId) {
        try {
            final String SELECT_GAMEROUND_BY_ID = "SELECT * FROM gameRound WHERE roundId = ?";
            GameRound gameRound = jdbc.queryForObject(SELECT_GAMEROUND_BY_ID, new GameRoundMapper(), roundId);
            return gameRound;
        } catch (DataAccessException ex) {
            return null;
        }
    }

    @Override
    public List<GameRound> getAllGameRounds() {

        final String SELECT_ALL_GAMEROUND = "SELECT * FROM gameRound";
        List<GameRound> gameRounds = jdbc.query(SELECT_ALL_GAMEROUND, new GameRoundMapper());

        return gameRounds;
    }

    @Override
    public void updateGameRound(GameRound gameRound) {
        final String UPDATE_GAMEROUND = "UPDATE gameRound"
                + "SET userGuess = ?, timeOfGuess = ?, result = ?, gameId = ? WHERE roundId=?";
        jdbc.update(UPDATE_GAMEROUND,
                gameRound.getUserGuess(),
                Timestamp.valueOf(gameRound.getTimeOfGuess()),
                gameRound.getResult(),
                gameRound.getGameId(),
                gameRound.getRoundId());

    }

    @Override
    public void deleteGameRound(int roundId) {
        final String DELETE_GAMEROUND = "DELETE FROM gameRound WHERE roundId = ?";
        jdbc.update(DELETE_GAMEROUND, roundId);
    }

    @Override
    public List<GameRound> getGameRoundsForGame(Game game) {
        final String SELECT_GAMEROUND_FOR_GAME = "SELECT * FROM gameRound WHERE gameId = ?";
        List<GameRound> gameRounds = jdbc.query(SELECT_GAMEROUND_FOR_GAME, new GameRoundMapper(), game.getGameId());

        return gameRounds;
    }

}
