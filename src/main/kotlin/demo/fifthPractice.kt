package demo

fun main() {
    println(generateAnswerString(3))
    println(stringLengthFunc("JOOO"))

    println(stringMapper("ParkJun") { input ->
        input.length} )
}

fun stringMapper(str:String, mapper: (String) -> Int): Int {
    return mapper(str)
}

val stringLengthFunc: (String) -> Int = {
    input -> input.length
}
val count = 33

fun generateAnswerString(countThreshold: Int): String {
    val answerString = if (count > countThreshold) {
        "I have the answer."
    } else {
        "The answer eludes me."
    }

    return answerString
}


//val answerString = generateAnswerString(3)

