class Koopa:
      Enemy("Koopa",2){

    override fun collision(collider:String){
    when(collider){
    "Weapon "->{
        var  state="Shell"
        println("El estado es ahora $state")
    }
        "Enemy"->changeDirection()
}
    }
      }
