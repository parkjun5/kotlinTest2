package demo.functions

fun main() {
    val say = "Hello"  add "world 1" // this is infix Function
    println(say)

    val say2 = "halo".add("world 2")
    println(say2)

    val halo = helloWorld()

    var say3 = halo say "world 3"
    println(say3)

    val say4 = halo.say("world 4")
    println(say4)
}



infix fun String.add(more: String ) :String =  this + more

class helloWorld() {

    val halo = "halo"

    infix fun say(more: String) : String {
        return  "$halo annyeong $more"
    }
}