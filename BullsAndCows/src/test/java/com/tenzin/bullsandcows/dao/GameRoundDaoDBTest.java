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
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
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
public class GameRoundDaoDBTest {

    @Autowired
    GameDao gameDao;

    @Autowired
    GameRoundDao gameRoundDao;

    public GameRoundDaoDBTest() {
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

        List<GameRound> gameRounds = gameRoundDao.getAllGameRounds();
        for (GameRound gameRound : gameRounds) {
            gameRoundDao.deleteGameRound(gameRound.getRoundId());
        }
    }

    @After
    public void tearDown() {

    }

    /**
     * Test of addGameRound method, of class GameRoundDaoDB.
     */
    @Test
    public void testAddGetGameRound() {
        //ARRANGE
        Game game = new Game();
        game.setAnswer("2134");

        game = gameDao.addGame(game);

        GameRound gameRound = new GameRound();
        gameRound.setUserGuess("2134");
        gameRound.setTimeOfGuess(LocalDateTime.now().withNano(0));
        gameRound.setResult("some");
        gameRound.setGameId(game.getGameId());
        gameRound = gameRoundDao.addGameRound(gameRound);

        //ACT
        GameRound fromDao = gameRoundDao.getGameRoundById(gameRound.getRoundId());

        //ASSERT
        assertEquals(gameRound, fromDao);

    }

    /**
     * Test of getAllGameRounds method, of class GameRoundDaoDB.
     */
    @Test
    public void testGetAllGameRounds() {
        //ARRANGE
        Game game = new Game();
        game.setAnswer("2134");

        game = gameDao.addGame(game);

        GameRound gameRound = new GameRound();
        gameRound.setUserGuess("2134");
        gameRound.setTimeOfGuess(LocalDateTime.now().withNano(0));
        gameRound.setResult("some");
        gameRound.setGameId(game.getGameId());
        gameRound = gameRoundDao.addGameRound(gameRound);

        GameRound gameRound2 = new GameRound();
        gameRound2.setUserGuess("3164");
        gameRound2.setTimeOfGuess(LocalDateTime.now().withNano(0));
        gameRound2.setResult("some");
        gameRound2.setGameId(game.getGameId());
        gameRound2 = gameRoundDao.addGameRound(gameRound2);

        //ACT
        List<GameRound> gameRounds = gameRoundDao.getAllGameRounds();

        //ASSERT
        assertEquals(2, gameRounds.size());
        assertTrue(gameRounds.contains(gameRound));
        assertTrue(gameRounds.contains(gameRound2));
    }

    /**
     * Test of updateGameRound method, of class GameRoundDaoDB.
     */
    @Test
    public void testUpdateGameRound() {
        //ARRANGE
        Game game = new Game();
        game.setAnswer("2134");

        game = gameDao.addGame(game);

        GameRound origGameRound = new GameRound();
        origGameRound.setUserGuess("2134");
        origGameRound.setTimeOfGuess(LocalDateTime.now().withNano(0));
        origGameRound.setResult("some");
        origGameRound.setGameId(game.getGameId());
        origGameRound = gameRoundDao.addGameRound(origGameRound);

        GameRound fromDao = gameRoundDao.getGameRoundById(origGameRound.getRoundId());

        assertEquals(origGameRound, fromDao);

        GameRound newGameRound = new GameRound();
        newGameRound.setRoundId(origGameRound.getRoundId());
        newGameRound.setUserGuess("2134");
        newGameRound.setTimeOfGuess(LocalDateTime.now().minusMinutes(3).withNano(0));
        newGameRound.setResult("partial");
        newGameRound.setGameId(game.getGameId());
        newGameRound = gameRoundDao.addGameRound(newGameRound);

        //ACT
        GameRound updatedGameRound = gameRoundDao.getGameRoundById(newGameRound.getRoundId());

        //ASSERT
        assertEquals(newGameRound, updatedGameRound);

    }

    /**
     * Test of deleteGameRound method, of class GameRoundDaoDB.
     */
    @Test
    public void testDeleteGameRound() {

        //ARRANGE
        Game game = new Game();
        game.setAnswer("2134");

        game = gameDao.addGame(game);

        GameRound gameRound = new GameRound();
        gameRound.setUserGuess("2134");
        gameRound.setTimeOfGuess(LocalDateTime.now().withNano(0));
        gameRound.setResult("some");
        gameRound.setGameId(game.getGameId());
        gameRound = gameRoundDao.addGameRound(gameRound);

        GameRound gameRound2 = new GameRound();
        gameRound2.setUserGuess("3164");
        gameRound2.setTimeOfGuess(LocalDateTime.now().withNano(0));
        gameRound2.setResult("some");
        gameRound2.setGameId(game.getGameId());
        gameRound2 = gameRoundDao.addGameRound(gameRound2);

        //ACT
        gameRoundDao.deleteGameRound(gameRound.getRoundId());

        List<GameRound> gameRounds = gameRoundDao.getAllGameRounds();

        //ASSERT
        assertEquals(1, gameRounds.size());
        assertTrue(gameRounds.contains(gameRound2));

    }

}
