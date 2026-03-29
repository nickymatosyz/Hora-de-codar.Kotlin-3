//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var contador = 15
    var soma = 0
    var n = 0

    while (contador <= 100)
    { soma+= contador
        contador++
        n++ }

    var media = soma / n

    print("O resultado da média aritmética é: $media")
}