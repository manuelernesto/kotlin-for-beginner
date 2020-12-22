fun main() {
    //Aritmeticos
    val num1 = 8
    val num2 = 6

    val sum = num1 + num2
    println(sum)

    val sub = num1 - num2
    println(sub)

    val div = num1 / num2.toDouble()
    println(div)

    val mult = num1 * num2
    println(mult)

    //Comparação ou relação
    val comp1 = num1 > num2
    println(comp1)

    val comp2 = num1 < num2
    println(comp2)

    val comp3 = num1 == num2
    println(comp3)

    val comp4 = num1 != num2
    println(comp4)

    val comp5 = num1 >= num2
    println(comp5)

    val comp6 = num1 <= num2
    println(comp6)

    //Operadores lógicos E OU Negacao
    val log1 = num1 > 2 && num2 < 6
    println(log1)
    val log2 = num1 > 2 || num2 < 6
    println(log2)

    val log3 = !(num1 > 2)
    println(log3)
}