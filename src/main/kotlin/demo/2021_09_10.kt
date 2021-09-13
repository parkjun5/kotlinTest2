package demo

fun sayHellos (greeting: String, vararg itemToGreet: String) {
    itemToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name:String = "JAVA?")  = println("$greeting $name")

fun main() {
//
//    sayHellos("Hello", "Kotlin", "Programing", "Code")
    val goodStuff = arrayOf("Kotlin", "Programming", "Code")
//    sayHellos("Hello", *goodStuff)

//    greetPerson( "hi","kotlin",)
//    greetPerson( name="kotlin",greeting="hi",)
//    greetPerson()
//
//

    val classLearn = ClassLearn()
    classLearn.nickname
//    println(classLearn.firstName)
//    println(classLearn.lastName)
//    classLearn.nickname ="Shade"
//    classLearn.nickname ="new NickName"
//    println(classLearn.nickname)
    classLearn.printInfo()
}