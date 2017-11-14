object NumberPersonalities {

  val limit: Int = 100

  def main (args: Array [String]) {}

  def isPrime(n: Int): Boolean = {
    for (i<- 2 to n-1) {
      if (n%i!=0) false
    }
    true
  }

  //def isHappy(n: Int): Boolean


  //isTriangular(n: Int): Boolean

  //isSquare(n: Int): Boolean

  //isSmug(n: Int): Boolean

  //isHonest(n: Int): Boolean

  //isPronic(n: Int): Boolean

  //isDeficient(n: Int): Boolean

  //isPerfect(n: Int): Boolean

  //isAbundant(n: Int): Boolean

  //sumOfPositiveDivisorsOf(n: Int): Int

  isPrime(8);
}
