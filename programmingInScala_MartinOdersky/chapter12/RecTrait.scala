class Point(val x : Int, val y : Int)

trait Rectangular {
    def topLeft : Point
    def bottomRight : Point

    def left = topLeft.x
    def right = bottomRight.y
    def width = right - left
}
// multile trait add to new class with 'with'

class Rectangle(val topLeft : Point, val bottomRight : Point) extends Rectangular {
        
}

object RecTrait {
    def main(args : Array[String]) {
        val rec = new Rectangle(new Point(1,1), new Point(10,10))
        println(rec.left + " " + rec.right)
    }
}
