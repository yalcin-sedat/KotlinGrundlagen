package com.yalcinsedat.activity_1

fun main(){
    //While-Schleife
    println("While-Schleife")
    var x=1
    while (x<=10){
        println("${x++}")
    }
    println("Schleife X beendet")

    var y=100
    while (y>=50){
        println(y)
        y-=5
    }
    println("Schleife Y beendet")


    //Do-Schleife
    println("Do-Schleife")
    var z =100
    do{
    println(z)
        z-=5
    }while (z>=50)

    println("Schleife Z  beendet")

    //----------------------------
    var feltTemp = "kalt"
    var roomTemp = 10
    while (feltTemp == "kalt"){
        roomTemp++
        if(roomTemp == 20){
            feltTemp = "warm"
            println("Jetzt ist es warm genug")
        }

    }

    // For-Schleife

    // Eine For-Schleife wird dazu genutzt, sich innerhalb eines definierten Bereichs, eines Arrays oder einer Sammlung zu wiederholen.

    // Dafür bedarf es einen "iterator", also einen Zeiger (Weiteres zu Iteratoren, Arrays, Bereichen und Sammlungen lernst du in einer zukünftigen Lektion).

    println("For Schleife")
    for(num in 1..10) {

        println("$num ")

    }

    println("--------------------------")

    // Infix-Notation

    for(i in 1 until 10) { // Identisch zu - for(i in 1.until(10))

        println("$i ")

    }

    println("--------------------------")


    for(i in 10 downTo 1) {     // Identisch zu - for(i in 10.downTo(1))

        println("$i ")

    }

    println("--------------------------")

    for(i in 1 until 10 step 2) { // Identisch zu - for(i in 1.until(10).step(2))

        println("$i ")
    }
    println("--------------------------")
/*While-Schleife
1
2
3
4
5
6
7
8
9
10
Schleife X beendet
100
95
90
85
80
75
70
65
60
55
50
Schleife Y beendet
Do-Schleife
100
95
90
85
80
75
70
65
60
55
50
Schleife Z  beendet
Ein Beispiel
Jetzt ist es warm genug*/

}