fun contarRepeticiones(nombre: String, listaNombres: List<String>): Int {
    var contador = 0
    for (nombreEnLista in listaNombres) {
        if (nombreEnLista.equals(nombre, ignoreCase = true)) {
            contador++
        }
    }
    return contador
}

fun main() {
    val nombres = listOf(
        "Pedro", "Luis", "Juan Manuel", "Juan Luis", "Maria Ines", "Romeo",
        "Ernesto", "Juan Pedro", "Ariadna", "Mireya Maria", "Ana", "Jose Juan"
    )

    val nombreBuscar = "Ana"
    val repeticiones = contarRepeticiones(nombreBuscar, nombres)

    println("El nombre '$nombreBuscar' se repite $repeticiones veces en la lista.")
}
