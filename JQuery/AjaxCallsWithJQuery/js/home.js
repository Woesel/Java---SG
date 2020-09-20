$(document).ready(function () {
    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/contacts',
        success: function (whatever) {
            var contactsDiv = $('#allContacts');


            //For each of the contacts in contact array, run the function
            //the function will hand in the index and will pull out the next contact there
            $.each(whatever, function (index, contact) {

                var contactInfo = '<p>';
                contactInfo += 'Name: ' + contact.firstName + ' ' + contact.lastName + '<br>';
                contactInfo += 'Company: ' + contact.company + '<br>';
                contactInfo += 'Email: ' + contact.email + '<br>';
                contactInfo += 'Phone: ' + contact.phone + '<br>';
                contactInfo += '</p>';
                contactInfo += '<hr>';

                contactsDiv.append(contactInfo);

            });
        },
        error: function () {
            alert('FAILURE');
        }
    });

    $('#add-button').on('click', function () {
        $.ajax({
            type: 'POST',
            url: 'http://localhost:8080/contact',
            data: JSON.stringify({
                firstName: $('#add-first-name').val(),
                lastName: $('#add-last-name').val(),
                company: $('#add-company').val(),
                phone: $('#add-phone').val(),
                email: $('#add-email').val()
            }),
            headers: {
                'Accept': 'application/JSON',
                'Content-Type': 'application/json'
            },
            'dataType': 'json',
            success: function (contact) {

                var newContactDiv = $('#newContact');

                var contactInfo = '<p>';
                contactInfo += 'Name: ' + contact.firstName + ' ' + contact.lastName + '<br>';
                contactInfo += 'Company: ' + contact.company + '<br>';
                contactInfo += 'Email: ' + contact.email + '<br>';
                contactInfo += 'Phone: ' + contact.phone + '<br>';
                contactInfo += '</p>';
                contactInfo += '<hr>';

                newContactDiv.append(contactInfo);


            },
            error: function () {
                alert('FAILURE');
            }

        });
    });
});