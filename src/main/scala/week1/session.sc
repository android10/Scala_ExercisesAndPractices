import scala.annotation.tailrec

object session {
  def abs(x: Double) = if (x < 0) -x else x

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))
    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001
    def improve(guess: Double) =
      (guess + x / guess) / 2
    sqrtIter(1.0)
  }

  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  def factorial(a: Int): Int =
    if (a == 0) 1 else a * factorial(a - 1)

  sqrt(2)
  sqrt(4)
  sqrt(1e-6)
  sqrt(1e60)

  gcd(10, 3)
  gcd(4, 2)

  factorial(22)

  def factorialTailRecursion(n: Int): Int = {
    @tailrec
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)
    loop(1, n)
  }

  factorialTailRecursion(22)
}