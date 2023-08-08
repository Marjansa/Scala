// Define a trait for shapes
trait Shape {
  def area: Double // An abstract method for calculating the area
}

// Define classes for different shapes
class Circle(radius: Double) extends Shape {
  def area: Double = Math.PI * radius * radius
}

class Square(sideLength: Double) extends Shape {
  def area: Double = sideLength * sideLength
}

class Triangle(base: Double, height: Double) extends Shape {
  def area: Double = 0.5 * base * height
}

object Main {
  def main(args: Array[String]): Unit = {
    val circle = new Circle(5.0)
    val square = new Square(4.0)
    val triangle = new Triangle(6.0, 8.0)

    println(s"Circle area: ${circle.area}")
    println(s"Square area: ${square.area}")
    println(s"Triangle area: ${triangle.area}")
  }
}
