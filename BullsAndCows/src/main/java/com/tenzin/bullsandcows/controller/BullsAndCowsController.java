package com.tenzin.bullsandcows.controller;

import com.tenzin.bullsandcows.dto.Game;
import com.tenzin.bullsandcows.dto.GameRound;
import com.tenzin.bullsandcows.service.BullsAndCowsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tenzin Woesel Aug 21, 2020
 */
@RestController
@RequestMapping("/b&c")
public class BullsAndCowsController {

    @Autowired
    BullsAndCowsService service;

    /**
     * "game" – GET – Returns a list of all games. Be sure in-progress games do
     * not display their answer.
     */
    @GetMapping("/game")
    public List<Game> getAllGames() {
        return service.getAllGames();
    }

    /**
     * "begin" - POST – Starts a game, generates an answer, and sets the correct
     * status.Should return a 201 CREATED message as well as the created gameId.
     */
    @PostMapping("/begin")
    @ResponseStatus(HttpStatus.CREATED)
    public int startGame() {
        return service.startGame();
    }

    /**
     * "game/{gameId}" - GET – Returns a specific game based on ID. Be sure
     * in-progress games do not display their answer.
     */
    @GetMapping("/game/{gameId}")
    public ResponseEntity<Game> getGameById(@PathVariable int gameId) {
        Game result = service.getGameById(gameId);
        if (result == null) {
            return new ResponseEntity(null, HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }

    /**
     * "guess" – POST – Makes a guess by passing the guess and gameId in as
     * JSON. The program must calculate the results of the guess and mark the
     * game finished if the guess is correct.It returns the Round object with
     * the results filled in.
     *
     * @return
     */
    @PostMapping("/guess")
    public GameRound userGuess(@RequestBody GameRound gameRound) throws Exception {

        return service.calculateResult(gameRound);

    }

    /**
     * "rounds/{gameId} – GET – Returns a list of rounds for the specified game
     * sorted by time.
     */
    @GetMapping("/rounds/{gameId}")
    public List<GameRound> getAllGameRounds(@PathVariable int gameId) throws Exception {

        List<GameRound> rounds = service.getRoundsForGameId(gameId);
        return rounds;
    }

    @PostMapping("/start")
    @ResponseStatus(HttpStatus.CREATED)
    public int startNewGame() {

        Game game = service.startNewGame();
        return game.getGameId();
    }
}
