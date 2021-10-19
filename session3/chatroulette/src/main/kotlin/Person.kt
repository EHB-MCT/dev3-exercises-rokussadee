open class Person(open val name: String) {
    fun introduce() {
        println("Hi! My name is ${name}")
    }
    open fun talk() {

    }
}
