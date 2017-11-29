package exercisesheet09

object Ex17 {

  def yielding_prev(v: List[Int]) = {
    val result = v.filter(x => (x < 10 && x % 2 != 0))
    result
  }

  def yielding(v: Vector[Int]): Vector[Int] = {
    for {
      n <- v
      if n < 10
      isOdd = (n % 2 != 0)
      if (isOdd)
    } yield {
      val u = n * 10
      u + 2
    }
  }

  def yieldingAgain(v: Vector[Int]) = 
    v.filter(x => (x < 10 &&
    x % 2 != 0)).map(x => x * 10 + 2)

  def main(args: Array[String]): Unit = {

    val theList = List(1, 2, 3, 5, 6, 7, 8, 10, 13, 14, 17)
    yielding_prev(theList).foreach(println)
    assert(yielding_prev(theList) == List(1, 3, 5, 7))
    val v = Vector(1, 2, 3, 5, 6, 7, 8, 10, 13, 14, 17)
    assert(yielding(v) == Vector(12, 32, 52, 72))
    assert(yieldingAgain(v) == Vector(12, 32, 52, 72))
  }

}