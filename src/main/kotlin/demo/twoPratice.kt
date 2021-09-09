package demo

fun getGreeting() = "hello Kotlin"

fun sayHello() {
    println(getGreeting())
}

fun main() {
    println("hello world")

    println(getGreeting())

    sayHello()
}