object FunLiterals {
    def main(args : Array[String]) {
        val seq = List(1,3,5,2,6,10,14)
        println(seq.filter( (x : Int) => x > 3))
        println(seq.filter( x => x > 3))
        println(seq.filter( _ > 3))
    }
}
