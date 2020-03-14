package kot

import race.MyThread

@Volatile var winner: String = ""

fun main() {

    val threadA = MyThread("Первый")
    val threadB = MyThread("Второй")
  //  val threadC = MyThread("Третий")
    threadA.join()
    threadB.join()
  //  threadC.join()
    println("Победитель - $winner")

}

fun whoWinner(name: String){
    if (winner.isEmpty()) {
        winner = name
    }
}
