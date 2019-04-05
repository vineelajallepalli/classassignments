var players = [
	{firstName: 'Cam', lastName: 'Newton', position: 'QB', touchdowns: 32},
	{firstName: 'Derek', lastName: 'Anderson', position: 'QB', touchdowns: 0},
	{firstName: 'Jonathan', lastName: 'Stewart', position: 'RB', touchdowns: 12},
	{firstName: 'Mike', lastName: 'Tolbert', position: 'RB', touchdowns: 8},
	{firstName: 'Fozzy', lastName: 'Whittaker', position: 'RB', touchdowns: 3},
	{firstName: 'Ted', lastName: 'Ginn', position: 'WR', touchdowns: 9},
	{firstName: 'Devin', lastName: 'Funchess', position: 'WR', touchdowns: 2}
];

var findMike = players.find(function(players){
    return players.firstName==='Mike';
});
var positionRB= players.filter(function(players){
    return players.position==='RB';
});

var playerLN = players.map(function(players){
    return players.lastName;
});   

var playerRBTD= players.filter(function(players){
    return players.position==='RB' && players.touchdowns > 5;
}).	map(function(playerRBTD){
    return playerRBTD.firstName+' '+playerRBTD.lastName;
});



var RBTD = positionRB.reduce(function(sum,current){ 

  return sum + current.touchdowns;

},0);


//console.log(findMike);
//console.log(positionRB);
// console.log(playerLN);
// console.log(playerRBTD);
console.log(playerRBTD);
 console.log(RBTD);