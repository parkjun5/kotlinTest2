package demo.functions

fun main() {
    var typeA = configurator {
        this.canFight()
        this.canFly()
    }

    typeA.show()

    var typeB = configurator {
        canSwim()
        canFly()
    }

    typeB.show()
    var typeC = configurator("Max") {
        canSwim()
    }

    typeC.show()
}




fun configurator(config: Roboto.() -> Unit) :Roboto {
    var r = Roboto()
    println("위에는 초기화" )
    r.show()

    r.config()
    println("받아온 모든 function 을 진행")
    r.show()
    println("초기화와 내부 코드를 쓰는거 차이 ")
    return r
}

fun configurator(name : String = "Jun", config : Roboto.() -> Unit): Roboto {
    var r = Roboto()
    r.giveName(name)
    r.config()
    return r

}

class Roboto {
    var capabilities = ""
    var name = ""

    fun giveName(name: String) {
        this.name = name
    }

    fun canSwim() {
        capabilities += "Now Can Swim \n"
    }

    fun canFight() {
        capabilities += "Now Can Fight \n"
    }

    fun canFly() {
        capabilities += "Now Can Fly \n"
    }

    fun show() {
        if ( name != "")
            println("$name can $capabilities")
        else
            println("nobody can $capabilities")
    }
}
