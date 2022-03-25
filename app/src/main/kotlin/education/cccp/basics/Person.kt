package education.cccp.basics

import java.time.LocalDate

open class Person(
    open val id: Int,
    open val lastName: String,
    open val firstName: String,
    open val birthDate: LocalDate,
    open val age: Int = 0,
    open val salary: Double = 0.0,
    open val vehicules: List<Vehicule> = mutableListOf()
) {
    override fun toString(): String = buildString {
        append("Person(id=")
        append(id)
        append(", lastName='")
        append(lastName)
        append("', firstName='")
        append(firstName)
        append("', birthDate=")
        append(birthDate)
        append(", age=")
        append(age)
        append(", salary=")
        append(salary)
        append(", vehicules=")
        append(vehicules)
        append(")")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (id != other.id) return false
        if (lastName != other.lastName) return false
        if (firstName != other.firstName) return false
        if (birthDate != other.birthDate) return false
        if (age != other.age) return false
        if (salary != other.salary) return false
        if (vehicules != other.vehicules) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + lastName.hashCode()
        result = 31 * result + firstName.hashCode()
        result = 31 * result + birthDate.hashCode()
        result = 31 * result + age
        result = 31 * result + salary.hashCode()
        result = 31 * result + vehicules.hashCode()
        return result
    }


}