package com.anabell

class PiramidaTerbalik(height: Int = 8) : Bintang(height) {

    override fun drawStar(){
        println("===========================")
        println(" Piramida Terbalik Bintang")
        println("===========================")

        for (i in height.downTo(1)){
            for (j in (height - i).downTo(1)){
                print(" ")
            }
            for (j in (i * 2 - 1).downTo(1)){
                print("*")
            }
            println("")
        }
    }
}