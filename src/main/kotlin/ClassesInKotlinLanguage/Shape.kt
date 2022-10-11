package ClassesInKotlinLanguage

abstract class Shape(var nameOfShape:String) {

    constructor(name:String, vararg dimensions: Double) : this(name)

    init {
        println("I'm the superclass:'Shape'")
    }

    abstract fun area() : Double
    abstract fun perimeter() : Double

    fun changeName(newName : String) {
        nameOfShape = newName
    }
}


// a class can be inheritted only when it is an open class
// every object in koltin inherits form the "Any" object, basically

/* everything in koltin inherits form the class Any and, it has
3 methods equals(other:Any?): Boolean, hashCode():Int and
toString():String
 */

/*
Visibility Modifiers
1. Private - only accessible inside a particular class
2. Protected - accessible inside a particular class and all the
subclasses that inherit that particular class
3. Public - accessible to all classes

=> by default all classes and their members are public in kotlin
 */

/*
Abstract classes and functions
=> By specifying classes as abstract, we specify that the only
use of the abstract class is that, that other classes should
only inherit from the abstract class and, it's instance is not to be made

=> We cannot create and instance of an abstract class
=> If we have specified the class as abstract, then we do not need
to specify it as "open"

=> For abstract functions, we just have to define then in the class
and not implement them. Basically abstract functions are for the
use cases when we don't know the implementation of the function yet
but, we want to use one particular function for multiple different
implementations

=> So when we inherit an abstract class containing abstract methods,
we can implement the abstract methods in the class that inherits the
abstract class. Same abstract methods can also be used in a different
class that inherits them, and we can have a different implementation
for the same abstract function

=> So basically abstract methods can be overridden in the class that
inherits from that abstract class
 */