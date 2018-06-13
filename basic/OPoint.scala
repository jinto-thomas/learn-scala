class Point(x: Int, y: Int) 
{
  private var _x = 0
  private var _y = 0
  private var _name : String = ""

  def x = _x

  def x_= (newVal : Int) : Unit = {
    _x = newVal
  }

  def y = _y
  def y_= (newVal : Int) : Unit = {
    _y = newVal
  }

  def named = _name
  def named_= (newVal : String) : Unit = {
    _name = newVal
  }

}

object OPoint {
    def main(args : Array[String])
    {
      val pt = new Point(12,14)
      println(pt.x + "," + pt.y)
      pt.x = 12
      pt.y = 14
      pt.named = "hahaha"
      println(pt.x + "," + pt.y + pt.named)

    }
}
