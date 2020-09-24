package br.com.digital_house.exercicioaula12

class Colecao {
    val listaLivros: MutableList<Livro>
    var codigo: String
    var preco: Double
    var descricao: String

    constructor(listaLivros: MutableList<Livro>, codigo: String, preco: Double, descricao: String) {
        this.listaLivros = listaLivros
        this.codigo = codigo
        this.preco = preco
        this.descricao = descricao
    }


    override fun toString(): String {
        return "Colecao(listaLivros=$listaLivros, codigo='$codigo', preco=$preco, descricao='$descricao')"
    }

}