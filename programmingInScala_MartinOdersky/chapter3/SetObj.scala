import scala.collection.mutable.Set
object SetObj {
    def main(args : Array[String]) {
        //immutable set!
        val x = Set("apple","orange", "strawberry","blueberry")
        x += "orange"
        x += "muskmelon"

        println(x)

        println("------------")


        //empty string Set
        val y = Set[String]()
        y += "hello"
        y += "world"

        println(y)
    }
}
