//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val del15Al35 = 15..35
    for (i in del15Al35.step(5)) {
        println(i)
    }

    println()

    for (i in 10 downTo 1) {
        println(i)
    }

    println()

    var suma = 0
    var vueltas = 0
    // Bucle while que suma 7 a la variable "suma" hasta que sea mayor que 50, y cuenta las vueltas
    while (suma <= 50) {
        suma += 7
        vueltas++
    }
    println("Suma: $suma, Vueltas: $vueltas")
}