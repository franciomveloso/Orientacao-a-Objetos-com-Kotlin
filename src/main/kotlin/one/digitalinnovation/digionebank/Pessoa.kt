package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Jether"
    var cpf:String = "123.123.123.12"
    private set

}

fun main(){
    val jether = Pessoa()
    //variável recebe a instância da classe pessoa.

    println(jether.nome)
    println(jether.cpf)

}
