def numsFrom(n: BigInt): Stream[BigInt] = n #:: numsFrom(n + 1)
val tenOrMore = numsFrom(10)
tenOrMore.tail

val squares = numsFrom(1).map { x => x * x}
squares.tail
squares.take(10)
squares.take(10).force

import scala.io.Source

val words = Source.fromFile("/usr/share/dict/words").getLines().toStream
words(11)
words.head

import java.lang.Math._

val powers = (0 until 1000).view.map(pow(10, _))
powers(100)
powers.force

(0 to 1000).map(pow(10, _)).map(1 / _)

(0 to 1000).view.map(pow(10, _)).map(1 / _).force

def parallelPrint(n: Int) = {
  for (i <- (0 until n).par)
    println(i)
}
parallelPrint(100)





