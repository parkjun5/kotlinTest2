//package demo
//
//interface IdProvider {
//    fun getId(): String
//}
//
//
//
//class Entity private constructor(val id: String) {
//
//    companion object Factory: IdProvider {
//
//        override fun getId(): String {
//            return "parkjun5"
//        }
//
//        const val id = "123"
//
//        fun create() = Entity(getId())
//    }
//}
//
//
//fun main() {
//   val entity = Entity.Factory.create()
//
//    println(entity.id)
//    println(Entity.id)
//}


package demo

import java.util.*

interface IdProvider {
    fun getId(): String

}

enum class EntityType {
    EASY, MEDIUM, HARD;

    fun getFormattedName() =  name.lowercase().replaceFirstChar { char -> char.uppercase() }
}

object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.getFormattedName()
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD ->"Hard"
        }
        return Entity(id, name)
    }
}

class Entity (val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}


fun main() {
    val entity = EntityFactory.create(EntityType.EASY)

    println(entity)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)

    println(mediumEntity)
}