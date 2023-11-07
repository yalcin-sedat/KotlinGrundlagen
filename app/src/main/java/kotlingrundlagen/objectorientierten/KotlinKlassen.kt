package kotlingrundlagen.objectorientierten

fun main(){

    var person_1= Person("Sedat","Yalcin")
    var person_2= Person("Max","Müller")
    var person_3= Person("John","Week")

}

class Person (firstName:String,lastName:String){

    var firstName:String
    var lastName: String

    init {
        this.firstName=firstName
        this.lastName=lastName
        println(" Person initialisiert mit dem Vornamen : ${this.firstName}" +" und dem Nachdem  " +
                "Nachnamen: ${this.lastName}")
    }
}