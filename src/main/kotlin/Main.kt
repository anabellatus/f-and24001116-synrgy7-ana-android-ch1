package com.anabell

fun main() {

    println("***** Challenge 1 SYNRGY 7 *****\n\t\tAndroid Kotlin")

    showAllShape()
    showMainMenu()

}

private fun showAllShape(){
    val piramida = Piramida()
    piramida.drawStar()

    println("")

    val piramidaTerbalik = PiramidaTerbalik()
    piramidaTerbalik.drawStar()

    println("")

    val layangBintang = LayangBintang()
    layangBintang.drawStar()

    println("")

    val xBintang = XBintang()
    xBintang.drawStar()

    println("")

    val hollow = Hollow()
    hollow.drawStar()

    println()
}

private fun showMainMenu(){
    var ulangiMain = true
    while (ulangiMain){
        print("\n=================================\n" +
                "| \t\t\t Menu \t\t\t\t|\n" +
                "---------------------------------\n" +
                "| 1. Pilih Bentuk               |\n" +
                "| 2. Exit                       |\n" +
                "---------------------------------\n" +
                "Masukkan pilihan menu : ")
        val input : Int? = readLine()?.toIntOrNull()
        when(input){
            1 -> {
                ulangiMain = false
                showShapeMenu()
            }
            2 -> {
                ulangiMain = false
                println("Bye bye\nThank You  ^^")
            }
            else -> {
                println("\nMaaf menu yang diinputkan salah \nsilahkan input lagi")
            }
        }
    }
}

private fun showShapeMenu(){
    var ulangi = true
    while (ulangi){
        print("\n=================================\n" +
                "| \t\t Bentuk Bintang \t\t|\n" +
                "---------------------------------\n" +
                "| 1. Piramida Bintang           |\n" +
                "| 2. Piramida Terbalik Bintang  |\n" +
                "| 3. Layang-layang Bintang      |\n" +
                "| 4. X Bintang                  |\n" +
                "| 5. Piramida Hollow Bintang    |\n" +
                "| 6. Kembali ke menu utama      |\n" +
                "---------------------------------\n" +
                "Masukkan pilihan : ")
        val input : Int? = readLine()?.toIntOrNull()

        var valueHeight:Int

        when(input){
            1 -> {
                valueHeight = inputHeight()
                val piramida = Piramida(valueHeight)
                piramida.drawStar()
            }
            2 -> {
                valueHeight = inputHeight()
                val piramidaTerbalik = PiramidaTerbalik(valueHeight)
                piramidaTerbalik.drawStar()
            }
            3 -> {
                valueHeight = inputHeight()
                val layangBintang = LayangBintang(valueHeight)
                layangBintang.drawStar()
            }
            4 -> {
                valueHeight = inputHeight()
                val xBintang = XBintang(valueHeight)
                xBintang.drawStar()
            }
            5 -> {
                valueHeight = inputHeight()
                val hollow = Hollow(valueHeight)
                hollow.drawStar()
            }
            6 -> {
                ulangi = false
                showMainMenu()
            }
            else -> {
                println("\nMaaf menu yang diinputkan salah \nsilahkan input lagi")
            }
        }
    }
}

private fun inputHeight() : Int{
    print("Masukkan Ketinggian : ")
    val inputHeight = readLine()!!.toInt()
    return inputHeight
}