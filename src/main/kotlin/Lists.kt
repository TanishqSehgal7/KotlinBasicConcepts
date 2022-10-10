
// LISTS IN KOTLIN

fun main(args:Array<String>) {

    val arr = arrayOf(1,2,3)
    val immutableList = listOf<Int>(1,2,3,4,5)

    //immutableList[0] = 1 -> won't work bcz a list is by default immutable
    // to edit the values of a list we need mutable list which is declared as
    // mutable lists can also change in size

    val mutableList = mutableListOf<Int>(0,2,3,4,5,6)
    mutableList[0] = 1
    println(mutableList)
    println("Adding and Removing Elements to mutable lists")
    mutableList.add(7)
    mutableList.add(8)
    mutableList.add(9)
    mutableList.add(10)
    println(mutableList)
    // adding values at specific index
    mutableList.add(4,4) // increases size of list and shifts others by 1
    println(mutableList)
    // removing elements from lists
    mutableList.remove(4) // removes element only once if duplicates are present
    println(mutableList)
    mutableList.remove(4)
    println(mutableList)
    mutableList.add(3,4)
    println(mutableList)
    mutableList.removeAt(mutableList.size-1) // removes element at specific index
    println(mutableList)

    // taking user input and storing elements into a list
    val countOfNos = 10
    var itr = countOfNos

    val anotherMutableList = mutableListOf<Int>()
    while (itr!=0) {
        val element : Int? = readLine()?.toInt()
        anotherMutableList.add(element!!) // not null asertion -> !! (no need for a null check everytime)
        itr--
    }
    println(anotherMutableList)

    println("\nAdding Squares of every elemet of the list to the same list")
    for (i in 0 until anotherMutableList.size) {
        val square = anotherMutableList[i] * anotherMutableList[i]
        anotherMutableList.add(square)
    }
    println(anotherMutableList)

    // print reversed list
    println(anotherMutableList.reversed())

    // fibonacci series -> 0 1 1 2 3 5 8 13 21 34.... and so on
    val n : Int? = readLine()?.toInt()
    val fiboList = mutableListOf<Int?>()
    var sum:Int? = 0

    fiboList.add(0,0)
    fiboList.add(1,1)

    for (i in 2..n!!) {
        sum =  fiboList[i-1]!! + fiboList[i-2]!!
        fiboList.add(sum)
    }
    println(fiboList)


}