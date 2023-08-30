package com.example.ind10mod5

class FoldablePhone(isScreenLihgtOn: Boolean = false) : Phone(isScreenLihgtOn) {
    //Una propiedad que indique si el teléfono está plegado
    var isFoldable: Boolean = false

    //Un comportamiento de función switchOn() diferente del de la clase Phone para
    override fun switchOn (){
        if (!isFoldable) {
            isScreenLihgtOn=true
        }
    }
    //Métodos para cambiar el estado de plegado
    fun abrir (){
        isFoldable=true
    }
    
    fun cerrar (){
        isFoldable=false
    }
}

