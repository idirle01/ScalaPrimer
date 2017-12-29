package ex01
import scala.util.Random

object Ex05 {
  
  def createArray (n: Int)  = {
    val d = new Array [Double] (n)
    for (i<- 0 until d.size) d(i) = scala.util.Random.nextDouble;
    d
  }
  
  def avg (a: Array [Double]) = a.sum / a.size;
  
  
}