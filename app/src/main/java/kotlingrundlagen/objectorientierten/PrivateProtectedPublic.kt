package kotlingrundlagen.objectorientierten

// Base Class
open class Base {
    private val privateVariable = "This is a private variable"
    protected val protectedVariable = "This is a protected variable"
    val publicVariable = "This is a public variable"

    private fun privateMethod() {
        println("This is a private method")
    }

    protected fun protectedMethod() {
        println("This is a protected method")
    }

    fun publicMethod() {
        println("This is a public method")
    }

    fun accessExample() {
        println(privateVariable) // Direct access, from anywhere in the class
        println(protectedVariable) // Direct access, from within subclasses
        println(publicVariable) // Direct access, from anywhere

        privateMethod() // Direct access, from anywhere in the class
        protectedMethod() // Direct access, from within subclasses
        publicMethod() // Direct access, from anywhere
    }
}

// Derived Class
class Derived : Base() {
    fun accessExampleInDerived() {
        // Accessing private, protected, and public members in a subclass derived from the superclass
        // println(privateVariable) // Error! Access denied (private)
        println(protectedVariable) // Direct access (protected)
        println(publicVariable) // Direct access (public)

        // privateMethod() // Error! Access denied (private)
        protectedMethod() // Direct access (protected)
        publicMethod() // Direct access (public)
    }
}

fun main() {
    val base = Base()
    // println(base.privateVariable) // Error! Access denied (private)
    // println(base.protectedVariable) // Error! Access denied (protected)
    println(base.publicVariable) // Direct access (public)

    // base.privateMethod() // Error! Access denied (private)
    // base.protectedMethod() // Error! Access denied (protected)
    base.publicMethod() // Direct access (public)

    val derived = Derived()
    // println(derived.privateVariable) // Error! Access denied (private)
    // println(derived.protectedVariable) // Error! Access denied (protected)
    println(derived.publicVariable) // Direct access (public)

    // derived.privateMethod() // Error! Access denied (private)
    // derived.protectedMethod() // Error! Access denied (protected)
    derived.publicMethod() // Direct access (public)
}
