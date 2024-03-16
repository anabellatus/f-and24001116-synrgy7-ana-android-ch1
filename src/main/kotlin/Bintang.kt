package com.anabell

open class Bintang(var height: Int) {

    internal open fun drawStar(){
        for (i in 1.. height){
            print("*")
        }
    }
}