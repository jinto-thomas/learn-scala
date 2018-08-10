abstract class Element {
    def contents : Array[String]

    def width : Int = if (height == 0) 0 else contents.length

    def height : Int = contents.length

    def above(that : Element) : Element = 
        new ArrayElement(this.contents ++ that.contents)   //concat array!

    def beside(that : Element) : Element =
        new ArrayElement (
            for ( 
              (line1, line2) <- this.contents zip that.contents
              ) yield (line1 + line2)
        )
    override def toString = contents mkString "-"
}

class ArrayElement(conts : Array[String]) extends Element {
    override def contents = conts
}


object Factory {
    def main(args : Array[String]) {
      val ae1 = new ArrayElement(Array("hello","world"))
      val ae2 = new ArrayElement(Array("here","goes"))
      val ae3 : Element  = ae1 above ae2
      println(ae3 toString)
    }
}
