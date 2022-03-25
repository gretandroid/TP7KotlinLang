package education.cccp.basics

import java.time.LocalDate

data class Person(
    val id:Int,
    val lastName:String,
    val firstName: String,
    val birthDate: LocalDate,
    var age:Int?,
    var salary: Double?)