fun main() {
    val x = 5
    val y = 40

    // maior e menor
    if (x > y) {
        print("x é maior que y")
    } else {
        println("x é menor que y")
    }


    //if & else como expressão
    val maximo = if (x > y) x else y
    println(maximo)


    //if & else aninhado
    val media = 6
    if (media >= 12) {
        println("Aprovou")
    } else if (media >= 7 && media < 12) {
        println("Recurso")
    } else {
        println("Reprovado")
    }


    //usando when
    when {
        media >= 12 -> {
            println("Aprovado")
        }
        media >= 7 && media < 12 -> {
            println("Recurso")
        }
        else -> {
            println("Reprovado")
        }
    }

    //when simplificado
    when (media) {
        in 12..20 -> {
            println("Aprovado")
        }
        in 7..12 -> {
            println("Recurso")
        }
        else -> {
            println("Reprovado")
        }
    }

    //when como expressão
    val resultado = when (media) {
        in 12..20 -> {
            "Aprovado"
        }
        in 7..12 -> {
            "Recurso"
        }
        else -> {
            "Reprovado"
        }
    }

    println(resultado)


}