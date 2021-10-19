class Chatbot(private val name: String): ChatPartner {
    override fun introduce() {
        println("Hi! My name is $name")
    }
    override fun talk() {
        println("Chatbot Dialog")
    }
}