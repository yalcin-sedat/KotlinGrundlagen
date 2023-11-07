package kotlingrundlagen_1

fun main(){
    var age =16

    if(age >=18){
        println("Du bist volljährig")
        println("Du darfst alleine Auto fahren")
    } else if (age >= 17 ){
        println("Du bist volljährig")
        println("Du darfst begleitet fahren")
        }
    else if (age >= 16 ){
        println("Du darfst deinen führerschein beginnen")
    } else{
        println("Du bist nicht volljährig")
        println("Du bist zu jung")

        }
    //-----------------------------------------
    val name ="Sedat"
    if (name =="Sedat"){
        println("Hallo Sedat")
    }else
    {
        println("Wer bist du ?")
    }
    //---------When Abfragen------------

    println("-----------When Abfragen ----------------")
    // Kotlin’s "when" Ausdruck ist der Ersatz der Switch-Abfrage
    // aus anderen Sprachen wie C, C++, and Java.
    // Es ist kompakter und leistungsfähiger als ein Switch-Statement.

    println("-----------Jahreszeit ----------------")
    var season =2
    when(season){
        1-> println("Frühling")
        2-> println("Sommer")
        3-> println("Herbst")
        4-> println("Winter")
        else -> println("Ungultige Jahreszeit")
    }
    println("-----------Monath ----------------")

    var month =7
    when(month){
        1,2,3,-> println("Frühling")
        in 4..6-> println("Sommer")
        in 7..9-> println("Herbst")
        in 10..12-> println("Winter")
        else -> println("Ungultige Jahreszeit")
    }

    println("----------------Darf oder darf nicht------------------------")
    when(age){
        !in 0..17 -> println("Du darfst alleine Auto fahren")
        17 -> println("Du darfst begleitet fahren")
        16 -> println("Du darfst deinen  führerschein beginnen")
        else -> println("Du bist zu jung")
    }

    println("------------------find Datatypen-------------------------------------")
    var x: Any =14.46
    when(x){
        is Int -> println("$x ist ein Integer")
        is Double -> println("$x ist ein Double")
        is String -> println("$x ist ein String")
        else -> println("Kein der Datantypen")
    }
}