package one.digitalinnovation.digiobank

class Pessoa {
    var nome: String = "Luis"

    var cpf: String = "433.455.677-66"
    private set
    }

fun main() {
    val Luis = Pessoa()

    println(Luis.nome)
    println(Luis.cpf)


}