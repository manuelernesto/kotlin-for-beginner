fun main() {
    ola()
    olaNome("Manuel")
    olaNome("Ernesto")
    val z = soma(2, 4)
    println("Soma =  $z")
    val y = subtracao(3, 2)
    println("Sub $y")

    val k = mult(x= 2, y = 2)
    println("Mult = $k")
}

// funcao simples
fun ola() {
    println("Ola Funcao")
}

// funcao com parametro
fun olaNome(nome: String) {
    println("Ola $nome")
}

// funcao com retorno
fun soma(x: Int, y: Int): Int {
    return x + y
}

// funcao como expressao
fun subtracao(x: Int, y: Int) = x - y

// funcao com argumento padrao
fun mult(x: Int = 10, y: Int) = x * y




