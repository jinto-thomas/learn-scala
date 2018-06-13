
object FnCallByName {
    
    def main(args : Array[String]) {

        delayed(time())

        val n = greet("jinto");
        println(n)
        morningGreet(greet("tc"))
    }


    def time() = {
        println("getting time in nano sec")
        System.nanoTime
    }

    def delayed(f: => Long) = {
        println("in delayed")
        println("param " + f)
    }

    def greet(name: String) : String = {
        val v = "Hello " + name
        v
    }

    def morningGreet(f: => String) = {
        val v = f + " Good Morning"
        println(v)
    }
}
