fun main() {
    println("hello world")
    val students = arrayOf("Rokus", "Tuur", "Cosima", "Sim", "Jarno")
    for (student in students) {
        println(printName(student))
    }
}

fun printName(playername: String): String {
    return "Gedag ${playername}"
}