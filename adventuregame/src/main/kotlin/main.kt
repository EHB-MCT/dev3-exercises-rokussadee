fun main() {
    println("Welcome to Rokus Cornelis Math Sadée's Allan Holdsworth-themed game. Can you solve the following riddle?")
    challengeOne()
}

fun challengeOne() {
    println("Which more recent artists did Allan Holdsworth influence greatly?")
    val possibleAnswers = setOf("Tosin Abasi", "Paul Masvidal", "Animals As Leaders", "Cynic", "Obscura", "Death")

    var playerAnswer = readLine().toString()
    if(possibleAnswers.contains(playerAnswer)) {
        answeredCorrectly()
        challengeTwo()
    } else {
        gameOver()
    }
}

fun challengeTwo() {
    val computerChoice = setOf<Int>(1, 2, 3, 4, 5, 6).random()
    var playerAnswer = ""

    do {
        print("Will the dice roll output low (1-3) or high (4-6)?")
        playerAnswer = readLine().toString()
    } while (playerAnswer != "low" && playerAnswer != "high")

    if (playerAnswer == "low" && (1..3).contains(computerChoice)) {
        answeredCorrectly()
        challengeThree()
    } else if (playerAnswer == "high" && (4..6).contains(computerChoice)) {
        answeredCorrectly()
        challengeThree()
    } else {
        gameOver()
    }
}

fun challengeThree() {
    println("Well done. You've made it to the third round.")
    println("You have been granted the opportunity to compose a song with Allan. What musical concept will you milk the shit out of?")

    val options = listOf<String>( "Sus or Add chords", "The Circle of Fifths", "Chromaticism")

    println("Your options: ")
    println("${options[0]}")
    println("${options[1]}")
    println("${options[2]}")

    var userInput = readLine().toString()

    if (userInput == options[0]) {
        answeredCorrectly()
        println("You won the game!")
    } else if (userInput == options[2]) {
        println("Incorrect, you have to retry the last two riddles")
        challengeTwo()
    } else {
        gameOver()
    }
}

fun answeredCorrectly() {
    println("You answered correctly!")
}

fun gameOver() {
    println("You lost. Game Over")
}