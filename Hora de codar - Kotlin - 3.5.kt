//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros
// informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro
// sempre será menor que o segundo.


    print("Informe um número inteiro: ")
    var valor1 = readln().toInt()

    print("Informe outro número inteiro: ")
    var valor2 = readln().toInt()

    while ( valor1 > valor2) {
        println("Digite outro número: ")
        valor2 = readln().toInt() }

    var soma = 0
    var contador = 0
    for (valor3 in valor1 .. valor2)
    { soma = soma + valor3
    contador += 1}

    var media = soma / contador
    print("A média dos números são: $media")



}