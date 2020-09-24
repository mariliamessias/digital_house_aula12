package br.com.digital_house.exercicioaula12

fun main() {
    val livraria1 = Livraria()
    val livro9 = Livro("L9","Kotlin","Vitoria e João",2020,42,9.000)
    val colecao3 = Colecao(mutableListOf<Livro>(livro9),"C3",5.00,"Colecao Digital House só Kotlin")
    livraria1.cadastrarLivro(livro9)
    println(livraria1.consultarLivro(livro9.codigo))
    println(livraria1.efetuarVenda(livro9.codigo))
    println(livraria1.consultarLivro(livro9.codigo))
    println(livraria1.consultarLivro("L1"))
    println(livraria1.consultarLivro("C1"))
    println(livraria1.efetuarVenda("C1"))
    println(livraria1.consultarLivro("C1"))
    println(livraria1.consultarLivro("C2"))
    livraria1.cadastrarColecao(colecao3)
    println(livraria1.consultarLivro("C3"))
    println(livraria1.efetuarVenda("C3"))
    println(livraria1.consultarLivro("C3"))

}