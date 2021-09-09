package demo

fun sayHello(greeting: String, itemToGreets: List<String>)  {
    itemToGreets.forEach { itemGreet ->
        println("$greeting! $itemGreet")
    }
}

fun sayHI(greeting: String, itemArr: Array<String>)  {
    itemArr.forEach { item ->
        println("$greeting! $item")
    }
}


fun main() {
    val interestingThings = arrayOf("Kotlin", "Programing", "Game")
//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(0))

    sayHI("HI", interestingThings)

    val goodThings = mutableListOf("Kotlin", "List", "Next Is Maybe Map")
    goodThings.add("CATS")
    sayHello("Hello", goodThings)


//    interestingThings.forEach { interestingThing ->
//        println(interestingThing)
//    }
//
//    interestingThings.forEach {
//        println(it)
//    }

//    interestingThings.forEachIndexed { index, interestingThing ->
//        println("$interestingThing is at index $index")
//    }
//
//
//    val goodThings = mutableListOf("Kotlin", "List", "Next Is Maybe Map")
//    goodThings.add("CATS")
//
//
//    goodThings.forEach { goodThing ->
//        println(goodThing)
//    }
//
//
//    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
//    map.put(4, "d")
//
//    map.forEach { (key, value) -> println("$key -> $value")  }

}