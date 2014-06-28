import scala.collection.mutable

def indexes(str: String): mutable.Map[Char, mutable.LinkedHashSet[Int]] = {
  val indexesMap = mutable.Map[Char, mutable.LinkedHashSet[Int]]()
  for (i <- 0 until str.length) {
    indexesMap.put(str(i) , indexesMap.getOrElse(str(i), mutable.LinkedHashSet()) += i)
  }
  indexesMap
}

indexes("Mississippi")


