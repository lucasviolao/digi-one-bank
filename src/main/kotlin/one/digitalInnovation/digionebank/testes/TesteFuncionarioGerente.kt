package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Gerente


fun main() {
    val maria = Gerente("Maria Wesley", "1234567899", 5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}
