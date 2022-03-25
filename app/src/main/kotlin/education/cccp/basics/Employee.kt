package education.cccp.basics

import java.time.LocalDate


// (fonction String, diplôme String, statutcadre boolen)

data class Employee(
    val fonction: String,
    val diplome: String,
    val statutCadre: Boolean,
    override val id: Int,
    override val lastName: String,
    override val firstName: String,
    override val birthDate: LocalDate,
    override val age: Int,
    override val salary: Double,
    override val vehicules: MutableList<Vehicule>
) : Person(id, lastName, firstName, birthDate)
