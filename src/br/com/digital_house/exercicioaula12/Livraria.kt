package br.com.digital_house.exercicioaula12

class Livraria {
    var estoqueLivro = mutableListOf<Livro>()
    var estoqueColecoes = mutableListOf<Colecoes>()

    fun cadastrarLivro(livro: Livro)()
    {
        estoqueLivro.add(livro)
    }

    fun cadastrarCoecao(colecao: Colecao){
    estoqueColecoes.add(colecao)

    }

    fun consultarLivro(codigo: Int) :String {
        estoqueLivro.forEach{if (it.codigo == codigo) return it.titulo
        }
        estoqueColecoes.forEach{it.forEach { it.codigo == codigo) return it.titulo }
        }
        return "Titulo não encontrado"
    }

}