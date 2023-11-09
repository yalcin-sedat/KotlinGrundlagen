package kotlingrundlagen.objectorientierten
    class Employee {
        // Üye değişkenler
        var name: String = ""
        var age: Int = 0
        var position: String = ""

        // Birincil constructor
        constructor(name: String, age: Int, position: String) {
            this.name = name
            this.age = age
            this.position = position
        }

        // Üye fonksiyon (method)
        fun introduceYourself() {
            println("Merhaba, benim adım $name, $age yaşındayım ve $position pozisyonundayım.")
        }
    }

    fun main() {
        // Employee sınıfından 3 çalışan örneği oluştur
        val employee1 = Employee("Ahmet", 30, "Yazılım Mühendisi")
        val employee2 = Employee("Mehmet", 25, "İş Analisti")
        val employee3 = Employee("Sedat", 32, "Bilgisayar Mühendisi")

        // Çalışanları tanıt
        employee1.introduceYourself()
        employee2.introduceYourself()
        employee3.introduceYourself()
    }
