$(document).ready(function () {
    loadContacts();
    $('#add-button').click(function (event) {

        var haveValidationErrors = checkAndDisplayValidationErrors($('#add-form').find('input'));

        if (haveValidationErrors) {
            return false;
        }

        $.ajax({
            type: 'POST',
           // url: 'http://localhost:8080/contact',
            url: 'https://tsg-contactlist.herokuapp.com/contact',
            data: JSON.stringify({
                firstName: $('#add-first-name').val(),
                lastName: $('#add-last-name').val(),
                company: $('#add-company').val(),
                phone: $('#add-phone').val(),
                email: $('#add-email').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json',
            success: function () {
                $('#errorMessages').empty();
                $('#add-first-name').val();
                $('#add-last-name').val();
                $('#add-company').val();
                $('#add-phone').val();
                $('#add-email').val();

                loadContacts();
            },
            error: function () {
                $('#errorMessages')
                    .append($('<li>'))
                    .attr({ class: 'list-group-item list-group-item-danger' })
                    .text('Error calling web service. Please try again later.');
            }
        })
    });

    $('#edit-button').click(function (event) {

        var haveValidationErrors = checkAndDisplayValidationErrors($('#edit-form').find('input'));

        if (haveValidationErrors) {
            return false;
        }

        $.ajax({
            type: 'PUT',
            url: 'https://tsg-contactlist.herokuapp.com/contact/' + $('#edit-contact-id').val(),
            data: JSON.stringify({
                contactId: $('#edit-contact-id').val(),
                firstName: $('#add-first-name').val(),
                lastName: $('#add-last-name').val(),
                company: $('#add-company').val(),
                phone: $('#add-phone').val(),
                email: $('#add-email').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        })

    })



});

function loadContacts() {

    clearContactTable();
    var contentRows = $('#contentRows');

    $.ajax({
        type: 'GET',
        url: 'https://tsg-contactlist.herokuapp.com/contacts',
        success: function (contactArray) {
            $.each(contactArray, function (index, contact) {
                var name = contact.firstName + ' ' + contact.lastName;
                var company = contact.company;
                var contactId = contact.contactId;

                var row = '<tr>';
                row += '<td>' + name + '</td>';
                row += '<td>' + company + '</td>';
                row += '<td><a href="#" onClick="showEditForm(' + contactId + ')"> Edit</a></td>';
                row += '<td><a href="#" onClick="deleteContact(' + contactId + ')">Delete</a></td>';
                row += '</td>'

                contentRows.append(row);

            });
        },
        error: function () {
            $('#errorMessages')
                .append($('<li>'))
                .attr({ class: 'list-group-item list-group-item-danger' })
                .text('Error calling web service. Please try again later.');
        }
    });
}

function clearContactTable() {
    $('#contentRows').empty();


}

function showEditForm(contactId) {
    $('errorMessages').empty();

    $.ajax({
        type: 'GET',
        url: 'https://tsg-contactlist.herokuapp.com/contact/' + contactId,
        success: function (data, status) {
            $('#edit-first-name').val(data.firstName);
            $('#edit-last-name').val(data.lastName);
            $('#edit-company').val(data.company);
            $('#edit-phone').val(data.phone);
            $('#edit-email').val(data.email);
            $('#edit-contact-id').val(data.contactId);
        },
        error: function () {
            $('#errorMessages')
                .append($('<li>'))
                .attr({ class: 'list-group-item list-group-item-danger' })
                .text('Error calling web service. Please try again later.');
        }
    })

    $('#contactTableDiv').hide();

    $('#editFormDiv').show();
}

function hideEditForm() {

    $('#errorMessages').empty();

    $('#edit-first-name').val('');
    $('#edit-last-name').val('');
    $('#edit-company').val('');
    $('#edit-phone').val('');
    $('#edit-email').val('');

    $('#editFormDiv').hide();
    $('#contactTableDiv').show();
}

function deleteContact(contactId) {
    $.ajax({
        type: 'DELETE',
        url: 'https://tsg-contactlist.herokuapp.com/contact/' + contactId,
        success: function () {
            loadContacts();
        }
    });
}

function checkAndDisplayValidationErrors(input) {
    $('#errorMessages').empty();

    var errorMessages = [];

    input.each(function () {
        if (!this.validity.valid) {
            var errorField = $('label[for=' + this.id + ']').text();
            errorMessages.push(errorField + '' + this.validationMessage);
        }
    });

    if (errorMessages.length > 0) {
        $.each(errorMessages, function (index, message) {
            $('#errorMessages').append($('<li>').attr({ class: 'list-group-item list-group-item-danger' }).text(message));
        });
        return true;
    } else {
        return false;
    }
}