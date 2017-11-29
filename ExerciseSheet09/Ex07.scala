package exercisesheet09

object Ex07 {

  def main(args: Array[String]): Unit = {

    var s = ""
    val numbers = Vector(1, 2, 5, 3, 7)
    numbers.foreach(i => s+=i*i+ " ")
    assert(s == "1 4 25 9 49 ")
  }
}