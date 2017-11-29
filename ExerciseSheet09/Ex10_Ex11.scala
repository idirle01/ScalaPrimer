package exercisesheet09

object Ex10 {

  def main(args: Array[String]): Unit = {

    // Ex10 starts here
    val v = Vector(1, 2, 3, 4)
    assert(v.map(n => n + 1) == Vector(2, 3, 4, 5))
    assert(v.map(n => n * 11 + 10) == Vector(21, 32, 43, 54))

    //Ex11 starts here
    // foreach can replace map
    // same result as for Ex10

    val w = Vector(1, 2, 3, 4)
    w.foreach(n => n * 11 + 10)
    assert(w == Vector(21, 32,  43, 54))

  }
}