import ClassesInKotlinLanguage.Circle
import ClassesInKotlinLanguage.Rectangle
import ClassesInKotlinLanguage.Shape
import ClassesInKotlinLanguage.Triangle
import org.w3c.dom.css.Rect
import java.lang.NumberFormatException

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

   val newRectangle = Rectangle(10.0)
   println("Area of square is: ${newRectangle.area()}")
   println("Perimeter of square is: ${newRectangle.perimeter()}")

   println("Max area among ${rectangle1.nameOfShape}, ${circle1.nameOfShape} " +
           "and ${triangle.nameOfShape} ${maxAreaShape(rectangle1,circle1,triangle)}")

   println("Max area among ${rectangle2.nameOfShape}, ${circle2.nameOfShape} " +
           "and ${triangle.nameOfShape} ${maxAreaShape(rectangle2,circle2,triangle)}")

   println("Max area among ${rectangle1.nameOfShape} and ${circle1.nameOfShape} " +
           "${maxAreaShape(rectangle1,circle1)}")

   println("Max area among ${rectangle2.nameOfShape}, ${circle2.nameOfShape} " +
           "${maxAreaShape(rectangle2,circle2)}")

   val randomRadiusCircle = Circle.randomCircle()
   val randomRectangle = Rectangle.randomRectangle()

   if (randomRectangle.isTheRectangleASquare()) println("This is a square!")
   println("Area of Random Rectangle: ${randomRectangle.area()}")
   println("Perimeter of Random Rectangle: ${randomRectangle.perimeter()}")

   println("Area of Random Circle: ${randomRadiusCircle.area()}")
   println("Perimeter of Random Circle: ${randomRadiusCircle.perimeter()}")

   val a = 3.0
   val b = 4.0
   val height = 2.0

   /*
   ANONYMOUS CLASSES

   So in order to access an abstract class without inheritting it, we can make
   an object of the constructor, in the way mentioned below. This will let us
   override the methods contained inside the abstract class

   so this is called an anonymous class
    */

   val parallelogram = object:Shape("Parallelogram",a,b,height) {
      init {
         println("Parallelogram created with a=$a, b=$b and height=$height")
         println("Area of parallelogram is: ${area()}")
         println("Perimeter of parallelogram is: ${perimeter()}")
      }

      override fun area(): Double {
         return a * height
      }

      override fun perimeter(): Double {
         return 2 * a + 2 * b
      }

      fun isRectangle() : Boolean = height == b
   }

   if (parallelogram.isRectangle()) println("This is a rectangle")
   else println("This is a parallelogram")

   val c = 6.0
   val d = 3.0

   val trapezium = object : Shape("Trapezium", a,b,c,d, height) {

      init {
         println("Trapezium Created with a=$a, b=$b, c=$c, d=$d and height=$height")
         println("Area of Trapezium is: ${area()}")
         println("Perimeter of Trapezium is: ${perimeter()}")
      }

      override fun area(): Double {
         return height * (a+c)/2
      }

      override fun perimeter(): Double {
         return a + b + c + d
      }

      fun isRectangle() : Boolean = a == c && height == b && height == d
   }

   if (trapezium.isRectangle()) println("This is a rectangle")
   else println("This is a trapezium")


/*
Sometimes, our code can have errors on runtime, to hnadle that
situation we have exceptions in kotlin

We use the try{} and catch() {} block to handle exceptions
*/

   val newInput = try {
      readLine()?.toInt()
   } catch (e:NumberFormatException) {
      // NumberFormatException inherits from the Class Exception
      println("Wrong Type of Input Entered!!")
      0 // assigning value 0  to input when some wrong input is entered
   } finally { //gets executed after one of the try and catch
      // blocks get executed everytime
      println("This is from the finally block")
   }

   println("You entered: $newInput")

}

// function overloading - using the same name of function but with different type or
// number of parameters
fun maxAreaShape(shape1:Shape, shape2:Shape) : Double {
   val shape1Area = shape1.area()
   val shape2Area = shape2.area()
   return if (shape1Area>shape2Area) shape1Area else shape2Area
}

fun maxAreaShape(shape1:Shape, shape2:Shape, shape3:Shape) : Double {
  val maxAreaShape1Shape2 = maxAreaShape(shape1, shape2)
  val shape3Area = shape3.area()
  return Math.max(maxAreaShape1Shape2, shape3Area)
}

