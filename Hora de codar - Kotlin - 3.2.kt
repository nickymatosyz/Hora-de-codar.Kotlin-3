//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    print("Escreva um valor: ")
    var valor1 = readln().toInt()

    print("Escreva um outro valor: ")
    var valor2 = readln().toInt()

    while (valor2 <= 0) {
        println("Escreva outro valor: ")
        valor2 = readln().toInt() }

    var resultado = valor1 / valor2
    print("O resultado é: $resultado")
