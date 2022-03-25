package education.cccp.basics

import java.time.LocalDate

data class Person(
    val id: Int,
    val lastName: String,
    val firstName: String,
    val birthDate: LocalDate,
    val age: Int = 0,
    val salary: Double = 0.0,
    val vehicules: List<Vehicule> = mutableListOf()
)