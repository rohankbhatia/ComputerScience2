$("#player-select").on("change",function(evt){
	var selection=$("#player-select").val();
	$("#player1ID").text(selection);
	evt.preventDefault();
})

var player1ID = null;
var player1Name = null;
var player2ID = null;
var player2Name = null;

$("#submit").on("click",function(evt){
	if(player1ID === null && player2ID === null){
		player1ID=$("#player-select").val();
		player1Name=$("#player-select option:selected").text();
		$("#selected-players").text(player1Name);
	}
	else if(player1ID != null && player2ID === null && player1ID != $("#player-select").val()){
		player2ID=$("#player-select").val();
		player2Name=$("#player-select option:selected").text();
		$("#selected-players").text(player1Name+" and "+player2Name);
	}
	if(player1ID != null && player2ID != null){
		$("#submit").hide();
		window.location="/compare/" + player1ID + "/"+player2ID;
	}


	evt.preventDefault();
})

$("#searchinbutton").on("click",function(evt){
	var selection=$("#sexysax").val();
	$.get("http://localhost:4567/api/search-players/"+selection, function(players){
	    $('#player-select').html('')
		$.each(players, function (i, player) {
		    $('#player-select').append($('<option>', { 
		        value: player.playerID,
		        text: player.firstName + " " + player.lastName
    		}));
		});
	});
	evt.preventDefault();
})