/*fun main(args: Array<String>) {
    println("Hello World!")

    val myphone = Phone()
    myphone.getTurn()
    myphone.turnOn()
    myphone.getTurn()

    /*val vehiculo = Vehiculo()
    vehiculo.color = "Verde"
    vehiculo.marca = "Ford"
    vehiculo.modelo = "Focus"
    vehiculo.placas = "RSDFSDA"

    println("el carro esta: ${vehiculo.encendido} " )
    vehiculo.encender()
    println("El carro esta encendido: ${vehiculo.encendido}")
    println("el carro tiene gasolina: ${vehiculo.gasolina} " )
    vehiculo.recargar(20.07f)
    println("El carro tiene gasolina: ${vehiculo.gasolina}")
*/
    val miVehiculo = Vehiculo ("Volkwagen", "67", "Blanco", "AF7845")
    println("el carro es de la marca: ${miVehiculo.marca} " )

    val Per = Persona ("Simon", "Bolivar", "Masculino", 1.78f)
}*/


        fun main(){
            var mario= Mario()
       //     mario.collision("pipe")
         for(i in 1..6 ){
             mario.collision("Gomba")
             println("Te quedan ${mario.vidas}")
         }
        }