import ClassesInKotlinLanguage.Circle
import ClassesInKotlinLanguage.Rectangle
import ClassesInKotlinLanguage.Triangle

// CLASSES IN KOTLIN

/*
Object: It is an instance of a class
            or
A class is a blueprint of an object
A class has several properties, an object is just a medium
through which we can access the properties of a class
 */

fun main() {

   println("Details of First Rectangle:\n")
   val rectangle1 = Rectangle(4.0,7.0)
   println("Area of Rectangle is: ${rectangle1.area()}")
   println("Perimeter of Rectangle is: ${rectangle1.perimeter()}")
   if (rectangle1.isTheRectangleASquare()) println("This Rectangle is a Square.")
   else println("This rectangle is not a square.")

   println("\nDetails of Second Rectangle:\n")
   val rectangle2 = Rectangle(4.0,4.0)
   println("Area of Rectangle is: ${rectangle2.area()}")
   println("Perimeter of Rectangle is: ${rectangle2.perimeter()}")
   if (rectangle2.isTheRectangleASquare()) println("This Rectangle is a Square.")
   else println("This rectangle is not a square.")

   val circle1 = Circle(5.0)
   val circle2 = Circle(10.0)
   println("\nDetails of First Circle:\n")
   println("Area of circle1 is: ${circle1.area()}")
   println("Perimeter of circle1 is: ${circle1.perimeter()}")
   println("\nDetails of Second Circle:\n")
   println("Area of circle2 is: ${circle2.area()}")
   println("Perimeter of circle2 is: ${circle2.perimeter()}")

   val triangle = Triangle(5.0,6.0,3.0)
   println("\nArea of Triangle is: ${triangle.area()}")
   println("Perimeter of Triangle is: ${triangle.perimeter()}")

   circle1.changeName("MyCircle1")
   circle2.changeName("MyCircle2")
   rectangle1.changeName("MyRectangle1")
   rectangle1.changeName("MyRectangle2")
   triangle.changeName("MyTriangle1")

   println(circle1.nameOfShape)
   println(circle2.nameOfShape)
   println(rectangle1.nameOfShape)
   println(rectangle2.nameOfShape)
   println(triangle.nameOfShape)

}

