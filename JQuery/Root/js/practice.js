$(document).ready(function(){
    $("#toggleNumbers").on('click', function(){
        $('h2').toggle('slow');
    });

    $('#centerUp').on('click', function(){
        $('h1').addClass('text-center');
        $('h2').addClass('text-center');
        $('#buttonDiv').addClass('text-center');
    });

    $('#headingsBlue').on('click', function(){
        $('h1').css('color', 'blue');
    });

    $('div').hover(
        //In-function
        function(){
            $(this).css('background-color', 'CornflowerBlue');
        },
        //Out-function
        function(){
            $(this).css('background-color', '');
        });

    $('h2').hover(
        //In-function
        function(){
            $(this).css('color', 'DarkOrange');
        },
        //Out-function
        function(){
            $(this).css('color', '');
        }
    );

    $('#mainHeading').hover(
        //In-function
        function(){
            $(this).css('color', 'red');
        },
        //Out-function
        function(){
            $(this).css('color', 'pink');
        }
    );
});