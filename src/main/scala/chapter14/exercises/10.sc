import scala.math._

def f(x: Double) = if (x >= 0) Some(sqrt(x)) else None
def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

def compose(func1: Double => Option[Double], func2: Double => Option[Double]): Double => Option[Double] = {
  d: Double => func2(d) match {
    case None => None
    case Some(r) => func1(r)
  }
}

val h = compose(f, g)
h(2)
h(1)
h(0)