package exercisesheet09

object Ex15 {

  //Ex15 method
  def sumIt(args: Int*) = args.reduce((x, y) => x + y)

  //Ex16 method
  def yielding(v: List[Int]): List[Int] = {
    for {
      n <- v
      if n < 10
      isOdd = (n % 2 != 0)
      if (isOdd)
    } yield n
  }

  def main(args: Array[String]): Unit = {

    val list = 3 :: 3 :: 4 :: 9 :: Nil
    val x = sumIt(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
    println(x)
    assert(sumIt(1, 2, 3) == 6)
    assert(sumIt(45, 45, 45, 60) == 195)
    val theList = List(1, 2, 3, 5, 6, 7, 8, 10, 13, 14, 17)
    assert(yielding(theList) == List(1, 3, 5, 7))

  }
}