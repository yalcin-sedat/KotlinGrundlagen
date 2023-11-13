package kotlingrundlagen.objectorientierten

data class User(val id: Long, val name: String, val email: String)

fun main() {
    // Data sınıfından bir nesne oluşturalım
    val user1 = User(1, "John Doe", "john@example.com")

    // toString ile nesneyi yazdıralım
    println(user1)

    // Equals ile nesneleri karşılaştıralım
    val user2 = User(1, "John Doe", "john@example.com")
    println("Kullanıcılar eşit mi: ${user1 == user2}")

    // HashCode'i yazdıralım
    println("user1.hashCode: ${user1.hashCode()}")
    println("user2.hashCode: ${user2.hashCode()}")

    // Copy metodu ile nesne kopyalama
    val user3 = user1.copy(id = 2)
    println("user3: $user3")

    // Data sınıfının özelliklerine erişim
    println("user1.id: ${user1.id}")
    println("user1.name: ${user1.name}")
    println("user1.email: ${user1.email}")
}
