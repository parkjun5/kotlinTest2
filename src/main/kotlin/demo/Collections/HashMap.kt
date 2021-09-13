package demo.Collections

fun main(args: Array<String>) {
    val dict = hashMapOf (
        "adam" to "John",
        "1" to "zero",
        1 to "map"
        )

    println("current location is ${dict[1]}")



    for((key, value) in dict)
        println("key is $key and value is $value")

    for (key in dict.keys)
        println("key -> $key and val -> ${dict[key]}")


    println("now we use dict.entries")

    for (value in dict.entries)
        println("$value => ${value.key} => ${value.value} " )
        println("can this?")
    println("cant this?")

}



//NEXT IS FUNTIONS!