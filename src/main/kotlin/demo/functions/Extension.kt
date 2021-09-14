package demo.functions

fun String.glorify() : String {
    println("You are amazing $this" )
    return "hi main";
}

fun String.insults(count: Int) {
    println("${this.glorify()}, you are $count times dumber than a dog")
}

fun main(args: Array<String>) {
    "John".glorify()
    "Not For Me".insults(1)
}