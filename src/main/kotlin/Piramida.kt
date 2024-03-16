package com.anabell

class Piramida(height: Int = 8) : Bintang(height){

    override fun drawStar(){
        println("=======================")
        println("    Piramida Bintang")
        println("=======================")

        for (i in 1..height){
            for (j in 1..(height - i)){
                print(" ")
            }
            for (j in 1..<i * 2){
                print("*")
            }
            println("")
        }
    }
}