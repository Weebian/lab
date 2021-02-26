$(document).ready(function() {
    $.ajax({
        type: 'post',
        url: "/bookform",
        data: $('form').serialize()
    }).then(function(data) {
        $('a').attr('href', "/budform/" + data.id);
        $("#fulltr").hide();

        if(data.isEmpty == false){
            $("#emptr").hide();
            for (i = 0; i < data.book.length; i++){
                $('table').append(
                    "<tr>" +
                    "<td>" + data.book[i].name + "</td>" +
                    "<td>" + data.book[i].address + "</td>" +
                    "<td>" + data.book[i].phoneNumber + "</td>" +
                    "</tr>"
                );
            };
        };
    });
});