var pathname = window.location.pathname.split("/");
var player1ID = pathname[2]; 
var player2ID = pathname[3];
console.log(player1ID,player2ID);

$.get("http://localhost:4567/api/compare/"+player1ID+"/"+player2ID,function(stats){


	$("#nameplayer1").text(stats[player1ID].firstName+ " " +stats[player1ID].lastName);
	$("#nameplayer2").text(stats[player2ID].firstName+ " " +stats[player2ID].lastName);
	$("#baplayer1").text(stats[player1ID].bat);
	$("#rbiplayer1").text(stats[player1ID].rbi);
	$("#baplayer2").text(stats[player2ID].bat);
	$("#rbiplayer2").text(stats[player2ID].rbi);
	
	$("#hrplayer1").text(stats[player1ID].hr);
	$("#hrplayer2").text(stats[player2ID].hr);
	$("#walkplayer1").text(stats[player1ID].walks);
	$("#walkplayer2").text(stats[player2ID].walks);
	$("#sbplayer1").text(stats[player1ID].sb);
	$("#sbplayer2").text(stats[player2ID].sb);
	$("#soplayer1").text(stats[player1ID].so);
	$("#soplayer2").text(stats[player2ID].so);
	
	$("#cpsplayer1").text(stats[player1ID].cps);
	$("#cpsplayer2").text(stats[player2ID].cps);
	
	$("#colorplayer1").text(stats[player1ID].color);
	$("#colorplayer2").text(stats[player2ID].color);
})