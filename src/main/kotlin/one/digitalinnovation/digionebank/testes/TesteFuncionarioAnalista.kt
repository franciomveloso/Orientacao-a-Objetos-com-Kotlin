package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario


fun main() {
    val joao = Analista("Joao Pedro", "123.123.123-23",2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}

