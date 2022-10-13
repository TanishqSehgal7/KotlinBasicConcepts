package ClassesInKotlinLanguage

// Creating our own custom generic Triple Class

class MyCustomTrippleClass<A:Any,B:Any,C:Any>(var first:A, var second:B, var third:C) {

    init {
        println("Custom Triple class of Generic Type is created!")
    }

    fun printTypes() {
        println("The type of first is: ${first::class}")
        println("The type of second is: ${second::class}")
        println("The type of third is: ${third::class}")
    }
}