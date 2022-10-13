import ClassesInKotlinLanguage.Circle

class ScopeFunctionsLetAlsoRunApplyWith {

    // let - usually used for null checks in kotlin

    private var number : Int? = null
    private var i: Int = 0

    fun main(args:Array<String>) {

       var x = number?.let { // this only gets executed if number is not null
           val number2 = it + 1
           number2
       } ?: 3 // x becomes equal to number2, if null then x=3

        // apply -> used to make changes to a specific object
        val circle = Circle(5.0)
        circle.apply {
            circle.nameOfShape = "Circle Name Modified using Apply function"
        }
        println("${circle.nameOfShape}")

        /*

        Eg: val intent = Intent()
        intent.apply {
            putExtra("","")
            putExtra("",0)
            action = ""
        }

        with(Intent) {
            // do something
            putExtra("","")
            putExtra("",0)
            action = ""
        }

         */

        while (i<10) {
            print("${getSquared()}")
        }

    // run -> it is equivalent to apply but returns the last line in the code block
    // with -> same as run


    }
    // also ->
    // do 2 things one after another -> first i is squared and then incremented
    fun getSquared() = i * i.also { i++ }

}