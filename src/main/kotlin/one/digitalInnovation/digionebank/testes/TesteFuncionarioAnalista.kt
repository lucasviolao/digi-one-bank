package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Analista



fun main() {
    val joao = Analista("Joao Wesley", "1234567899", 1800.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
