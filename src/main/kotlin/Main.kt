fun main(args: Array<String>) {

    // DATA TYPES, VARIABLES AND OPERATORS

    // var can be re-assigned
    var myVar: Int = 5
    // val cannot be re-assigned
    val myVal = 10
    println("The value of our variable is: $myVar")
    println("The value of our variable is: $myVal")

    val x = 15F
    val y = 10F
    val z = 9F
    val result = x+y
    val pi = 3.141592653589793 // Double type 8 bytes
    val radius = 5.5
    println("$x + $y = $result")
    println("$x * $y = ${x*y}")
    println("$x / $y = ${x/y}")
    println("The volume of sphere with radius $radius is: ${(1.333)*pi*radius*radius*radius}")

    // STRING MANIPULATION AND CONCATENATION
    val str = "Tanishq Sehgal"
    println("My name is: ${str.uppercase()}")
    println("My name is: ${str.lowercase()}")
    println("My reversed name is: ${str.reversed()}")

    // LOGICAL OPERATORS
    val a = 4
    val b = 8
    println(a==b)
    println(a>b)
    println(a<b)
    val c = 8
    println(c<=b)
    println(a<=c)
    println(!(a==b || b==c))
    println(!((a==b) && b==c))

    val simpleExpression = 3>4 || 4>3 && 4<=4
    println("Result of simpleExpression is: $simpleExpression")

    val boolVal = true
    val hardExpression = !(x!=z) && boolVal || z> (x+y) && (!boolVal || y<z) // false
    println("Result of hard expression is: $hardExpression")

    // CONDITIONAL STATEMENTS

    if(hardExpression) {
        println("Hard expression is true")
    } else if (simpleExpression) {
        println("Simple expression is true")
    } else if(simpleExpression && hardExpression) {
        println("Both Simple and Hard expression are true")
    } else {
        println("None is true")
    }

    if(x<y) {
        println("$x < $y")
    } else {
        println("$x > $y")
    }

    if(a==b && b==c) {
        println("$a, $b, and $c are equal")
    } else if(a==c || b==c) {
        println("Two of the values are equal among $a, $b, and $c")
    }

    val palinstr = "racecar"
    val revPalinStr = palinstr.reversed()

    if(palinstr == revPalinStr) println("$palinstr is a palindromic string")
    else println("$palinstr is not a palindromic string")

    // TAKING USER INPUT IN KOTLIN

    val userInput = readLine() // nullable
    println("Input given by you is: $userInput")
    println("Input given by you in uppercase is: ${userInput?.uppercase()}")

    val input2: Int? = readLine()?.toInt()
    println("Second input is: $input2")
    if(input2!=null) println(input2.toInt() - 5)

//    val age = readLine()
    val age = readln()?.toInt()

    if(age!=null && age <=12) {
        println("You're a young kid!")
    } else if(age!=null && age>=13 && age<20) {
        println("You're a teenager!")
    } else if (age!=null && age>=20 && age<=60) {
        println("Your're adult!")
    } else {
        println("Your're really really old!")
    }

    // taking user input of specific type
    val num : Int? = readLine()?.toInt()
    println("Number is: $num")

    val str2: String? = readLine()
    println("String is: $str2")

    val ch : Char? = readLine()?.get(0)?.toChar()
    println("Char is: $ch")

    // taking an input of Any data type
    val anyTypeInput: Any? = readLine()
    println(anyTypeInput)

    // WHEN in kotlin -> same as switch case in java
    val myAge : Int? = readLine()?.toInt()

    when(myAge) {
        in 0..12 -> println("You're a young kid!")
        in 13..17 -> println("You're a teenager!")
        18 -> println("You're and adult!")
        19,20 -> println("You're an adult!")
        in 21..65 -> println("You are an adult!")
        else -> println("You're really old!")
    }

    

}