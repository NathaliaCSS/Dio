package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente


fun main() {
    val Giselle = Gerente("Giselle Jerez", "22133244566", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(Giselle)

    TesteAutenticacao().autentica(Giselle)


}


