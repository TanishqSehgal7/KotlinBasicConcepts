package ClassesInKotlinLanguage

import org.w3c.dom.css.Rect
import kotlin.random.Random

// CLASSES IN KOTLIN

/*
Object: It is an instance of a class
            or
A class is a blueprint of an object
A class has several properties, an object is just a medium
through which we can access the properties of a class
 */

//class constructor -> class Rectangle() : used to specify the values in a class
// constructor class Rectangle(): is the primary constructor but,
// we can have as many seconday constructors as we want
class Rectangle(val a:Double, val b:Double) : Shape("Rectangle") {

    // constructor() makes a secondary constructor
    // we can make as many secondary constructors as we want

    companion object {
        fun randomRectangle() : Rectangle {
            val len = Random.nextDouble()
            val breadth = Random.nextDouble()

            if (len == breadth)
                return Rectangle(len)
            else
                return Rectangle(len,breadth)
        }
    }

    constructor(a:Double) : this(a,a)

    constructor(a:Int, b:Int) : this(a.toDouble(), b.toDouble())

    init { // init block gets executed first when ever we create a class
      println("$nameOfShape Created with a=$a and b=$b")
    }

//    fun areaOfRectangle() = a*b
//    fun perimeterOfRectangle() = 2*a + 2*b
    fun isTheRectangleASquare() = a == b

    override fun area(): Double {
        if (a==b)
            return Math.pow(a,2.0)
        else
            return a*b
    }

    override fun perimeter(): Double {
        if(a==b)
            return 4*a
        else
            return 2*a + 2*b
    }

}