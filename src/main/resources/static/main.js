if ($("#addressbook").length){ //addressbook
    $(document).ready(function() {
        $.ajax({
            type: 'post',
            url: $(this).attr('href'),
            data: $('form').serialize()
        }).then(function(data) {
            $('form').attr('action', "/budform/" + data.id);
        });
    });
}
else if($("#bookForm").length){ //book form
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
}
else if($("#link").length){ //direct
    $(document).ready(function() {
        $.ajax({
            url: "/direct/"
        }).then(function(data) {
            $('#link').attr('href', 'addressbook/' + data.id);
        });
    });
}
else if($("#budForm").length){ //Budform
    $(document).ready(function() {
        $.ajax({
            type: 'post',
            url: $(this).attr('href'),
            data: $('form').serialize()
        }).then(function(data) {
            $('form').attr('action', "/budform/" + data.id);
        });
    });
}