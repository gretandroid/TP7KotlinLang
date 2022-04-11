package education.cccp.basics

import education.cccp.basics.Utils.dateFormat
import education.cccp.basics.Utils.howOldAreYou
import education.cccp.basics.Utils.randomSalaryGenerator
import java.time.LocalDate
import java.time.LocalDate.parse
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatter.ofPattern
import kotlin.math.roundToLong
import kotlin.random.Random.Default.nextDouble

private const val DATE_PATTERN = "dd/MM/yyyy"

object Utils {
    @JvmStatic
    fun howOldAreYou(date: LocalDate): Int = LocalDate.now().year - date.year

    @JvmStatic
    fun randomSalaryGenerator(): Double = nextDouble(
        from = 0.0,
        until = 10000.0
    ).roundToLong().toDouble()

    @JvmStatic
    val dateFormat: DateTimeFormatter by lazy { ofPattern(DATE_PATTERN) }
}

fun main() {
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
            Vehicule(numero = 1, couleur = "red"),
            Vehicule(numero = 2, couleur = "black")
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
            Vehicule(numero = 3, couleur = "green"),
            Vehicule(numero = 4, couleur = "yellow")
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
            Vehicule(numero = 6, couleur = "purple")
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
    val fooEmployee = Employee(
        id = 4,
        firstName = "Carla",
        lastName = "Coe",
        birthDate = date2,
        age = howOldAreYou(date2),
        salary = randomSalaryGenerator(),
        vehicules = mutableListOf(
            Vehicule(numero = 7, couleur = "white"),
            Vehicule(numero = 8, couleur = "black")
        ),
        diplome = "1",
        statutCadre = false,
        fonction = "fonction1"
    )
    println(fooEmployee)

}