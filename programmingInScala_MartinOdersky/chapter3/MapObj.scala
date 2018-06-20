import scala.collection.mutable.Map
object MapObj {
    def main(args : Array[String]) {
        val x = Map[String, String]()
        x += ("police" -> "100")
        x += ("ambulance" -> "101")
        x += ("fire" -> "102")

        for (xx <- x)
          println(xx._1 + ":" + xx._2)

        println("fire number" + x("fire"))
    }
}
