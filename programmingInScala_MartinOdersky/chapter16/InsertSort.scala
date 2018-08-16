object InsertSort {
    def main(args : Array[String]) {
        val li = List(3,5,23,45,7,8)
        println(isort(li))
    }

    def isort(xs : List[Int]) : List[Int] =
        if (xs.isEmpty) Nil
        else insert(xs.head, isort(xs.tail))

    def insert(x : Int, xs : List[Int]) : List[Int] =
        if (xs.isEmpty || x <=  xs.head) x :: xs
        else xs.head :: insert(x, xs.tail)
}
