package kotlingrundlagen_1

fun main(){
    //Vergleichs Operatoren (==,!= , < , > ,>= , >= )
    var isEqual = 5==3
    println("isEqual ist = "+isEqual)

    var isEqual2 = 5==5
    var isEqual3 = 5!=5
    println("isEqual ist : $isEqual2")
    println("isEqual3 ist : $isEqual3")
    println("6 ist klein als 9 --> true or false :  ${9>6}")
    println("8 ist klein als 5 --> true or false :  ${5>8}")
    println("5 kleier oder gleich als 5 --> true or false :  ${5>=5}")

    //---------------------------------
    var myNummer =6

    println("$myNummer + 4 = ${myNummer+4}")

    println("$myNummer - 4 = ${myNummer-4}")

    println("$myNummer * 2  = ${myNummer*2}")

    println("$myNummer / 4 =  ${myNummer/4} ")

    println("$myNummer + 1 =  ${++myNummer} ")

    /*
   isEqual ist = false
   isEqual ist : true
   isEqual3 ist : false
   6 ist klein als 9 --> true or false :  true
   8 ist klein als 5 --> true or false :  false
   5 kleiner oder gleich als 5 --> true or false :  true
   6 + 4 = 10
   6 - 4 = 2
   6 * 2  = 12
   6 / 4 =  1
   6 + 1 =  7
   */


}