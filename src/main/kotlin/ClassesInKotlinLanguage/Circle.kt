package ClassesInKotlinLanguage

import NegativeCircleRadiusException
import kotlin.random.Random

class Circle(val radius:Double) : Shape("Circle") {
    // Shape class is inheritted using :Shape()

    /*
    a companion object is an object coupled/associated with a class
    and it's members, we can use the entities contained inside a companion
    object through the instance of a class wherever needed

    entities inside a companion object can be accessed without making an instance
    of the class, we can just access then by the following way:

    ClassName.funcionOrValueToBeAccessed
     */
    companion object {
        fun randomCircle() : Circle {
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
     }

    init {
       if (radius<0.0)
           throw NegativeCircleRadiusException()
       else {
           println("\n$nameOfShape Created with radius $radius")
       }
    }

//    fun areaOfCircle() = radius*radius*pi
//    fun perimeterOfCircle() = 2*radius*pi

    override fun area(): Double {
       return radius * radius * ImportantNumbers.PI
    }

    override fun perimeter(): Double {
        return 2 * radius * ImportantNumbers.PI
    }
}