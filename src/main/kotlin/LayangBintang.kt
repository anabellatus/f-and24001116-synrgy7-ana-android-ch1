package com.anabell

class LayangBintang(height: Int = 15) :Bintang(height){

    private val middle = height / 2 + 1

    override fun drawStar(){
        println("=======================")
        println(" Layang-layang Bintang")
        println("=======================")

        for (i in 1..middle) {
            for (j in 1..(middle - i)) {
                print(" ")
            }
            for (j in 1..<2 * i) {
                print("*")
            }
            println()
        }

        for (i in middle - 1 downTo 1) {
            for (j in 1..(middle - i)) {
                print(" ")
            }
            for (j in 1..<2 * i) {
                print("*")
            }
            println()
        }
    }
}