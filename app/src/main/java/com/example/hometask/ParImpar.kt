package com.example.hometask

class ParImpar {
}

fun main(){
    //Crie um condicional que testa se uma variável
    //é par, se for ela de imprimir na tela "O número é
    //par" senão deve imprimir "O número é impar"
    // Teste primeiro utilizando a variável par e verifique o resultado
    // Faço o mesmo teste agora usando a variável impar
    var varPar = 20
    var varImpar = 13

    var parOuImpar1 =varPar % 2
    var parOuImpar2 = varImpar%2

    if(parOuImpar1 ==0){
        println("O número é par")
    }else{
        println("O número é impar")
    }

    if(parOuImpar2 ==0){
        println("O número é par")
    }else{
        println("O número é impar")
    }
    when{
    parOuImpar1==0 -> println("O número é par")
    else -> println("O número é impar")
    }

    when{
        parOuImpar2 ==0 -> println("O número é par")
        else -> println("O número é impar")
    }

}