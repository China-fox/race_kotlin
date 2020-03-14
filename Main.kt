package kot

import race.MyThread
import java.util.logging.LogManager
import java.util.logging.Logger

@Volatile var winner: String = ""
private val logger = Logger.getLogger(MyThread::class.java.name)

fun main() {
    LogManager.getLogManager().readConfiguration(
            MyThread::class.java.getResourceAsStream("/logging.properties"))
    val threadA = MyThread("Первый")
    val threadB = MyThread("Второй")
    threadA.join()
    threadB.join()
    writeLog("Победитель - $winner")


}

 fun whoWinner(name: String){
    if (winner.isEmpty()) {
        winner = name
    }
}

fun writeLog(text: String) {
    logger.info(text)
}
