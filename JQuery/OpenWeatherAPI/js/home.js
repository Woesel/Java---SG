$(document).ready(function () {
    $('#getWeatherButton').click(function () {
        var isValidZip = validateZip($('#add-zipcode').val());

        if (isValidZip) {
            getWeatherDescription();

        } else {
            return false;
        }


    })
});

function getWeatherDescription() {
    $('errorMessages').empty();
    var zipcode = $('#add-zipcode').val();
    var unit = $('#units').val();

    $.ajax({
        type: 'GET',
        //api.openweathermap.org/data/2.5/weather?zip={zip code},{country code}&appid={your api key}
        url: 'https://api.openweathermap.org/data/2.5/weather?zip=' + zipcode + ',us&units=' + unit + '&appid=e29cdf0230a29421136b584c08af9f37',
        success: function (currentWeather, status) {

            var currentCity = $('#city-name');

            var cityName = currentWeather.name;
            currentCity.html(cityName);

            var currentCondition = $('#weatherDescription');
            
        },
        error: function () {
            $('#errorMessage')
                .append($('<li>'))
                .attr({ class: 'list-group-item list-group-item-danger' })
                .text('Error calling web service. Please try again later.');
        }

    })

    $('#weatherCondition').show();

};

function validateZip(zipcode) {
    $('#errorMessage').empty();
    var zip = /^\d{5}$/;

    if (zip.test(zipcode)) {
        return true;
    } else {
        $('#errorMessage')
            .append($('<li>'))
            .attr({ class: 'list-group-item-danger' })
            .text('Zipcode: Please enter a 5-digit zip code.')
        return false;
    }
};