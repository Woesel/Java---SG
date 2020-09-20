package com.tenzin.bullsandcows.service;

import com.tenzin.bullsandcows.dao.GameDao;
import com.tenzin.bullsandcows.dao.GameRoundDao;
import com.tenzin.bullsandcows.dto.Game;
import com.tenzin.bullsandcows.dto.GameRound;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tenzin Woesel Aug 24, 2020
 */
@Service
public class BullsAndCowsServiceImpl implements BullsAndCowsService {

    @Autowired
    GameDao gameDao;

    @Autowired
    GameRoundDao gameRoundDao;

    ///////////////////////////////
    ///Regular Model Methods
    @Override
    public List<Game> getAllGames() {
        List<Game> games = gameDao.getAllGames();

        for (Game game : games) {
            if (!game.isGameStatus()) {
                game.setAnswer("Hidden");

            }
            game.setGameRound(gameRoundDao.getGameRoundsForGame(game));

        }
        return games;
    }

    @Override
    public Game getGameById(int gameId) {

        try {
            Game game = gameDao.getGameById(gameId);
            if (!game.isGameStatus()) {
                game.setAnswer("Hidden");

            }
            return game;

        } catch (NullPointerException e) {
            return null;
        }

    }

    @Override
    public Game getGameByIdNotHidden(int gameId) {

        try {
            Game game = gameDao.getGameById(gameId);

            return game;

        } catch (NullPointerException e) {
            return null;
        }

    }

    @Override
    public Game addGame(Game game) {
        return gameDao.addGame(game);
    }

    @Override
    public void editGame(Game game) {
        gameDao.updateGame(game);
    }

    @Override
    public void deleteGameById(int gameId) {
        gameDao.deleteGame(gameId);
    }

    @Override
    public int startGame() {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        //Shuffle 
        Collections.shuffle(numbers);

        String result = "";
        for (int i = 0; i < 4; i++) {
            result += numbers.get(i).toString();
        }

        Game game = new Game();
        game.setAnswer(result);

        gameDao.addGame(game);

        return game.getGameId();

    }

    private void validate(GameRound gameRound) throws Exception {
        String userGuess = gameRound.getUserGuess();
        if (userGuess.length() != 4) {
            throw new BadJujuException("Enter 4 digits.");
        } else if (!Pattern.matches("[0-9]*", userGuess)) {
            throw new BadJujuException("Enter numbers only.");
        }

    }

    @Override
    public GameRound calculateResult(GameRound gameRound) throws Exception {

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

        return gameRoundDao.addGameRound(gameRound);

    }

    @Override
    public List<GameRound> getRoundsForGameId(int gameId) throws Exception {

        Game game = gameDao.getGameById(gameId);

        if (game == null) {
            throw new NoGameFoundException("There's no game with that Id");
        }
        return gameRoundDao.getGameRoundsForGame(game);

    }
    
    @Override
    public Game startNewGame() {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        //Shuffle 
        Collections.shuffle(numbers);

        String result = "";
        for (int i = 0; i < 4; i++) {
            result += numbers.get(i).toString();
        }

        Game game = new Game();
        game.setAnswer(result);

        return gameDao.addGame(game);

    }
}
