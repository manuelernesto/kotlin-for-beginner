fun main() {

    val liguagens: Array<String> = arrayOf("Kotlin", "Java", "Python")
    val liguagens01 = arrayOf("Kotlin", "Java", "Python")

    for (linguagem in liguagens) {
        println(linguagem)
    }

    val cores = Array(3) { "Azul" }
    cores[1] = "Verde"
    cores[2] = "Preto"

    for (cor in cores) {
        println(cor)
    }


    val idades: IntArray = intArrayOf(18, 20, 22)
    for (idade in idades){
        println(idade)
    }

}