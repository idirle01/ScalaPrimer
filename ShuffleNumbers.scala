

object ShuffleNumbers extends App {
  
  import scala.util.Random


  val A = List ("c","d","dis","h","ht","per","p","pr","sm","s","t","u")

  for (i<-1 to 100)  {
	print (i + ":")
	println (Random.shuffle(A).take(9) mkString ",")

}
  
}