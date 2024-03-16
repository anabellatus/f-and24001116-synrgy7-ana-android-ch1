package com.anabell

class XBintang (height: Int = 16):Bintang(height){

    private val mid = height - 1

    override fun drawStar(){
        println("=======================")
        println("      X Bintang")
        println("=======================")

        for (i in 1..mid) {
            for (j in 1..mid) {
                if (i == j || j == (mid - i + 1)) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }
}