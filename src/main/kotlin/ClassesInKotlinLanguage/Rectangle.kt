package ClassesInKotlinLanguage

// CLASSES IN KOTLIN

/*
Object: It is an instance of a class
            or
A class is a blueprint of an object
A class has several properties, an object is just a medium
through which we can access the properties of a class
 */

//class constructor -> class Rectangle() : used to specify the values in a class
class Rectangle(val a:Double, val b:Double) : Shape("Rectangle") {

    init { // init block gets executed first when ever we create a class
      println("$nameOfShape Created with a=$a and b=$b")
    }

//    fun areaOfRectangle() = a*b
//    fun perimeterOfRectangle() = 2*a + 2*b
    fun isTheRectangleASquare() = a == b

    override fun area(): Double {
        return a*b
    }

    override fun perimeter(): Double {
        return 2*a + 2*b
    }

}