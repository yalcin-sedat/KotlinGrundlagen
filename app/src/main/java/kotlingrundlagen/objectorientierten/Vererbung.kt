package kotlingrundlagen.objectorientierten


fun main() {
    val cat = Animal("Pisi")
    val dog = Dog("Karabas")
    val cat2 = Cat("pamuk")

    cat2.makeSound()
    cat2.play()
    println(cat2.name)

    cat.makeSound() // "Pisi ses çıkarıyor."
    dog.makeSound() // "Karabas havlıyor."

    // Dog sınıfının ek özelliği
    dog.playFetch() // "Karabas top oynuyor."
}


// Ebeveyn sınıf (Üst sınıf)
open class Animal(val name: String) {
    open fun makeSound() {
        println("$name ses çıkarıyor.")
    }
}

// Alt sınıf (Çocuk sınıf)
class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name havlıyor.")
    }

    fun playFetch() {
        println("$name top oynuyor.")
    }


}

class Cat(name:String):Animal(name){
    override fun makeSound() {
        super.makeSound()
    }

    fun play(){
        println("$name uyuyor.")

    }
}



