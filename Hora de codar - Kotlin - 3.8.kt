//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    print("Digite um valor maior que zero: ")
    var valor = readln().toInt()

    while (valor <= 0){
        print("Digite um valor válido: ")
        valor = readln().toInt()}

    var contador = 1

    while (contador<=valor){
        print(contador)
        print(", ")
        contador++
    }

}