// Base class representing a Vehicle
class Vehicle(val make: String, val model: String) {
  def start(): Unit = {
    println(s"The $make $model is starting.")
  }
  
  def stop(): Unit = {
    println(s"The $make $model is stopping.")
  }
}

// Subclass representing a Car
class Car(make: String, model: String, val numDoors: Int) extends Vehicle(make, model) {
  def honk(): Unit = {
    println(s"The $make $model is honking its horn.")
  }
}

// Subclass representing a Motorcycle
class Motorcycle(make: String, model: String, val isCruiser: Boolean) extends Vehicle(make, model) {
  def revEngine(): Unit = {
    println(s"The $make $model is revving its engine.")
  }
}

object Main1 {
  def main(args: Array[String]): Unit = {
    val car = new Car("Toyota", "Camry", 4)
    val motorcycle = new Motorcycle("Harley-Davidson", "Sportster", true)
    
    car.start()
    car.honk()
    car.stop()
    
    motorcycle.start()
    motorcycle.revEngine()
    motorcycle.stop()
  }
}
