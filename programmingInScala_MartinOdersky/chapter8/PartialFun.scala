object PartialFun {
    def main(args: Array[String]) {
      val x = sum(1,_:Int, 3)
      println(x)
      println(x(2))
    }


    def sum(a: Int, b: Int, c: Int) = a+b+c
}
