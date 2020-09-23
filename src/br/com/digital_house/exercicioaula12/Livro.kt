package br.com.digital_house.exercicioaula12

class Livro {
    var codigo: String
    var titulo: String
    var autor: String
    var anoLancamento : Int
    var quantidade: Int
    var preco: Double

    constructor(codigo: String, titulo: String, autor: String, anoLancamento: Int, quantidade: Int, preco: Double) {
        this.codigo = codigo
        this.titulo = titulo
        this.autor = autor
        this.anoLancamento = anoLancamento
        this.quantidade = quantidade
        this.preco = preco
    }

    override fun toString(): String {
        return "Livro(codigo='$codigo', titulo='$titulo', autor='$autor', anoLancamento=$anoLancamento, quantidade=$quantidade, preco=$preco)"
    }
}