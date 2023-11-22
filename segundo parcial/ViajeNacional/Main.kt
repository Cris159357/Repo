

    val viajeMonterrey=National("Monterrey")
    viajeMonterrey.quotePrice(2)
    viajeMonterrey.reserve(2)*/
    //lambda
    val saverGrade: (Double,Double) -> String = {expected: Double, saved: Double->
        val percentage = saved / expected
        when{
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "aprendiz saver"
        }
    }
    println(saverGrade(120.00,130.00))
    //anonima
    val saverGrade2 =fun(expected: Double,saved: Double): String {
        val percentage = saved / expected

        return when {
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "aprendiz saver"
        }
    }
    println(saverGrade(12.0,13.0))

    println(saverGrade(18.0,19.0))
}

    fun calculadora (a: Int, b: Int, operacion :(Int, Int) -> Int): Int{
        return operacion (a,b)
    }
    fun suma (a:Int, b:Int)= a+b
    fun resta(a:Int, b:Int)= a-b
    fun multiplicar(a:Int, b:Int) = a*b
    fun dividir(a:Int, b:Int) =a/b
    println(calculadora(5,4, ::suma))
    println(calculadora(5,4, ::resta))
    println(calculadora(5,4, ::multiplicar))
    println(calculadora(5,4, ::dividir))
}
    fun main() {
        val salvePrecio: (Double, String) -> Double = { precio, cupon ->
            val precioConIVA = (precio * .16)+precio
            when (cupon) {
                "noiva" -> precio
                "halfiva" -> (precio * .08)+precio
                "minus100" -> precio - 100.0
                "promo2020" -> {
                    val impuestos = when {
                        precio in 0.0..1000.0 -> (precio * 0.12)+precio
                        precio in 1000.0..2000.0 -> (precio * 0.04)+precio
                        precio in 2000.0..4000.0 -> (precio * .16)+precio
                        precio > 4000.0 -> precio * 2.0 / 3.0
                        else -> 0.0
                    }
                   impuestos
                }
                else -> precioConIVA
            }
        }

        val total = salvePrecio(20.0, "promo2020")
        println("Total a pagar: $$total")
    }

