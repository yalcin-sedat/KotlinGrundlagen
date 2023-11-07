package kotlingrundlagen_1

fun main() {
    println("Funktion Main")

    var ergebnis= multiplizieren(addieren(3,6),6)
    println(ergebnis.toString())
}
    fun addieren(a:Int ,b:Int):Int{
        return a+b
    }
    fun multiplizieren(a:Int ,b:Int):Int{
        return a*b
    }
