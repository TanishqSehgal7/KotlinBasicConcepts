
fun main(args:Array<String>) {

    val input = readLine()?.toInt()
    if (input!=null) {
        if (input.isPrime())
            println("$input is a Prime Number")
        else
            println("$input is not a Prime Number")
    }

    val list = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val product = list.findProductOfElements()
    println("Product of elements in list: $list is: $product")
}

// EXTENSION FUNCTIONS IN KOTLIN

/*
We can extend make our own functions in kotlin and extend them
to the Data Type Classes in order to use them in objects of
a particular data type. Extension functions become the function
implementations of a particular Class Type

=> In extension functions we access the values that we need to
operate on, ie, the values that we would have passed as
arguements in a normal function otherwise, using the "this"
keyword

Eg:
 fun main(args:Array<String>) {
    val input = readLine()?.toInt()
    if (input!=null) {
        input.isPrime()
    }
}

fun Int.isPrime(): Boolean {
    for(i in 2..this)
}
=> here, this key word refers to input in main function

 */

// this is an extension function extended to type Int

fun Int.isPrime(): Boolean {
    for(i in 2 until this) {
        if (this%i==0)
            return false
    }
    return true
}

fun MutableList<Int>.findProductOfElements(): Int {
    var product = 1
    for (i in this.indices) {
     product*=this[i]
    }
    return product
}