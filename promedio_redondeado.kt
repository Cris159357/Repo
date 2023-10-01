fun main() {
   
    val c1 = 8
    val c2 = 8
    val c3 = 7

 val pro= (c1 + c2 + c3) / 3.0
 val promedioRedondeado = String.format("%.2f", pro).toDouble()

println("El promedio de las calificaciones es: $promedioRedondeado")
}
