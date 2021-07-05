package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digiobank.Pessoa
import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val Luis = Pessoa(nome = "Luis Ferreira", cpf = "123456788")
    println(Luis.nome)
    println(Luis.cpf)

    val Joao = Funcionario("Luis Ferreira", "123456788", BigDecimal.valueOf(2000))
    println(Joao.nome)
    println(Joao.cpf)
    println(Joao.salario)


}