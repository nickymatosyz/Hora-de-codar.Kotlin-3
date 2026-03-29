import kotlin.concurrent.thread

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    for (i in 10 downTo 1){
        println(i)
        Thread.sleep(500)
    }
}