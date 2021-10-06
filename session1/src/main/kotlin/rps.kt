fun main() {
    val options = arrayOf("rock", "paper", "scissors")

    val computerChoice = options.random()
    val userChoice = getUserChoice(options)

    println("The computer chose $computerChoice")
    println("You chose $userChoice")

    println(determineWinner(userChoice, computerChoice))
}

fun getUserChoice(options: Array<String>): String {

    val question = "rock, paper or scissors?"
    var userChoice = ""

    do {
        println(question)
        userChoice = readLine().toString()
        if(!options.contains(userChoice)) {
            println("please enter one of these values:")
        }
    } while (!options.contains(userChoice))

    return userChoice
}

fun determineWinner(userChoice: String, computerChoice: String): String {
    if (userChoice == computerChoice) {
        return "It's a tie. Try again!"
    } else if((userChoice == "paper" && computerChoice == "rock") || (userChoice == "scissors" && computerChoice == "paper") || (userChoice == "rock" && computerChoice == "scissors")) {
        return "You Won!"
    } else {
        return "You Lost!"
    }
}