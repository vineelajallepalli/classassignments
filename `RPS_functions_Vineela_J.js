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
    playerA.play = getHand()
    playerB.play = getHand()
    console.log(playerA.play + " Vs " + playerB.play);
    if (playerA.play === playerB.play) {
        console.log(playerA.play + " it's a tie");
        return 'Tie';
    } else if (playerA.play === "rock" && playerB.play === "paper") {
        console.log(playerA.play + " " + playerB.play + " " + playerB.name + " is winner");
        return 'B';
    } else if (playerA.play === "rock" && playerB.play === "scissors") {
        console.log(playerA.play + " " + playerB.play + " " + playerA.name + " is winner");
        return 'A';
    } else if (playerA.play === "paper" && playerB.play === "rock") {
        console.log(playerA.play + " " + playerB.play + " " + playerA.name + " is winner")
        return 'A';
    } else if (playerA.play === "paper" && playerB.play === "scissors") {
        console.log(playerA.play + " " + playerB.play + " " + playerB.name + " is winner");
        return 'B';
    } else if (playerA.play === "scissors" && playerB.play === "paper") {
        console.log(playerA.play + " " + playerB.play + " " + playerA.name + " is winner");
        return 'A';
    } else if (playerA.play === "scissors" && playerB.play === "rock") {
        console.log(playerA.play + " " + playerB.play + " " + playerB.name + " is winner");
        return 'B';
    }

}


function playGame(_playUntil) {
    counterA = 1;
    counterB = 1;


    while (counterA <= _playUntil && counterB <= _playUntil) {

        if (playRound(playerA, playerB) === 'A') {

            console.log("A wins " + counterA++ + "times");

        } else if (playRound(playerA, playerB) === 'B') {
            console.log("B wins " + counterB++ + "times");
        }



    }

    if (counterA >= _playUntil) {
        return "A is the winner";
    } else if (counterB >= _playUntil) {
        return "B is the winner";
    }
}
console.log(playGame(5));
