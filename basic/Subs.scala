import scala.collection.mutable.ArrayBuffer

trait Pet {
    val name: String
}

class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet

object Subs {
  def main(args : Array[String]) {
      val dog = new Dog("roti")
      val cat = new Cat("meow")

      val ani = ArrayBuffer.empty[Pet]
      ani.append(dog)
      ani.append(cat)

      ani.foreach(pet => println(pet.name))
  }
}
