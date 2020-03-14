import kot.whoWinner

class MyThread(val nam: String): Thread() {

    override fun run() {
        for (i in 1..100) {
            writeLog("$nam - $i")
        }
        whoWinner(nam)
    }

    init {
        start()
    }

}
