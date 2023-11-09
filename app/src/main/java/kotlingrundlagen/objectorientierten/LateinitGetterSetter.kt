package kotlingrundlagen.objectorientierten
 class Person_2 {
    lateinit var name: String
    private var age: Int = 0
    // Özel getter ve setter
    var ageCustom: Int
        get() {
            return age
        }
        set(value) {

            if (value in 0..120) { // Yaşın geçerli bir aralıkta olduğundan emin olun
                age = value
            } else {

                throw IllegalArgumentException("Yaş, 0 ile 120 arasında olmalıdır.")
            }
        }

    // İleriye yönelik constructor
    constructor(name: String, age: Int) {
        this.name = name
        this.ageCustom = age // Özel setter çağrılır

    }

    // Tanıtma metodu
    fun introduceYourself() {
        println("Merhaba, benim adım $name ve $age yaşındayım.")

    }
}

fun main() {

    val person = Person_2("Sedat", 25)
    val person_2 = Person_2("Musa", 8)
    person.introduceYourself()
    person_2.introduceYourself()

    person.ageCustom = 60 // Özel setter çağrılır
   println("Yeni yaş: ${person.ageCustom}")
}


/*lateinit var myVariable: String

fun initializeVariable() {
    myVariable = "Değişken başlatıldı."
}

fun main() {
    // Burada myVariable'ı kullanmak istesek UninitializedPropertyAccessException alırız
    initializeVariable() // Değişkeni başlatıyoruz
    println(myVariable) // Artık myVariable kullanılabilir
}*/
