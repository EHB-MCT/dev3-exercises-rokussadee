fun main() {
    val rokus = Student("Rokus")
    val docent = Teacher("Bert")
    val hans = Comedian("Hans Teeuwen")
    val persons = arrayOf(rokus, docent, hans) // Array<Person>

    val chosenSpeaker = persons.random()
    chosenSpeaker.introduce()
    chosenSpeaker.talk() // reason this didn't work: talk has to be an open function and must be overwritten in subclasses
}