
// LOOPS IN KOTLIN

fun main(args:Array<String>) {

    // WHILE LOOPS IN KOLTIN
    var count = 5
    println("Values of count are:")
    while (count>0) {
        print("$count ")
        count--
    }

    val arrayStr = arrayOf("Hello", "guys", "!", "What's up?")
    val length = arrayStr.size-1
    var idx = 0
    println()
    println("\nOutput from While Loop is:")
    while (idx<=length) {
        print("${arrayStr[idx]} ")
        idx++
    }

    // DO WHILE LOOP in KOTLIN
    idx=0
    println("\n\nOutput from Do While Loop is:")
    do {
        print("${arrayStr[idx]} ")
        idx++
    } while (idx<=length)

    println("\nEnter base:")
    var base: Int? = readLine()?.toInt()
    println("Enter exponent:")
    var exponent: Int? = readLine()?.toInt()
    var result: Int? = 1
    var exponentItr: Int? = exponent

    if(exponent == 0) {
        println("$base ^ $exponent is: result")
    } else if (exponent == 1) {
        println("$base ^ $exponent is: $base")
    } else {
        while (exponentItr!=0 &&result!=null && base!=null && exponent!=null && exponentItr!=null) {
//            if(result!=null && base!=null && exponent!=null && exponentItr!=null) {
                result *= base
                exponentItr--
//            }
        }
        println("$base ^ $exponent is: $result")
    }

    // FOR LOOPS IN KOTLIN

    val myArr = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println()

    // for loop method 1
    for(i in myArr) {
        print("$i ")
    }
    println()

    // for loop method 2
    for(i in 0 until myArr.size) { // until keyword excludes the last value
        print("${myArr[i]} ")
    }
    println()

    // for loop method 3
    for (i in 0..myArr.size-1) { // .. (range) inclues the last value
        print("${myArr[i]} ")
    }

    // decrement in for loop kotlin
    println("\nPrinting from 10 to 0...")
    for(i in 10 downTo 0) {
        print("$i ")
    }

    // giving custom increment and decrement in for loop in kotlin
    println("\nPrinting even numbers from 0 to 10")
    for(i in 0..10 step 2) {
        print("$i ")
    }

    println("\nPrinting values from 0 to 10 in steps of 3")
    for(i in 0 until 10 step 3) {
        print("$i ")
    }

    println("\nPrinting odd numbers from 10 to 0")
    for (i in 9 downTo 0 step 2) {
        print("$i ")
    }

    // printing characters in kotlin
    println("\nPrinting characters from a to z")
    for (ch in 'a'..'z') {
        print("$ch ")
    }
    println("\nPrinting characters from z to a")
    for (ch in 'z' downTo 'a') {
        print("$ch ")
    }
    println("\nPrinting characters from a to z in steps of 2")
    for (ch in 'a'..'z' step 2) {
        print("$ch ")
    }

    val intArr = arrayOf(4,3,5,6,7,8,10,32,40,2,5,10)
    var max = 0;
    for (i in intArr) {
        if(i > max) {
            max = i
        }
    }
    println("\nMaximum value in the array is: $max")

    
}