/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.bullsandcows.dao;

import com.tenzin.bullsandcows.TestApplicationConfiguration;
import com.tenzin.bullsandcows.dto.Game;
import com.tenzin.bullsandcows.dto.GameRound;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Tenzin Woesel
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplicationConfiguration.class)
public class GameDaoDBTest {

    @Autowired
    GameDao gameDao;

    @Autowired
    GameRoundDao gameRoundDao;

    public GameDaoDBTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        List<Game> games = gameDao.getAllGames();
        for (Game game : games) {
            gameDao.deleteGame(game.getGameId());
        }
//        
        List<GameRound> gameRounds = gameRoundDao.getAllGameRounds();
        for (GameRound gameRound : gameRounds) {
            gameRoundDao.deleteGameRound(gameRound.getRoundId());
        }
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addGame method, of class GameDaoDB.
     */
    @Test
    public void testAddGetGame() {

        Game game = new Game();
        game.setAnswer("2130");

        game = gameDao.addGame(game);

        Game game1 = gameDao.getGameById(game.getGameId());

        assertEquals(game, game1);
    }

    /**
     * Test of getAllGames method, of class GameDaoDB.
     */
    @Test
    public void testGetAllGames() {

        Game game = new Game();
        game.setAnswer("2150");

        game = gameDao.addGame(game);

        Game game1 = new Game();
        game1.setAnswer("2347");

        game1 = gameDao.addGame(game1);

        List<Game> games = gameDao.getAllGames();

        assertEquals(2, games.size());
        assertTrue(games.contains(game));
        assertTrue(games.contains(game1));

    }

    /**
     * Test of updateGame method, of class GameDaoDB.
     */
    @Test
    public void testUpdateGame() {

        Game game = new Game();
        game.setAnswer("2150");

        game = gameDao.addGame(game);

        Game fromDao = gameDao.getGameById(game.getGameId());

        assertEquals(game, fromDao);

        game.setAnswer("9876");
        game.setGameStatus(true);

        gameDao.updateGame(game);

        assertNotEquals(game, fromDao);

        fromDao = gameDao.getGameById(game.getGameId());

        assertEquals(game, fromDao);

    }

    /**
     * Test of deleteGame method, of class GameDaoDB.
     */
    @Test
    public void testDeleteGame() {

        Game game = new Game();
        game.setAnswer("2987");

        Game game1 = new Game();
        game1.setAnswer("3987");

        game = gameDao.addGame(game);

        GameRound gameRound = new GameRound();
        gameRound.setGameId(game.getGameId());
        gameRound.setUserGuess("3456");
        gameRound.setTimeOfGuess(LocalDateTime.now().withNano(0));
        gameRound.setResult("timepas");
        gameRoundDao.addGameRound(gameRound);

        GameRound gameRound1 = new GameRound();
        gameRound1.setGameId(game.getGameId());
        gameRound1.setUserGuess("2987");
        gameRound1.setTimeOfGuess(LocalDateTime.now().withNano(0));
        gameRound1.setResult("Tada!");
        gameRoundDao.addGameRound(gameRound1);

        gameDao.deleteGame(game.getGameId());

        Game fromDao = gameDao.getGameById(game.getGameId());

        List<GameRound> gameRounds = gameRoundDao.getAllGameRounds();

        assertNull(fromDao);
        assertTrue(gameRounds.isEmpty());

    }

}
