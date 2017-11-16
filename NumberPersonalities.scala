object NumberPersonalities {

  val limit: Int = 100

  def main(args: Array[String]) {}

  def isPrime(n: Int): Boolean = (2 until n) forall (x => n % x != 0)

  def squared(x: Int) = {
    x * x
  }

  def presentInSequence(x: Int): Boolean = {
    val repeatingSequence = Array(4, 16, 37, 58, 89, 145, 42, 20)
    repeatingSequence.contains(x)
  }


  def getIntList(x: Int): List[Int] = {
    x.toString.map(_.asDigit).toList
  }

  def squaredSumOfDigits(list: List[Int]) = {
    list.map(x => x * x).sum
  }


  def sumOfDigitsHelper(i: Int) = {
    squaredSumOfDigits(getIntList(i))
  }


  def isHappy(n: Int): Boolean = {
    if (presentInSequence(n)) false
    else if (n != 1) {
      isHappy(sumOfDigitsHelper(n))
    } else true
  }
  
  def isTriangular(n: Int): Boolean = {
    isTriangularHelp(n, 1)
  }

  def isTriangularHelp(x: Int, y: Int): Boolean = {
    if (x < 0) false
    else if (x - y == 0) true
    else isTriangularHelp(x - y, y + 1)
  }

  println("****")
  
  isPrime(8)
  isPrime(7)
  isPrime(51)
  isPrime(5)
  
  sumOfDigitsHelper(1024)
  sumOfDigitsHelper(1111)
  sumOfDigitsHelper(222)
  sumOfDigitsHelper(7)
  sumOfDigitsHelper(19)

  isHappy(1)
  isHappy(10000)
  isHappy(19)
  isHappy(22)
  isHappy(89)
  isHappy(58)
  isHappy(145)

  isTriangular(3)
  isTriangular(15)
  isTriangular(10)
  isTriangular(11)
  isTriangular(1)
  isTriangular(6)
  isTriangular(7)

  //isSquare(n: Int): Boolean

  //isSmug(n: Int): Boolean

  //isHonest(n: Int): Boolean

  //isPronic

  //isDeficient(n: Int): Boolean

  //isPerfect(n: Int): Boolean

  //isAbundant(n: Int): Boolean

  //sumOfPositiveDivisorsOf(n: Int): Int
}
