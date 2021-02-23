package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy("Banco2")

    println(banco2.info())
}