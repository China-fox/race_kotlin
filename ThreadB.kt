package race

class ThreadB: Thread() {
    override fun run() {
        for (i in 1..100) {
            println("Второй поток - $i")
        }
    }
}
