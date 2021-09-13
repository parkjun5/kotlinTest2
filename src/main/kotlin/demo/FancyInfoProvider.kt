package demo

class FancyInfoProvider : BasicInfoProvider() {

    override val providerInfo: String
        get() = "Fancy Info Provider"

    override val sessionIdPreFix: String
        get() = "Fancy Session"

    override fun printInfo(classLearn: ClassLearn) {
        super.printInfo(classLearn)
        println("Fancy Info")
    }
}