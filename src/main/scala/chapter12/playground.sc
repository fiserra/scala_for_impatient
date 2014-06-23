import scala.math._

val num = 3.14

val fun = ceil _

fun(num)

List(1.2, 3.4, 5.5).map(fun)

def valueAtOneQuarter(f: Double => Double) = f(0.25)

valueAtOneQuarter(ceil)

valueAtOneQuarter(sqrt)


def mulBy(factor: Double) = (x: Double) => x * factor

val oneQuarter = mulBy(0.25)
oneQuarter(4)