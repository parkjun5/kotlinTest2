
package demo

import java.util.*

interface IdProvider2 {
    fun getId(): String

}

enum class EntityType2 {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() =  name.lowercase().replaceFirstChar { char -> char.uppercase() }
}

object EntityFactory2 {
    fun create(type: EntityType2) : Entity2 {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType2.EASY -> type.getFormattedName()
            EntityType2.MEDIUM -> type.getFormattedName()
            EntityType2.HARD ->"Hard"
            EntityType2.HELP -> type.getFormattedName()
        }
        return when(type) {
            EntityType2.EASY -> Entity2.Easy(id, name)
            EntityType2.MEDIUM -> Entity2.Medium(id, name)
            EntityType2.HARD ->   Entity2.Hard(id, name,2f)
            EntityType2.HELP -> Entity2.Help
        }
    }
}

sealed class Entity2 () {
    object Help : Entity2() {
        val name = "Help"
    }

    data class Easy(val id: String, val name: String ): Entity2()
    data class Medium(val id: String, val name: String ): Entity2()
    data class Hard(val id: String, val name: String, val  multiplier: Float): Entity2()
}


fun main() {
    val entity = EntityFactory2.create(EntityType2.EASY)

    println(entity)

    val mediumEntity = EntityFactory2.create(EntityType2.MEDIUM)

    println(mediumEntity)
    val hEntity = EntityFactory2.create(EntityType2.HELP)
    println(hEntity)
}