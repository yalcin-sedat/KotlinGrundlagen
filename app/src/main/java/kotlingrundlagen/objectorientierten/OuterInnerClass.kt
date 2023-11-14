package kotlingrundlagen.objectorientierten

class OuterClass {
    private val outerField = "Outer field"

    // İç sınıf (Inner Class)
    inner class InnerClass {
        fun display() {
            println("Outer field from inner class: $outerField")
        }
    }

    // İç içe sınıf (Nested Class)
    class NestedClass {
        fun display() {
            println("This is a nested class")
        }
    }
}

fun main() {
    val outer = OuterClass()

    // İç sınıf (Inner Class) kullanımı
    val inner = outer.InnerClass()
    inner.display()

    // İç içe sınıf (Nested Class) kullanımı
    val nested = OuterClass.NestedClass()
    nested.display()
}
