import ClassesInKotlinLanguage.*

/* LAMBDA FUNCTIONS IN KOTLIN
 lambda functions are used to pass functions as parameters to other
 functions
 */


fun main(args:Array<String>) {

    var list = (1..20).toList()
    println(list)
    list = list.filter { it % 2 == 0 } as MutableList<Int>
    println(list)
    list = list.filter { it > 8 } as MutableList<Int>
    println(list)


    val circle1 = Circle(5.0)
    val circle2 = Circle(7.0)
    val rectangle1 = Rectangle(3.0,5.0)
    val rectangle2 = Rectangle(5.0,7.0)
    val triangle1 = Triangle(2.0,6.0,5.0)
    val triangle2 = Triangle(4.0,4.0,4.0)

    var shapes = listOf(circle1,circle2, rectangle1,rectangle2, triangle1, triangle2)

    shapes = shapes.customFilterFunction { it.area() > 20 }.sortedBy { it.area() }
    for (shape in shapes) {
        println("${shape.nameOfShape} has Area = ${shape.area()}")
    }

    var intList = (1..20).toList()

    var sumOfEvenDigits = intList.customSum { it % 2 == 0}
    println("Sum of Even Digits is: $sumOfEvenDigits")

    /* GENERICS -> used to access objects of Any type "T", any type of entitiy can
    access and use any other type of entity which should be generic

    Also, a generic lambda function can be used on both intList and shapes
    since it is of generic type
    */

    var shapes2 = listOf(circle1,circle2, rectangle1,rectangle2, triangle1, triangle2)
    var intList2 = (1..20).toList()

    shapes = shapes2.myGenericCustomFiler { it.area() > 20 }
    println("Shapes with area greater than 20 in second list:")
    for (shape in shapes2) {
        println("${shape.nameOfShape} : ${shape.area()}")
    }

    intList2 = intList2.myGenericCustomFiler { it % 2 !=0 }
    println("Odd Numbers from second list are:")
    for (num in intList2) {
        print("$num ")
    }

/*
GENERIC CLASSES -> Kotlin standard library has a class called
Triple<A,B,C>
 */

    var triple = Triple<Int, String, Boolean>(3,"Hello", false)
    println("First: ${triple.first}")
    println("Second: ${triple.second}")
    println("Third: ${triple.third}")

    var myCustomTrippleClass = MyCustomTrippleClass<Int, String, Boolean>(11, "Generic In Kotlin", true)
    myCustomTrippleClass.printTypes()
    println("First : ${myCustomTrippleClass.first}")
    println("Second : ${myCustomTrippleClass.second}")
    println("Third : ${myCustomTrippleClass.third}")
}
// creating our own lambda functions

/*
below 2 functions are extension functions that are used as lambda functions
 */

fun List<Shape>.customFilterFunction(filterFunction: (Shape) -> (Boolean)) : List<Shape> {
    val resultList = mutableListOf<Shape>()
    for (shape in this) {
        if (filterFunction(shape)) {
            resultList.add(shape)
        }
    }
    return resultList
}

fun List<Int>.customSum(myCustomSum: (Int) -> (Boolean)) : Int {
    var result : Int = 0
    for (num in this) { // keyword "this" is used to refer to the list in use
        if (myCustomSum(num)) {
            result+=num
        }
    }
    return result
}

// GENERIC type Extension function

fun <T> List<T>.myGenericCustomFiler(genericCustomFiler: (T) -> (Boolean)) : List<T> {
    val resultList = mutableListOf<T>()
    for (item in this) {
        if (genericCustomFiler(item)) {
            resultList.add(item)
        }
    }
    return resultList
}

//fun <T : Number> List<T>.mygenericFilerWithSelectedAllowedTypes(myGenericFilter: (T) -> (Boolean)) : List<T>{
//
//}