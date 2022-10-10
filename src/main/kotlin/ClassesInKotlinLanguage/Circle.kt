package ClassesInKotlinLanguage

class Circle(val radius:Double) : Shape("Circle") {
    // Shape class is inheritted using :Shape()
    init {
        println("\n$nameOfShape Created with radius $radius")
    }

    private val pi = 3.14
//    fun areaOfCircle() = radius*radius*pi
//    fun perimeterOfCircle() = 2*radius*pi

    override fun area(): Double {
       return radius*radius*pi
    }

    override fun perimeter(): Double {
        return 2*radius*pi
    }
}