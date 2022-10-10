// FUNCTIONS IN KOTLIN


fun main(args:Array<String>) {

    printThreeLines() // function invocation
    println("\nEnter base:")
    val base = readLine()?.toInt()
    println("\nEnter exponenet:")
    val exponent = readLine()?.toInt()
    calcPower(base!!,exponent!!)
    println("Product of $base and $exponent is: ${multiply(base,exponent)}")

    println("\nEnter a number upto which sum is needed:")
    val n = readLine()?.toInt()
    val sum = calcSum(n!!)
    println("Sum of digits from 0 to $n is: $sum")

    val list = mutableListOf<Int>(11,27,3,14,51,22,8,17,20)
    println("List is:")
    printList(list)

    println("\nEnter the element you want to search in the list:")
    val element = readLine()?.toInt()
    val position = linearSearch(element!!,list)

    if (position==-1) println("Element does'nt exist in the list")
    else println("\n$element is present at position: ${position+1} in the list.")

    // passing array elements as varargs parameter
    val nums = intArrayOf(11,27,3,14,51,22,8,17,20)
    println("The maximum value in the list is: ${getMax(*nums)}")
    println()
    searchForString("How to become the best programmer?")
    searchForString("How to Code in Kotlin?", "Bing")
    searchForString("How to become best Android Developer?")
    searchForString("How to learn Full Stack Web Development", "DuckDuckGo")
    // if the order in which the parameters have to be put is not known
    searchForString(searchEngine ="DuckDuckGo", search = "How to learn Full Stack Web Development")

    val alternatingSum = alternatingSum(*nums)
    println("\nAlternating Sum is: $alternatingSum")
}

// fun key word is used to define a function in kotlin
// this function does not return any value
fun printThreeLines() {
    println("First Line")
    println("Second Line")
    println("Third Line")
}

// adding parameters to function

fun calcPower(base:Int, exponent:Int) {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    println("$base^$exponent = $result")
}

// function that accepts parameters and returns some value
fun calcSum(n:Int) : Int {
    var sum = 0;
    for (i in 0..n) {
        sum+=i
    }
    return sum
}

// return type Unit -> means an empty return type, similar to void

// one line functions in kotlin
fun multiply(a:Int, b:Int) = a*b

// passing list in function as a parameter
fun printList(list:List<Int>) = println(list)


fun linearSearch(element:Int, list:List<Int>) : Int {
    var position = -1;
    for (i in 0 until list.size) {
        if (list[i] == element)
            position = i
        else
            position = -1
    }
    return position
}

// types of parameters we can pass in a function
/*
1. varargs keyword -> means we can have variable number of arguments for variable nums
    varargs is similar to arrays/lists
    => to pass values in a varargs function parameter,
    make an array and pass its values as: *arrayname
    or pass comma separated individual values as paramter
*/
fun getMax(vararg nums:Int): Int {
    var max = nums[0]
    for (num in nums) {
        if(num>max)
            max = num
    }
    return max
}

/*
2. Default parameters -> these parameters have a value by default
    which will be used by default everytime if some other value is not
    given in their place in the function invocation as a parameter
*/

fun searchForString(search:String, searchEngine:String = "Google") {
    println("Searching for '$search' on $searchEngine...")
}

fun alternatingSum(vararg  nums:Int) : Int {
    var alternatingSum = 0

    for (i in nums.indices) {
        if (i % 2 == 0)
            alternatingSum += nums[i]
        else if (i % 2 != 0)
            alternatingSum -= nums[i]
    }
    return alternatingSum
}

