package com.anabell

class Hollow (height: Int = 6):Bintang(height){

    override fun drawStar(){
        println("=======================")
        println("Piramida Hollow Bintang")
        println("=======================")

        for (i in 0 until height) {
            for (j in 0 until 2 * height - 1) {
                if (i == height - 1 || i + j == height - 1 || j - i == height - 1) {
                    print("* ")
                } else {
                    print("  ")
                }
            }
            println()
        }
    }
}