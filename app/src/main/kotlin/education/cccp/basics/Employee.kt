package education.cccp.basics

import java.time.LocalDate

data class Employee(
    val foo: String,
    override val id: Int,
    override val lastName: String,
    override val firstName: String,
    override val birthDate: LocalDate
):Person(id, lastName, firstName,
    birthDate
)