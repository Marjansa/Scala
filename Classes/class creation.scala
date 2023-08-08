// In this example, we define a Person class with a primary constructor that takes 
// firstName and lastName as parameters. The class has a field (fullName) and a method (greet).
//  The Main object demonstrates how to create an instance of the Person class and access its fields and methods.


class Person(firstName: String, lastName: String) {
  // Fields (constructor parameters)
  val fullName: String = s"$firstName $lastName"
  
  // Method
  def greet(): Unit = println(s"Hello, my name is $fullName")
}

object Main {
  def main(args: Array[String]): Unit = {
    // Creating an object of the Person class
    val person = new Person("John", "Doe")
    
    // Accessing fields and methods
    println(s"Full Name: ${person.fullName}")
    person.greet()
  }
}
