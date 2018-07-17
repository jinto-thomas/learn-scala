object Contains {

  def main(args : Array[String]) {
    println(containOdd(List(2,4,6,8,3)))
  }

  def containOdd(nums : List[Int]) = nums.exists(_ % 2 == 1)
}
