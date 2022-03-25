package education.cccp.basics

import java.time.LocalDate.parse
import java.time.format.DateTimeFormatter


fun main() {
    val dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val thisYear = 2022
    val person1 = Person(
        id = 1,
        firstName = "John",
        lastName = "Doe",
        birthDate = parse("02/11/1975", dateFormat)
    )
    val person2 = Person(
        id = 1,
        firstName = "John",
        lastName = "Doe",
        birthDate = parse("02/11/1975", dateFormat)
    )


    val person3 = Person(
        id = 2,
        firstName = "Harry",
        lastName = "Hoe",
        birthDate = parse("03/12/1976", dateFormat)
    )
    val person4 = Person(
        id = 3,
        firstName = "Jackie",
        lastName = "Joe",
        birthDate = parse("04/01/1977", dateFormat)
    )

    val persons = mutableListOf(
        person1, person2, person3, person4,
    )

    persons.forEach { println(it) }

    if (person1 == person2) println("person1 equals person2")
    if (person1 == person3) println("person1 equals person2")
    if (person1 == person4) println("person1 equals person2")
    if (person2 == person4) println("person1 equals person2")
}
