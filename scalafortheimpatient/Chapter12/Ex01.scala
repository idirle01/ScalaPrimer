package scalafortheimpatientch12
import scala.util._

object Ex01 extends App {

  // Ex01 - naive solution
  def cc(a: Seq[Int]) = {
    for (elem <- a) yield (elem, elem * elem)
  }

  //Ex01 improved solution
  def values(fun: (Int) => Int, low: Int, high: Int): Seq[(Int, Int)] = {
    for (i <- low to high) yield (i, fun(i))
  }

  //Ex01 improved solution
  def values2(fun: (Int) => Int, low: Int, high: Int) = (low to high) map { x => (x, fun(x)) }

  //Ex02 solution
  def maxArr(a: Array[Int]): Int = {
    a.reduceLeft((x, y) => if (x > y) x else y)
  }

  //Ex03 solution
  // factorial function using to and reduceLeft, without a loop or recursion.
  def factorial(n: Int): Int = if (n <= 0) 1 else (1 to n).reduceLeft(_ * _)

  //Ex04 solution
  def factorial2(n: Int) = (1 to n).foldLeft(1)(_ * _)

  //EX05 solution
  // largest(fun: (Int) => Int, inputs: Seq[Int])

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
   inputs.map(fun(_)).reduceLeft((a, b) => if (a > b) a else b)
  }

  var n = largest(x => x* x, 1 to 10)
  println (n)


}