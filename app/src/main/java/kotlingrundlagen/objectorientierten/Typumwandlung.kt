package kotlingrundlagen.objectorientierten

fun main() {
    // Implicit (Örtük) Dönüşüm
    val sayiInt: Int = 42
    val sayiDouble: Double = sayiInt.toDouble()

    println("Implicit Dönüşüm: $sayiDouble")

    // Explicit (Açık) Dönüşüm
    val sayiDouble2: Double = 42.0
    val sayiInt2: Int = sayiDouble2.toInt()

    println("Explicit Dönüşüm: $sayiInt2")

    // Nullable Veri Tipleri ile Dönüşüm
    val metin: String? = "123"
    val sayi: Int? = metin as? Int

    println("Nullable Dönüşüm: $sayi")

    // Smart Cast (Akıllı Dönüşüm)
    val deger: Any = 42
    if (deger is Int) {
        println("Smart Cast: ${deger * 2}")
    }
}