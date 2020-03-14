package kot

import race.ThreadA
import race.ThreadB

fun main() {
    val threadA = ThreadA()
    val threadB = ThreadB()
    println("Гонка началась!")

    threadA.start()
    threadB.start()

    threadA.join()
    if (threadB.isAlive)
    {
        println("Первый выиграл")
    } else {
        println("Второй выиграл")
    }
}
