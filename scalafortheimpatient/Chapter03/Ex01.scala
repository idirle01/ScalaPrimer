package ex01
import scala.util.Random

object Ex01 {
  
  def randomArray (n:Int) : Array[Int] = {
    val a: Array[Int] = new Array [Int] (n)
    for (i<-0 until a.length)  a(i) = scala.util.Random.nextInt(n)
    a
  }
  
  def randomArray (n:Int, limit: Int) = {
    val a = new Array [Int] (n)
    for (i<-0 until a.length)  a(i) = scala.util.Random.nextInt(limit)
    a
  }
  
}