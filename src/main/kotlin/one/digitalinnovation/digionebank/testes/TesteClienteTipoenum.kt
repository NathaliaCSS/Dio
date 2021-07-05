package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach{ elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }


    ClienteTipo.values().forEach{
        println("${it.name} - ${it.descricao}")
    }

    val PF = ClienteTipo.PF
    println(">> ${PF.name} - ${PF.descricao}")

    val PJ = ClienteTipo.PJ
    println(">> ${PJ.name} - ${PJ.descricao}")

}
