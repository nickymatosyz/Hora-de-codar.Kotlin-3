//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var contador = 0
    var entre = 0
    var fora = 0

    while (contador<10){
        print("Digite o ${contador + 1} número:")
        var numero = readln().toInt()

    if (numero >= 24 && numero <= 42)
    {entre += 1}

        else {fora += 1}

        contador++
    }

    println("Os valores entre 24 e 42 são: $entre")
    println("Os valores que não estão entre 24 e 42 são: $fora")
}