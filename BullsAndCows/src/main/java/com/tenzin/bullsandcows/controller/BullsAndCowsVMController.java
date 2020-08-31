package com.tenzin.bullsandcows.controller;

import com.tenzin.bullsandcows.dto.GameRound;
import com.tenzin.bullsandcows.dto.GameRoundVM;
import com.tenzin.bullsandcows.dto.GameVM;
import com.tenzin.bullsandcows.service.BAndCowVM;
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
 * @author Tenzin Woesel Aug 29, 2020
 */
@RestController
@RequestMapping("b&c/vm")
public class BullsAndCowsVMController {

    @Autowired
    BullsAndCowsService service;

    @Autowired
    BAndCowVM vm;

    /**
     * "game" – GET – Returns a list of all games. Be sure in-progress games do
     * not display their answer.
     */
    @GetMapping("/game")
    public List<GameVM> getAllGames() {
        return vm.getAllGamesVM();
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
    public ResponseEntity<GameVM> getGameById(@PathVariable int gameId) {
        GameVM result = vm.getGameVMById(gameId);
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
    public GameRoundVM userGuess(@RequestBody GameRound gameRound) throws Exception {

        return vm.calculateVMResult(gameRound);

    }

    /**
     * "rounds/{gameId} – GET – Returns a list of rounds for the specified game
     * sorted by time.
     */
    @GetMapping("/rounds/{gameId}")
    public List<GameRoundVM> getAllGameRounds(@PathVariable int gameId) throws Exception {
        return vm.getVMRoundsForGameId(gameId);
    }

}
