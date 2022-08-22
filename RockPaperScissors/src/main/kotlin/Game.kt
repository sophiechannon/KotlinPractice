fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
}

fun getGameChoice(optionsParam: Array<String>): String {
    return optionsParam[(Math.random() * optionsParam.size).toInt()]
}

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        // print choices
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        // get user input
        val userInput = readLine()
        // validate the answer
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        // print message if code isn't valid
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}