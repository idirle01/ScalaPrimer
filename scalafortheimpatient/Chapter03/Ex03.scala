package ex01

object Ex03 {
  def swapElements (input: Array[Int])  = {
    val x = for (i<-0 until input.length)  
      yield if (i< input.length - 1) 
          if (i%2 == 0)  input(i+1) else input (i -1)
          else if (i%2 == 0) input(i) else input (i - 1)
    x.mkString(" ")
  }
}