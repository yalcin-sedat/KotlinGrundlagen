package kotlingrundlagen.objectorientierten

fun main(){
    val x = 10 // Äußere Variable

    fun myFunction() {
        val x = 20 // Innere Variable, die die äußere Variable shadowed
        println(x) // Hier wird die innere Variable verwendet (Wert: 20)
    }

    myFunction()
    println(x) // Hier wird die äußere Variable verwendet (Wert: 10)
}