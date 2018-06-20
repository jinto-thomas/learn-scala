object MaxObj {
    def main(args : Array[String]) {
        
        println(my_max(1,2))
        println(my_max(10,2))


    }

    def my_max(x : Int, y : Int) : Int = {
        if (x > y) x else y
    }
}
