package demo

fun main() {
    greeting = "why??"

//    val greetingToPrint = if(greeting != null) greeting else "HI"
    val greetingToPrint =when(greeting){
        null -> "hi"
        else -> greeting
    }

    when (greeting) {
        null -> println("hi")
        else -> println(greeting)
    }
    println(greetingToPrint)
    println(name)
}