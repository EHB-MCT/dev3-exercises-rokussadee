open class Person(open val name: String): ChatPartner {
    override fun introduce() {
        println("Hi! My name is $name")
    }
    override open fun talk() {
    }
}