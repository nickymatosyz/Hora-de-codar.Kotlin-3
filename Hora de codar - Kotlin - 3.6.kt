//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
var aprovados = 0
var reprovados = 0

fun main() {

    print("Digite sua primeira nota: ")
    var nota1 = readln().toDouble()

    print("Digite sua segunda nota: ")
    var nota2 = readln().toDouble()

    var media = (nota1 + nota2) /2


    if (media >= 9.5)
    {print("Este aluno foi aprovado: ")
    aprovados += 1}

    else { print("Este aluno foi reprovado.")
    reprovados += 1}

    println("Deseja calcular a média de outro aluno? \n 1. sim \n 2. não \n")
    var opcao = readln().toInt()

    if (opcao == 1){
        main()
    }

    else { print("A quantidade de alunos aprovados é: $aprovados \n A quantidade de alunos reprovados é: $reprovados" )}
}