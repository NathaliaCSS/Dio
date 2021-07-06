package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val John = Cliente(
        nome = "John Cordeiro",
        cpf = "321.431.566-88",
        ClienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(John)

    TesteAutenticacao().autentica(John)
}