package demo.functions

fun main(Args : Array<String>) {
    var number = 0

    fun incrementAndShow() {
        number++
        println(number)
    }
    for(x in 1..3)
        incrementAndShow()
}
