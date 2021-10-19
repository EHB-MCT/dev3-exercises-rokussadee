fun main() {
    val person1 = Person("Rokus")
    val person2 = Person("Bot")
    val persons = arrayOf(person1, person2)

    val chosenSpeaker = persons.random()
    chosenSpeaker.introduce()
}