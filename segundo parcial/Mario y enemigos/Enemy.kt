open class Enemy(val name: String,val strength: Int) {
protected var direction: String="LEFT"
    protected  fun changeDirection(){
        direction= if (direction=="RIGTH") "LEFT" else "RIGHT"
        println("$name va en direccion $direction")
    }
    protected fun die(){
        println("$name ha muerto y tenia familiawe")
            }
 open   fun collision(collider: String){ //decidir qué acción ejecutar dependiendo del objeto con que se ccolisiona
        when(collider) {
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }
}