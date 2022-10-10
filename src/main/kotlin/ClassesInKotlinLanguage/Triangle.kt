package ClassesInKotlinLanguage

import kotlin.math.sqrt

class Triangle(val a:Double, val b:Double, val c:Double)
    : Shape("Triangle") {
// Shape class is inheritted using :Shape()
    init {
        println("$nameOfShape created with a=$a, b=$b, c=$c")
    }

    private val s = (a+b+c)/2
//    fun areaOfTriangle() = Math.sqrt(s*(s-a)*(s-b)*(s-c))
//    fun perimeterOfTriangle() = a+b+c

    override fun area(): Double {
        return sqrt(s*(s-a)*(s-b)*(s-c))
    }

    override fun perimeter(): Double {
        return a+b+c
    }
}