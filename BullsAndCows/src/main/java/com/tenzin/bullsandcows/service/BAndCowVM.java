package com.tenzin.bullsandcows.service;

import com.tenzin.bullsandcows.dao.GameDao;
import com.tenzin.bullsandcows.dao.GameRoundDao;
import com.tenzin.bullsandcows.dto.Game;
import com.tenzin.bullsandcows.dto.GameRound;
import com.tenzin.bullsandcows.dto.GameRoundVM;
import com.tenzin.bullsandcows.dto.GameVM;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tenzin Woesel Aug 29, 2020
 */
@Service
public class BAndCowVM {

    @Autowired
    GameDao gameDao;

    @Autowired
    GameRoundDao gameRoundDao;

    ///////////////////////////////
    ///View Model Methods
    //For getting all the games
    public List<GameVM> getAllGamesVM() {
        List<Game> games = gameDao.getAllGames();

        List<GameVM> gameVMs = new ArrayList<>();

        for (Game game : games) {
            gameVMs.add(convertToViewModel(game));
            game.setGameRound(gameRoundDao.getGameRoundsForGame(game));

        }

        return gameVMs;

    }

    //For Getting games by gameID
    public GameVM getGameVMById(int gameId) {
        try {
            //create a game and get the data from the dao
            Game game = gameDao.getGameById(gameId);
            //convert the game into the gameVM and return it
            return convertToViewModel(game);
        } catch (NullPointerException e) {
            return null;
        }

    }

    //when user guesses a number
    //Getting List of gameRounds associated with the gameId
    public List<GameRoundVM> getVMRoundsForGameId(int gameId) throws NoGameFoundException {

        Game game = gameDao.getGameById(gameId);

        if (game == null) {
            throw new NoGameFoundException("There's no game with that Id");
        }

        List<GameRound> gameRounds = gameRoundDao.getGameRoundsForGame(game);

        List<GameRoundVM> grVM = new ArrayList<>();

        for (GameRound gameRound : gameRounds) {

            grVM.add(convertToViewModel2(gameRound));

        }
        return grVM;
    }

    private void validate(GameRound gameRound) throws Exception {
        String userGuess = gameRound.getUserGuess();
        if (userGuess.length() != 4) {
            throw new BadJujuException("Enter 4 digits.");
        } else if (!Pattern.matches("[0-9]*", userGuess)) {
            throw new BadJujuException("Enter numbers only.");
        }
    }

    //////////////////////////////////////
    ///////////Calculating the result
    public GameRoundVM calculateVMResult(GameRound gameRound) throws Exception {

        validate(gameRound);
        Game game = gameDao.getGameById(gameRound.getGameId());

        String userGuess = gameRound.getUserGuess();
        String answer = game.getAnswer();

        if (userGuess.equals(answer)) {
            gameRound.setResult("e:4:p:0");
            //if the result is e:4:p:0, then mark the game as finished
            //then update the game in the database
            game.setGameStatus(true);
            gameDao.updateGame(game);
        } else {
            int eCounter = 0;
            int pCounter = 0;
            for (int i = 0; i < answer.length(); i++) {
                //if the first digit of the answer is the 
                //same as the first digit of the guess
                //then that means exact matches = 1
                if (userGuess.charAt(i) == answer.charAt(i)) {
                    eCounter++;
                } else if (userGuess.contains(answer.substring(i, i + 1))) {
                    pCounter++;
                }
            }
            gameRound.setResult("e:" + eCounter + ":p:" + pCounter);
        }

        gameRound.setTimeOfGuess(LocalDateTime.now());
        gameRoundDao.addGameRound(gameRound);

        return convertToViewModel2(gameRound);

    }

    /////////////////////////////////////////
    ////////////Convert Game to GameVM
    private GameVM convertToViewModel(Game game) {

        GameVM gameVM = new GameVM();

        List<GameRound> gr = gameRoundDao.getGameRoundsForGame(game);

        List<GameRoundVM> grVM = new ArrayList<>();

        for (GameRound gameRound : gr) {

            grVM.add(convertToViewModel2(gameRound));
        }

        String gameStatus = "";

        if (!game.isGameStatus()) {
            gameVM.setAnswer("HIDDEN");
            gameVM.setGameStatus("In Progress");
            gameVM.setGameRound(grVM);
        } else {
            gameVM.setAnswer(game.getAnswer());
            gameVM.setGameStatus("Finished");
            gameVM.setGameRound(grVM);
        }

        gameVM.setGameId(Integer.toString(game.getGameId()));
        return gameVM;
    }

    //////////////////////////////////////////////////
    /////////Convert gameRound to gameRound VM
    private GameRoundVM convertToViewModel2(GameRound gameRound) {

        GameRoundVM gr = new GameRoundVM();

        gr.setUserGuess(gameRound.getUserGuess());
        gr.setTimeOfGuess(gameRound.getTimeOfGuess());
        gr.setGameId(gameRound.getGameId());

        String result = gameRound.getResult();

        char e = result.charAt(2);
        char p = result.charAt(6);
        if (Character.getNumericValue(e) == 4) {
            result = "You have guessed the exact number";
        } else {
            result = "You have " + e + " exact matches and " + p + " partial matches.";
        }
        gr.setResult(result);

        return gr;
    }
}
