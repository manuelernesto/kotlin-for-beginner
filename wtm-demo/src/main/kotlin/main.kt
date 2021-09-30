fun main() {
    val contaManuel = Conta(0f,"Manuel")
    contaManuel.depositar(200f)
}

class Conta(private var saldo:Float, val name: String){

    fun depositar(valor: Float){
       saldo += valor //saldo = saldo + valor
        println("Deposito de $valor feito com sucesso")
    }
}

