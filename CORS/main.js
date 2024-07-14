function main() 
{
    console.log("nicks-cors-test");
    $.ajax
    ({
        url: "http://localhost:8080/user/name?nome=Gianpaolo",
        success: function(data) 
        {
            console.log(data);
        }
    });
}