object RelationalObj {
    def main(args : Array[String]) {
        val r = new Relational(1,2)
        println(r)

        val rr = new Relational(2,0)
        println(rr)
    }


}

class Relational(val n : Int, val d : Int) {
    require(d != 0)
    override def toString : String = n + "/" + d
}
