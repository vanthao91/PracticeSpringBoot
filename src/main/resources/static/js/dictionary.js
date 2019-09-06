/**
 * 
 */
$(document).ready(function() {
    $('#dropRoles').change(function () {
        doSearch();
    });

    function doSearch() {
        if ($('select[id=dropRoles] option:selected').val()==0){
            $("#tblHeader").empty();
            $("#tblBody").empty();
            return;
        }
        let data = $('select[id=dropRoles] option:selected').text();
        let url ="/admin/dicSearch?tableName="+data;
        console.log("data " + data);
        $.ajax({
            type: "GET",
            url: url,
            data: data,
            contentType: "application/json",
            dataType: "json",
            async: false,
            success: function (data) {
                $("#tblHeader").empty();
                $("#tblBody").empty();
                let t = "";
                if (data == null || data == '' || data.length <= 0)
                    return;
                Object.keys(data[0]).forEach(function(key){
                    t="";
                    t+='<th>'+key+'</th>';
                    var value = data[0][key];
                    console.log(key + ':' + value);
                    $("#tblHeader").append(t);
                });
                let indx = 0;
                jQuery(data).each(function () {
                    console.log(indx);
                    t = "<tr>";
                    Object.keys(this).forEach(function(key){
                        t+='<td>'+data[indx][key]+'</td>';
                    });
                    indx++;
                    t+='</tr>'
                    $('#tblBody').append(t);
                });
            },
            error: function (XMLHttpRequest) {
                console.log(XMLHttpRequest.responseJSON);
            }
        });
    }
});
