package education.cccp.basics

import java.time.LocalDate

open class Person(
    open val id: Int,
    open val lastName: String,
    open val firstName: String,
    open val birthDate: LocalDate,
    val age: Int = 0,
    val salary: Double = 0.0,
    val vehicules: List<Vehicule> = mutableListOf()
)