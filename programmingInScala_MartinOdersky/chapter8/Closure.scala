object Closure extends App {
    def makeIncreaser(more : Int) = (x : Int) => more + x

    val inc1= makeIncreaser(10)
    val inc2 = makeIncreaser(100)

    println(inc1(1))
    println(inc2(1))
}
