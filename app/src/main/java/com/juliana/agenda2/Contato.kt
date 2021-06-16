package com.juliana.agenda2

open class Contato (open val nome: String,
                    open var celular: String){

    open fun exibir(): String {
        return " $nome - $celular \n"
    }
}