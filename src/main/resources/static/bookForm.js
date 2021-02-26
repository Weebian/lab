$(document).ready(function() {
    $.ajax({
        type: 'post',
        url: "/bookform",
        data: $('form').serialize()
    })
});