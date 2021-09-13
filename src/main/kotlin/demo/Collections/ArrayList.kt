package demo.Collections


fun main(args: Array<String>) {
    val list = arrayListOf(1, 2, 3)
    list.forEach {print("[ $it ]")}


    val list2 = arrayListOf(Pair("HI", "Kotlin"),
                            Pair("Hello", "Java"),
                            Pair("Halo", "Python"))
    list2.add(Pair("bye", "C"))
    list2.forEach { println("$it") }
    list2.forEach { println("${it.first} - ${it.second}") }
}