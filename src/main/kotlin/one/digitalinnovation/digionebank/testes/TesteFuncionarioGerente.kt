package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Gerente


fun main() {
    val maria = Gerente("Maria Do Carmo", "123.123.123-23",5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}

