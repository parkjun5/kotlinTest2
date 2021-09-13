package demo.Collections

fun main(args: Array<String>) {
    val presidents = arrayOf(Pair("Peter", "Parker"), Pair("James", "Rolents"))


    presidents.forEach { println("${it.first} / ${it.second}") }

    val numbers = charArrayOf('a','c','e', 'r', 'd')

    numbers.forEach { println(it) }

}