package ex01
import scala.collection.mutable.ArrayBuffer

object Ex04 {
  
  
  def separatePositives (input: Array[Int]): Array[Int]  = {
    val first = ArrayBuffer [Int]()
    val second = ArrayBuffer [Int]()
    var result = Array [Int]()
    for (i<- 0 until input.size) {
      if (input(i) > 0) first+= input(i) else second+= input (i)
      val firstArr = first.toArray
      val secondArr = second.toArray
      result = firstArr ++ secondArr
    }
    result
  }     
  val x = Array (-1, 3, 0, -5, 8, 2)
  assert (separatePositives(Array (-1, 3, 0, -5, 8, 2)) == Array (3,8,2,-1,0,-5))
 
}