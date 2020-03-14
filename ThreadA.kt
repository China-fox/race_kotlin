package race

class ThreadA: Thread() {
    override fun run() {
        for (i in 1..100) {
            println("Первый поток - $i")
        }
    }
}
