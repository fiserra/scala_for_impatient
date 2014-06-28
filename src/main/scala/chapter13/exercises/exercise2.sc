
def indexes(str: String): Map[Char, List[Int]] = {
  str.zipWithIndex.foldLeft(Map[Char, List[Int]]()) {
    case (m, (char, index)) => m + (char -> (m.getOrElse(char, List()) :+ index))
  }
}

indexes("Mississippi")

