$(document).ready(function() {
    $.ajax({
        url: "/direct/"
    }).then(function(data) {
        $('#link').attr('href', 'addressbook/' + data.id);
    });
});