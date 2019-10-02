package io.github.wotjd243.kotlinpractice.dsl

class Resume(val person: Person, val skills: List<Skill>, val languages: List<Language>)

class Person(val name: String, val company: String? = null)

sealed class Skill

data class Hard(val name: String) : Skill()

data class Soft(val name: String) : Skill()

data class Language(val name: String, val proficiency: Proficiency)

enum class Proficiency(val level: Int) {
    ELEMENTARY(1),
    LIMITED(2),
    PROFESSIONAL(3),
    FULL_PROFESSIONAL(4),
    NATIVE(5);

    companion object {
        private val map = values().associateBy(Proficiency::level)

        fun from(level: Int): Proficiency {
            return map[level] ?: throw IllegalArgumentException()
        }
    }
}