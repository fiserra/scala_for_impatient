case class Fraction(n: Int, d: Int)

def smaller[T](a: T, b: T)(implicit order: T => Ordered[T]) =
  if (order(a) < b) a else b

class RichFraction(fraction: Fraction) extends Ordered[Fraction] {
  override def compare(that: Fraction): Int = {
    val x = fraction.n * that.d
    val y = fraction.d * that.n
    if (x > y) 1
    else if (x == y) 0
    else -1
  }
}

implicit def fractionToRichFraction(fraction: Fraction): RichFraction =
  new RichFraction(fraction)

1/7.0

2/9.0

smaller(Fraction(1, 7), Fraction(2, 9))