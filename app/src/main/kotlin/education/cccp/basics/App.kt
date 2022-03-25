package education.cccp.basics

import education.cccp.basics.Utils.DATE_PATTERN
import education.cccp.basics.Utils.howOldAreYou
import education.cccp.basics.Utils.randomSalaryGenerator
import java.time.LocalDate
import java.time.LocalDate.parse
import java.time.format.DateTimeFormatter
import kotlin.math.roundToLong
import kotlin.random.Random.Default.nextDouble

object Utils {
    fun howOldAreYou(date: LocalDate) = LocalDate.now().year - date.year

    fun randomSalaryGenerator() = nextDouble(
        from = 0.0,
        until = 100000.0
    ).roundToLong().toDouble()

    const val DATE_PATTERN = "dd/MM/yyyy"
}

fun main() {
    val dateFormat = DateTimeFormatter.ofPattern(DATE_PATTERN)
    val date1 = parse("02/11/1975", dateFormat)
    val date3 = parse("03/12/1976", dateFormat)
    val date4 = parse("04/01/1977", dateFormat)

    val person1 = Person(
        id = 1,
        firstName = "John",
        lastName = "Doe",
        birthDate = date1,
        age = howOldAreYou(date1),
        salary = randomSalaryGenerator(),
        vehicules = mutableListOf(
            Vehicule(1, "red"),
            Vehicule(2, "black")
        )
    )
    val person2 = Person(
        id = 1,
        firstName = "John",
        lastName = "Doe",
        birthDate = person1.birthDate,
        age = person1.age,
        salary = person1.salary,
        vehicules = person1.vehicules.map { it.copy() }
    )


    val person3 = Person(
        id = 2,
        firstName = "Harry",
        lastName = "Hoe",
        birthDate = date3,
        age = howOldAreYou(date3),
        salary = randomSalaryGenerator(),
        vehicules = mutableListOf(
            Vehicule(3, "green"),
            Vehicule(4, "yellow")
        )
    )
    val person4 = Person(
        id = 3,
        firstName = "Jackie",
        lastName = "Joe",
        birthDate = date4,
        age = howOldAreYou(date4),
        salary = randomSalaryGenerator(),
        vehicules = mutableListOf(
            Vehicule(numero = 5, couleur = "blue"),
            Vehicule(6, "purple")
        )
    )

    val persons = mutableListOf(
        person1, person2, person3, person4,
    )

    persons.forEach { println(it) }

    if (person1 == person2) println("person1 equals person2")
    if (person1 == person3) println("person1 equals person3")
    if (person1 == person4) println("person1 equals person4")
    if (person2 == person4) println("person2 equals person4")


    val date2 = parse("05/02/1978", dateFormat)
    val fooEmployee: Employee = Employee(
        id = 4,
        firstName = "Carla",
        lastName = "Coe",
        birthDate = date2,
        age = howOldAreYou(date2),
        salary = randomSalaryGenerator(),
        vehicules = mutableListOf(
            Vehicule(7, "white"),
            Vehicule(8, "black")
        ),
        diplome = "1",
        statutCadre = false,
        fonction = "fonction1"
    )
    println(fooEmployee)

}
