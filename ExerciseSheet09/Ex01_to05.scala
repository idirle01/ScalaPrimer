package exercisesheet09

object Ex1_to4 {
 
  def main (args:Array[String]):Unit = {
    
    val vec = Vector (1,2,3,4)
    vec.foreach(n=>println(">"+ n))
    var str = ""
    vec.foreach(n=>str+=n)
    assert(str == "1234")
    str = ""
    vec.foreach(n=>str+=n+",")
    assert(str=="1,2,3,4,")
    
    val dogYears = (n:Int) => (n*7)
    assert(dogYears(10) == 70)
    assert(dogYears(5) == 35)
    
    
    var s = ""
    val v = Vector (1,5,7,8)
    v.foreach(n=>s+=dogYears(n)+" ")
    assert(s =="7 35 49 56 ")
    
    var y = ""
    val w = Vector (1,5,7,8)
    w.foreach(n=>y+=n*7+" ")
    assert(y =="7 35 49 56 ")
    
  }
}