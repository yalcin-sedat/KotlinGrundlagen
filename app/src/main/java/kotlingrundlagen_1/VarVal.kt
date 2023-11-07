package kotlingrundlagen_1

fun main(){


    val myName="Sedat"
    var surName="Kaya"

    println("Hallo Welt")

    println("Hallo $myName $surName")

    surName="Yalcin"

    println("Hallo $myName $surName")


    /*
     Val, değeri get edilebilir ancak set edilemez.
     Var, get-set işlemleri yapılabilir.

     Eğer oluşturduğumuz değişken sonradan değişebilecek bir değişken ise başına var ,
     yok bir daha değişmeyecek, başka değer atanamayacak bir değişken ise başına  val keywordu kullanırız diyebiliriz.
     val keywordu javada ki final keywordu gibi çalışmaktadır
     */

    /*TERMINAL
    Hallo Welt
Hallo Sedat Kaya
Hallo Sedat Yalcin
*/

}