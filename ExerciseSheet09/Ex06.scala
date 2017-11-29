package exercisesheet09

object Ex06 {

  def between(temperature: Int, low: Int, high: Int) =
    if (temperature > low && temperature < high) true else false

  def main(args: Array[String]): Unit = {
    assert(between(70, 80, 90) == false)
    assert(between(70, 60, 90))
  }
}