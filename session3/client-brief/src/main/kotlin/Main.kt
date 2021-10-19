fun main () {
    val design1 = CourseModule("Design", "Design I", 1, 5, 1, "Kobe Vermeire & Jan", "Design beschrijving")
    val development1 = CourseModule("Development", "Development I", 1, 5, 1, "Pieter Dierckx", "Development beschrijving")
    println("The course module ${design1.title} is part of the ${design1.cluster} cluster of Bachelor ${design1.year}. It is given by ${design1.teacher} and counts for ${design1.credits} credits:")
    print(design1.description)
}