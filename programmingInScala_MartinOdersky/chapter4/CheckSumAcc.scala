object CheckSumAcc {
  def main(args : Array[String]) {
    val csa = new CheckSumAccumulator
    csa.add(7)
    println(csa.checksum())
  }
}

class CheckSumAccumulator {
    private var x = 0
    def add(a: Byte) { x += a }
    def checksum(): Int = ~(x &0xFF) +1
}
