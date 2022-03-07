package com.example.hometask

class Lists {
}

fun main() {
    //Crie uma lista de inteiros.
    var listaDeInteiros: MutableList<Int> = mutableListOf()
    //Escreva na lista os números de 1 a 99 utilizando o comando for
    for (i in 1 until 100) {
        listaDeInteiros.add(i)
       // println(listaDeInteiros)//pra testar
    }
    // Utilizando a lista anterior, faça:
    //Crie uma variável do tipo inteiro de nome soma e inicialize ela com o valor 0
    var soma: Int = 0

    //Crie um código que percorre a lista que criamos anteriormente e
    //que a cada interação, acrescente o valor da posição atual a variável soma
var i = 0
    while (i < listaDeInteiros.size){
        soma += listaDeInteiros[i]
        i++

        println(soma)
    }

    }







