package project

import io.github.serpro69.kfaker.Faker
import java.time.LocalDate

object TinyProject {
    private val faker = Faker()
    fun compareDate(): Boolean =
        LocalDate.now() > faker.person.birthDate(3)

    fun outdatedCompareDate(): Boolean =
        faker.person.birthDate(10) > LocalDate.now()
}