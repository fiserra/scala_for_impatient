import scala.annotation.tailrec

/**
Define a ! operator that computes the factorial of an integer. For example, 5! is 120.
You will need an enrichment class and an implicit conversion. */

class FactorialInt(i: Int) {
  def ! = {

    @tailrec
    def factorial(n: Int, acc: Int): Int = n match {
      case 0 | 1 => acc
      case x => factorial(x - 1, acc * x)
    }
    factorial(i, 1)
  }

}

implicit def intToFactorialInt(i: Int): FactorialInt = new FactorialInt(i)

0 !

10 !

5 !