package demo

class ClassLearn( val firstName: String = "Peter" , val lastName: String = "Parker") {

//    init {
//        println("init 1")
//    }
//
//    constructor(): this("Peter", "Parker") {
//        println("secondary Constructor")
//    }
//
//
//    init {
//        println("init 2")
//    }

    var nickname: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }


    fun printInfo() {
        val nickNameToPrint = nickname ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}