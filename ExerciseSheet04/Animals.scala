

object Animals extends App {
  
  val hippo = new Hippo(25.8,"dark brown")
  val femaleLion = new Lion (86.3, 'f', 13,"LION002")
  val maleLion = new Lion (90.5,'m',10)
  val monkey = new Monkey (11)
  val youngGiraffe = new Giraffe (23.2)
  val zebra = new Zebra("I have stripes!")
  val animals = hippo::femaleLion::maleLion::monkey::youngGiraffe::Nil
  animals.foreach(println)
  
   
}

class Hippo (val weight: Double, val colour : String, val id: String = "HIP000") { 
  override def toString = "Animal id: "+ id + " Weight: " + weight+ " Colour: "+ colour
}

class Lion (val weight: Double, var sex: Char = 'm', val age: Int, val id: String = "LION000") {
  override def toString =  "Animal id: "+ id + " Weight: " + weight+ " Sex: "+
  (if (sex == 'm') "male" else "female")
}

class Monkey (val age:Int, val id: String = "MONK000") {
  override def toString = "Animal id: "+ id + " Age: "+ age
}

class Giraffe (val neckLength: Double, var sex: Char = 'f', val id: String = "MONK000") {
  override def toString = "Animal id: "+ id + " Neck length: "+ neckLength + (if (sex == 'm') " male" else " female")
}

class Zebra (val message:String) {
  println (message)
}


 