package one.digitalinnovation.digionebank

import one.digitalinnovation.digiobank.Pessoa

class Cliente(
    nome: String,
    cpf: String,
    val ClienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome:        $nome
        cpf:         $cpf
        Tipo:        ${ClienteTipo.descricao}
    """.trimIndent()


}