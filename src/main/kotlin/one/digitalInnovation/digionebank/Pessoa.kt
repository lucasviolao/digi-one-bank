package one.digitalInnovation.digionebank

class Pessoa {
    var nome: String = "Lucas"

    var cpf: String = "123.123.123-11"
    private set
}

fun main() {
    val lucas = Pessoa()

    println(lucas.nome)
    println(lucas.cpf)
}