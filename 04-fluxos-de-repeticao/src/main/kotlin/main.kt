fun main() {
    //for
    for (i in 1..10) {
        println("Kotlin")
    }

    var soma = 0
    for (i in 1..10) {
        soma += i // soma = soma + i
        println(i)
        println(soma)
    }

    print("Soma: ")
    println(soma)

    //while
    var i = 1
    while (i <= 10) {
        println("Kotlin")
        i += 1
    }

    //do while
    var y = 11
    do {
        println("Kotlin 1")
        y += 1
    } while (y <= 10)
}