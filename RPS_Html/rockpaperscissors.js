var hands = ['rock', 'paper', 'scissors'];
var counter = 0;
function getHand() {

    return hands[parseInt(Math.random() * 10) % 3];
}

var playerA = {
    name: "A",
    play: undefined

}

var playerB = {
    name: "B",
    play: undefined

}

function playRound() {
    playerA.play = prompt("Rock, Paper, or Scissors?");
    playerB.play = getHand()
    console.log(playerA.play + " Vs " + playerB.play);
    if (playerA.play === playerB.play) {
        alert(playerA.play + " it's a tie");
       winner = "tie";
        return 'Tie';
    } else if (playerA.play === "rock" && playerB.play === "paper") {
        alert(playerA.play + " " + playerB.play + " " + playerB.name + " is winner");
       winner = "Player B";
        return 'B';
    } else if (playerA.play === "rock" && playerB.play === "scissors") {
        alert (playerA.play + " " + playerB.play + " " + playerA.name + " is winner");
       winner = "Player A";
        return 'A';
    } else if (playerA.play === "paper" && playerB.play === "rock") {
        alert(playerA.play + " " + playerB.play + " " + playerA.name + " is winner");
        winner = "Player A";
        return 'A';
    } else if (playerA.play === "paper" && playerB.play === "scissors") {
        alert (playerA.play + " " + playerB.play + " " + playerB.name + " is winner");
        winner = "Player B";
        return 'B';
    } else if (playerA.play === "scissors" && playerB.play === "paper") {
        alert (playerA.play + " " + playerB.play + " " + playerA.name + " is winner");
       winner = "Player A";
        return 'A';
    } else if (playerA.play === "scissors" && playerB.play === "rock") {
        alert (playerA.play + " " + playerB.play + " " + playerB.name + " is winner");
       winner = "Player B";
        return 'B';
    }

}
//  console.log(playRound());


function playGame(_playUntil) {
    counterA = 1;
    counterB = 1;


    while (counterA <= _playUntil && counterB <= _playUntil) {

        if (playRound(playerA, playerB) === 'A') {

            alert("A wins "+ counterA++ +"times");

        } else if (playRound(playerA, playerB) === 'B') {
            alert("B wins "+ counterB++ +"times");
        }



    }

    if (counterA >= _playUntil) {
        return "A is the winner";
    } else if (counterB >= _playUntil) {
        return "B is the winner";
    }
}
console.log(playGame(2));

document.getElementById("winner").innerHTML = winner + " is the winner!";