/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.bullsandcows.service;

import com.tenzin.bullsandcows.TestApplicationConfiguration;
import com.tenzin.bullsandcows.dto.Game;
import com.tenzin.bullsandcows.dto.GameRound;
import java.time.LocalDateTime;
import java.util.List;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
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
public class BullsAndCowsServiceImplTest {

    @Autowired
    BullsAndCowsService service;

    public BullsAndCowsServiceImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllGames method, of class BullsAndCowsServiceImpl.
     */
    @Test
    public void testGetAllGames() {

        Game game = new Game();
        game.setAnswer("2150");

        game = service.addGame(game);

        game.setAnswer("Hidden");

        Game game1 = new Game();
        game1.setAnswer("2347");

        game1 = service.addGame(game1);
        game1.setAnswer("Hidden");

        List<Game> games = service.getAllGames();

        assertTrue(games.contains(game));
        assertTrue(games.contains(game1));

    }

    /**
     * Test of getGameById method, of class BullsAndCowsServiceImpl.
     */
    @Test
    public void testAddGetGameById() {

        Game game = new Game();
        game.setAnswer("2130");

        game = service.addGame(game);

        game.setAnswer("Hidden");

        Game fromDao = service.getGameById(game.getGameId());

        assertEquals(game, fromDao);

    }

    @Test
    public void testGetInvalidGameId() {
//
        Game game = new Game();
        game.setAnswer("2130");

        game = service.addGame(game);

        game.setAnswer("Hidden");

        Game validGame = service.getGameById(game.getGameId());

        Game invalidGameId = service.getGameById(game.getGameId() + 1);

        assertEquals(game, validGame);

        assertNull(invalidGameId);
    }

    /**
     * Test of startGame method, of class BullsAndCowsServiceImpl.
     */
    @Test
    public void testStartGame() throws Exception {

        Game game = new Game();

        game.setAnswer("2130");
        game = service.addGame(game);

        int id = service.startGame();

        int id2 = service.startGame();

        assertEquals(game.getGameId() + 1, id);
        assertEquals(game.getGameId() + 2, id2);

        //Here I am getting the game with the id to access the answer/number
        //generated
        Game game1 = service.getGameByIdNotHidden(id);

        String generatedNumber = game1.getAnswer();
        boolean counter = generatedNumber.length() == generatedNumber.chars().distinct().count();

        //Test if the boolean is true when the numbers are distinct
        assertTrue(counter);
        //I am checking if the length of the answer is 4
        assertEquals(4, generatedNumber.length());
        //here I am testing if the answer pattern matches digits 0-9
        //with length 4
        assertTrue(Pattern.matches("[0-9]{4}", generatedNumber));

    }

    /**
     * Test of calculateResult method, of class BullsAndCowsServiceImpl.
     */
    @Test
    public void testCalculateResult() throws Exception {

        Game game = new Game();
        game.setAnswer("2130");

        game = service.addGame(game);

        game.setAnswer("Hidden");

        String userGuess = "2122";

        GameRound gameRound = new GameRound();
        gameRound.setUserGuess(userGuess);
        gameRound.setTimeOfGuess(LocalDateTime.now().withNano(0));
        gameRound.setGameId(game.getGameId());

        GameRound gameRoundAdded = service.calculateResult(gameRound);

        gameRound.setResult("e:2:p:0");

        assertEquals(gameRound, gameRoundAdded);
        assertEquals(gameRound.getResult(), gameRoundAdded.getResult());

        //testing if the user is inputting numbers
        String userGuess1 = "abcd";

        GameRound gameRound1 = new GameRound();
        gameRound1.setUserGuess(userGuess1);
        gameRound1.setTimeOfGuess(LocalDateTime.now().withNano(0));
        gameRound1.setGameId(game.getGameId());

        try {
            service.calculateResult(gameRound1);
            fail("");
        } catch (BadJujuException e) {
            return;
        }

        //testing if the user is inputting 4 digits
        gameRound1.setUserGuess("123");

        try {
            service.calculateResult(gameRound1);
            fail("");
        } catch (BadJujuException e) {
            return;
        }
    }

    /**
     * Test of getRoundsForGameId method, of class BullsAndCowsServiceImpl.
     */
    @Test
    public void testGetRoundsForGameId() throws Exception {

        Game game = new Game();
        game.setAnswer("2130");

        game = service.addGame(game);

        game.setAnswer("Hidden");

        String userGuess = "2122";

        GameRound gameRound = new GameRound();
        gameRound.setUserGuess(userGuess);
        gameRound.setTimeOfGuess(LocalDateTime.now());
        gameRound.setResult("e:2:p:0");
        gameRound.setGameId(game.getGameId());

        service.calculateResult(gameRound);

        List<GameRound> gameRounds = service.getRoundsForGameId(game.getGameId());

        assertEquals(1, gameRounds.size());

        //Getting rounds for invalid gameId
        try {
            service.getRoundsForGameId(game.getGameId() + 1);
            fail("");
        } catch (NoGameFoundException e) {
            return;
        }

    }

}
