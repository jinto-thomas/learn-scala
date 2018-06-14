object CurryAdd{
    def main(args: Array[String]) {
        println("with return type " + add(1,3))
        println("without return " + add1(2,4))

        def a = addCurry(3)
        println("Curry " + a(4))

        println("Curry2 " + addCurry(1)(3) )
    }

    def add(a: Int, b: Int) : Int = {
        a + b
    }

    def add1(a: Int, b: Int) = {
        a+b
    }

    def addCurry(a : Int) = {
       (b: Int) => a + b
    }
}
