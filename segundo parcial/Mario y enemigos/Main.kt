fun main(){
            var mario= Mario()
       //     mario.collision("pipe")
         for(i in 1..6 ){
             mario.collision("Gomba")
             println("Te quedan ${mario.vidas}")
         }
        }