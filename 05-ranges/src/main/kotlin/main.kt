fun main() {
    //if
    //nota >=7 && nota<=12
    val nota = 12
    if (nota in 7..11){
       // println("Recurso")
    }else{
       // println("Outro")
    }

    //for
    //1 ate 100
    for (i in 1..100){
        //println(i)
    }
    println("******")
    //100 ate 1
    for (i in 100 downTo 1){
        //println(i)
    }

    // 1 ate 100 pulando 2 casas
    for (i in 1..100 step 2){
       //println(i)
    }

    // 100 ate 1 pulando 2 casas
    for (i in 100 downTo 1 step 2){
        println(i)
    }
}