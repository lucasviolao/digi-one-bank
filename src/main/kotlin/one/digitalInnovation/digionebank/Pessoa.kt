package one.digitalInnovation.digionebank

class Pessoa {
    var nome: String = "Lucas"
    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val lucas = Pessoa()
    println(lucas.pessoaInfo())
}