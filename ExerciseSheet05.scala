

object ExerciseSheet05 extends App {
  
  // need to come back here to clarify the API and why
  // methods are defined as value members
  println ("Ex1: "+"_"*30)
  val range0 = 0 to 10 
  range0.foreach(println)
  println ("Unless specified, the step in a range is: "+ range0.step)
  println ("*"*20)
  val range1 = new Range (0, 10, 2)
  println("Step is now: "+ range1.step)
  val range2 = 0 to 10 by 2
  println("Step is now: "+ range2.step)
  
  println ("Ex2: "+"_"*30)
  val message: String = "This is an experiment"
  val result = message.split(" ")
  result.foreach(println)
  
  println ("Ex3: "+"_"*30)
  var s1 = "Sally"
  var s2 = "Sally"
  if (s1.equals(s2)) println ("s1 and s2 are equal") else println ("s1 and s2 are not equal")
  s2 = "Sam"
  if (s1.equals(s2)) println ("s1 and s2 are equal") else println ("s1 and s2 are not equal")
   var s3 = s1.toUpperCase
  if (s1.contentEquals(s3)) println ("s1 and s3 are equal") else println ("s1 and s3 are not equal")
}