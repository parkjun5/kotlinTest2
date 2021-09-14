package demo.functions

fun main(Args: Array<String>) {
    var superman = Superman() with {
        name = "Lux Luthor"
        punch()
        kick()
        sidekick = Spiderman() with {
            special()
        }
    }
}

infix fun <T> T.with(operation : T.() -> Unit ) : T {
    operation()
    return this
}


class Superman(){
    var name : String = "Clark Kent"
    var sidekick : SideKick = Robin()


    fun punch() : Unit = println("$name's punched")
    fun kick() : Unit = println("$name's kicked")
    fun fly() : Unit = println("$name's flew")

}
class Spiderman() : SideKick {
    val name : String = "Peter Parker"
    override fun special() {
        println("$name is funny")
    }
}

interface SideKick {
    public fun special()
}

class Robin(): SideKick {
    var name: String = "Robin"
    override fun special() {
        println("$name is useless?? but Why")
    }
}