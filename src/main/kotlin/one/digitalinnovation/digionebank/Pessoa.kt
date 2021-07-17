package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Jether"
    var cpf:String = "123.123.123.12"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}

fun main(){
    val jether = Pessoa()
    //variável recebe a instância da classe pessoa.

    println(jether.pessoaInfo())

}
