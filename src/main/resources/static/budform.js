$(document).ready(function() {
    $.ajax({
        type: 'post',
        url: $(this).attr('href'),
        data: $('form').serialize()
    }).then(function(data) {
        $('form').attr('action', "/budform/" + data.id);
    });
});