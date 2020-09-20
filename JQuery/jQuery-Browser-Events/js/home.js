

$(document).ready(function () {
    //Page Load
    //Only the content in the Main section should display when the page is loaded.
    $("#akronInfoDiv").hide();
    $("#minneapolisInfoDiv").hide();
    $("#louisvilleInfoDiv").hide();

    ////////////////////////////////
    ///Navigation Button Behavior

    //When the Akron button is clicked, only the content in 
    //the Akron section should display; the weather information
    //for Akron should be hidden initially.
    //Show/Hide Weather Behavior


    $("#akronButton").on("click", function () {
        $("#akronWeather").hide();
        $("#akronInfoDiv").toggle();
        $("#mainInfoDiv").hide();
        $("#louisvilleInfoDiv").hide();
        $("#minneapolisInfoDiv").hide();
    });

    $("#akronWeatherButton").on("click", function () {
        $("#akronWeather").toggle();
    });

    //When the Minneapolis button is clicked, only the content
    // in the Minneapolis section should display; the weather
    // information for Minneapolis should be hidden initially.
    $("#minneapolisButton").on("click", function () {
        $("#minneapolisWeather").hide();
        $("#minneapolisInfoDiv").toggle();
        $("#akronInfoDiv").hide();
        $("#mainInfoDiv").hide();
        $("#louisvilleInfoDiv").hide();
    });

    $("#minneapolisWeatherButton").on("click", function () {
        $("#minneapolisWeather").toggle();
    });

    //Louisville 
    //Show/Hide Weather Behavior
    $("#louisvilleButton").on("click", function () {
        $("#louisvilleWeather").hide();
        $("#louisvilleInfoDiv").toggle();
        $("#mainInfoDiv").hide();
        $("#minneapolisInfoDiv").hide();
        $("#akronInfoDiv").hide();
    });

    $("#louisvilleWeatherButton").on("click", function () {
        $("#louisvilleWeather").toggle();
    });

    //Table Row Behavior

    //The background color of any table row should change to 
    //“WhiteSmoke” when the mouse pointer is hovering over the
    // row.

    $("td").hover(
        function(){
            $(this).parent().css("background-color","WhiteSmoke")
        },
        function(){
            $(this).parent().css("background-color", "");
        }
    );


});