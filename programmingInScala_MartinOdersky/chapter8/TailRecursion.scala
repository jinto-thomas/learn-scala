object TailRecursion {
    def main(args: Array[String]) {
        bang(100)
    }

    def bang(x : Int) : Int = 
        if (x == 0) throw new Exception("bang")
        else bang(x-1)
}
