
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

    data class Easy(val id: String, val name: String ): Entity2() {
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }

        override fun hashCode(): Int {
            return super.hashCode()
        }
    }

    data class Medium(val id: String, val name: String ): Entity2()
    data class Hard(val id: String, val name: String, val  multiplier: Float): Entity2()
}


fun main() {
    val entity = EntityFactory2.create(EntityType2.HELP)
    val msg = when (entity) {
        Entity2.Help -> "help class"
        is Entity2.Easy -> "easy class"
        is Entity2.Hard -> "hard class"
        is Entity2.Medium -> "medium class"
    }



    println(msg)


//    val entity1 = EntityFactory2.create(EntityType2.EASY);
//    val entity2 = EntityFactory2.create(EntityType2.EASY)

//    val entity1 = Entity2.Easy("id", "name")
//    val entity2 = entity1.copy(name = "new name")
//
//    if( entity1 == entity2) {
//        println("they are equal")
//    }else {
//        println("they are different")
//    }

    val entity1 = Entity2.Easy("id", "name")
    val entity2 = Entity2.Easy("id", "name")

    if( entity1 === entity1) {
        println("they are equal")
    }else {
        println("they are different")
    }



//    println(entity)
//
//    val mediumEntity = EntityFactory2.create(EntityType2.MEDIUM)
//
//    println(mediumEntity)
//    val hEntity = EntityFactory2.create(EntityType2.HELP)
//    println(hEntity)
}