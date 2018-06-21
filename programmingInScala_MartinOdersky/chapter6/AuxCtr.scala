object AuxCtr {
    def main(args : Array[String]) {
        val r = new Relational(1,2)
        println(r)
        val rr = new Relational(5)
        println(rr)

    }
}

class Relational(n : Int, d : Int) {
    require(d != 0)
    val num = n
    val den = d
    //aux ctr
    def this(n : Int) = this(n, 1)

    override def toString : String = num + "/" + den
}
