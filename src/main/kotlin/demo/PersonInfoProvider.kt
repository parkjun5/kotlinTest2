package demo

interface PersonInfoProvider {
    val providerInfo : String
    fun printInfo(classLearn: ClassLearn) {
        println(providerInfo)
        classLearn.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId() :String
}


open class BasicInfoProvider :PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionIdPreFix = "Session"

    override fun getSessionId(): String {
        println("Your Session Id is $sessionIdPreFix")
        return sessionIdPreFix
    }
    override fun printInfo(classLearn: ClassLearn) {
        super.printInfo(classLearn)
        println("additional print statement")
    }
}


fun main() {
//    val provider = FancyInfoProvider()
    val provider = object : PersonInfoProvider{
        override val providerInfo: String
            get() = "new INfo Provider"

        fun getSessionId() = "id"
    }

    provider.printInfo(ClassLearn())
    provider.getSessionId()

    checkType(provider)
}


fun checkType(infoProvider: PersonInfoProvider) {
    if(infoProvider !is SessionInfoProvider) {
        println("not a session info provider")
    } else {
        println("is a session info provider")
//        (infoProvider as SessionInfoProvider).getSessionId()
        infoProvider.getSessionId()
    }
}




