fun main(){
    val l1=2f
    val l2=3f
    val l3=8f
    if(l1 == l2 && l2==l3){
        println("Son equilateros")
    }
    else if(l1==l2 || l2==l3 || l3==l1){
        println("Son isoceles")
    }
    else {
        println("Son escaleno")
    }
  
    }