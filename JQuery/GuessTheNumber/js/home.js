$(document).ready(function () {

    $.ajax({
        type: 'GET',
        url: 'http:localhost:8080/b&c/game',
        success: function (gameArray) {
            var gamesDiv = $('#allGames');

            $.each(gameArray, function (index, game) {
                var gameInfo = '<p>';
                gameInfo += 'GameId: ' + game.gameId;
                gameInfo += 'GameStatus: ' + game.gameStatus;
                gameInfo += 'Answer: ' + game.answer;
                gameInfo += 'Rounds: ' + game.gameRound;

                gamesDiv.append(gameInfo);
            });

        },
        error: function () {
            alert('FAILURE');
        }
    });

    $('#startButton').on('click', function () {
        $.ajax({
            type: 'GET',
            url: 'http:localhost:8080/b&c/game',
            success: alert('succesful')
        });
    });
});