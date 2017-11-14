object NumberPersonalities {

  val limit: Int = 100

  def main (args: Array [String]) {}

    def isPrime(n: Int): Boolean = {
      var divisorCount: Int = 0
      for (i<-1 to n) {
        if (n % i == 0)
          divisorCount += divisorCount
          println (divisorCount.toString)

      }
      (divisorCount == 2)
    }
   // isPrime(8)
    //isPrime(11)
    //isPrime (7)

    def isPrime2(n:Int) : Boolean = (2 until n) forall (x => n % x != 0)

    isPrime2(8)
    isPrime2(7)
    isPrime2(51)
    isPrime2(5)


   def squared (x:Int) = {x*x}

   def presentInSequence (x:Int): Boolean = {
    val repeatingSequence = Array (4,16,37,58,89,145,42,20)
    repeatingSequence.contains(x)
  }

   def sumOfDigits (x:Int):Int = {
    var copy:Int = x
    var sum, iterations: Int = 0
    val numberLength = x.toString.length
    while (iterations < numberLength) {
      sum+=squared(copy%10)
      copy/=10
      iterations+=1
    }
    sum
  }

   def isHappy(n: Int): Boolean = {
     if (presentInSequence(n)) false
     else if (n != 1) {
       isHappy(sumOfDigits(n))
     } else true
   }
     sumOfDigits(1024)
     sumOfDigits(1111)
     sumOfDigits(222)
     sumOfDigits(7)
     sumOfDigits(19)

     isHappy(1)
     isHappy(10000)
     isHappy(19)
     isHappy(22)
     isHappy(89)
     isHappy(58)


    var triangleHelper = 0
    def isTriangular(n: Int): Boolean = {
      isTriangularHelp(n, 1)
    }

      def isTriangularHelp (x: Int,y:Int) : Boolean = {
        if (x<0) false
        else if (x - y ==0) true
        else isTriangularHelp(x-y, y+1)
    }

  println("****")
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

  //isPronic(n: Int): Boolean

  //isDeficient(n: Int): Boolean

  //isPerfect(n: Int): Boolean

  //isAbundant(n: Int): Boolean

  //sumOfPositiveDivisorsOf(n: Int): Int

