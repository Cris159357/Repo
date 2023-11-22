class Mario(var vidas: Int=3) {
    init {
        println("Its a me Mario moafoka")
    }
    private var state ="small"
        set(value) {
            field = value
        }
        get()=field
    private var lives=3
    private fun die(){
        lives--
        println("Has perdido una vida que noob")
    }
    fun getLives(): Int {
        return vidas
    }

    public fun collision(collisionObj: String){
        when(collisionObj){
            "Goomba"-> die()
            "super mushroom"-> state="Super mario"
            "Fire flower"-> state= "Fire mario"
            else-> println("Objeto desconocido ¡no pasa nada!")

        }

    }

}