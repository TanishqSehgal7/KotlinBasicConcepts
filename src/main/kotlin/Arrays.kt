
// ARRAYS IN KOTLIN

fun main(args:Array<String>) {

    // MAKE AN ARRAY
    val arr = arrayOf(3,2,4,5,6,7,8,) // implicit declaration
    val arrStr = arrayOf("Hello", "guys", "what's up!")
    // arrays can be traversed as
    println("String array is:")
    for(str in arrStr) {
        print("$str ")
    }
    println("\n\nNumeric Array is:")
    for (i in 0..arr.size-1) {
        print("${arr[i]} ")
    }
    println()
    // make an array of specific type - explicit declaration
    // taking array as user input
    val intArry = arrayOf<Int>(1,2,3,4,5,6,7,8,9,10)

    //another way of traversing array is using forEach loop
    println("Integer Array is:")
    intArry.forEach {
        print("$it ")
    }
    println()
    val secondIntArr = intArrayOf(11,12,13,14,15,16,17,18,19,20)
    println("Second Integer Array is:")
    secondIntArr.forEach { element->
        print("$element ")
    }

}