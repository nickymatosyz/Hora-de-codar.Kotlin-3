//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var contador = 0
    var soma = 0.0

    while (contador < 6){
        print("Digite a sua nota: ")
        var nota = readln().toDouble()

        if (nota > 0 && nota < 10)
        { soma += nota
            println("Nota válida!")
        contador++ }

        else { println("Insira uma nota válida!")}
    }

    println("A média é: ${soma/6}")

}