package io.github.wotjd243.kotlinpractice.dsl;

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResumeKtTest {
    @Test
    internal fun homemade() {
        val resume = Resume(
                person = Person(name = "박재성", company = "우아한형제들"),
                skills = listOf(
                        Soft("A passion for problem solving"),
                        Soft("Good communication skills"),
                        Hard("Kotlin")
                ),
                languages = listOf(
                        Language(name = "Korean", proficiency = Proficiency.NATIVE),
                        Language(name = "English", proficiency = Proficiency.PROFESSIONAL)
                )
        )
        assertThat(resume.person.name).isEqualTo("박재성")
        assertThat(resume.person.company).isEqualTo("우아한형제들")
        assertThat(resume.skills).contains(Soft("A passion for problem solving"))
        assertThat(resume.skills).contains(Soft("Good communication skills"))
        assertThat(resume.skills).contains(Hard("Kotlin"))
        assertThat(resume.languages).contains(Language(name = "Korean", proficiency = Proficiency.NATIVE))
        assertThat(resume.languages).contains(Language(name = "English", proficiency = Proficiency.PROFESSIONAL))
    }
}