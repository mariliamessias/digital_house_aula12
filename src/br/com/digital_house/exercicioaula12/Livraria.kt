package br.com.digital_house.exercicioaula12

class Livraria {

    var estoqueLivro = mutableListOf<Livro>()
    var estoqueColecoes = mutableListOf<Colecao>()

    init {
        val livro1 = Livro("L1","Harry Potter 1","autora do HP",2001,2,50.00)
        val livro2 = Livro("L2","Harry Potter 2","autora do HP",2002,3,51.00)
        val livro3 = Livro("L3","Harry Potter 3","autora do HP",2003,4,52.00)
        val livro4 = Livro("L4","Harry Potter 4","autora do HP",2004,5,53.00)
        val livro5 = Livro("L5","Senhor dos Anéis 1","autor do SA",2004,5,53.10)
        val livro6 = Livro("L6","Senhor dos Anéis 2","autor do SA",2005,6,53.20)
        val livro7 = Livro("L7","Senhor dos Anéis 3","autor do SA",2006,7,53.30)
        val livro8 = Livro("L8","A Revolta de Atlas","Ayn Rand",1950,8,90.00)
        val listaLivro1 = mutableListOf<Livro>(livro1,livro2,livro3,livro4)
        val listaLivro2 = mutableListOf<Livro>(livro5,livro6,livro7)
        val colecao1 = Colecao(listaLivro1,"C1",200.00,"Coleção Harry Potter")
        val colecao2 = Colecao(listaLivro2,"C2",300.00,"Coleção Senhor dos Anéis")
        estoqueColecoes.addAll(listOf(colecao1,colecao2))
        estoqueLivro.add(livro8)

    }


    fun cadastrarLivro(livro: Livro) {
        estoqueLivro.add(livro)
        println("livro ${livro.titulo} cadastrado com sucesso")
    }

    fun cadastrarColecao(colecao: Colecao) {
        estoqueColecoes.add(colecao)
        println("colecao ${colecao.descricao} cadastrada com sucesso")

    }

    fun consultarLivro(codigo: String): String {
        estoqueLivro.forEach {
            if (it.codigo == codigo) return it.titulo
        }
        estoqueColecoes.forEach {
            it.listaLivros.forEach { livro -> if (livro.codigo == codigo) return livro.titulo }
        }
        estoqueColecoes.forEach {
            if (it.codigo == codigo) return it.descricao
        }
        return "Livro não encontrado"
    }

    fun efetuarVenda(codigo: String): String {
        estoqueLivro.forEach {
            if (it.codigo.equals(codigo)) {
                estoqueLivro.remove(it)
                return "Livro Vendido"
            }
        }
        estoqueColecoes.forEach {
            it.listaLivros.forEach { livro ->
                if (livro.codigo.equals(codigo)) { it.listaLivros.remove(livro)
                return@efetuarVenda "Livro de Coleção Vendido"}
            }
        }
        estoqueColecoes.forEach {
            if (it.codigo.equals(codigo)) {estoqueColecoes.remove(it)
            return "Coleção Vendida"}
        }
        return "Estoque Esgotado"
    }

}