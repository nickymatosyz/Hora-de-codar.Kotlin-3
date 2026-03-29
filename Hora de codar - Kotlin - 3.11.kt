import kotlin.concurrent.thread

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    print("Digite o número que deseja: ")
    var tabuada = readln().toInt()

   for (i in 1..tabuada)
   { println("Tabuada atual: $i")

   for (j in 1..10){
       println("${i} x ${j} = ${j*i}")

   Thread.sleep(500)}
   }
}