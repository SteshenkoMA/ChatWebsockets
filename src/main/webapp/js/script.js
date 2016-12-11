var ws;

function connect() {
    var chatRoom = document.getElementById("chatRoom").value;
    ws = new WebSocket("ws://" + document.location.host + "/ChatWebSockets/chat/" + chatRoom);


    ws.onmessage = function(event) {
    var log = document.getElementById("log");
        console.log(event.data);
        var message = JSON.parse(event.data);
        log.innerHTML += message.sender + " : " + message.message + "\n";
    };
}

function send() {
    var content = document.getElementById("message").value;
    var to = document.getElementById("nickname").value;
    var json = JSON.stringify({
         "message":content,
         "sender":to
    });

    ws.send(json);
    log.innerHTML += "Me : " + content + "\n";
}