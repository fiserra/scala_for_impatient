def removeZeroes(list: List[Int]): List[Int] = list match {
  case Nil => Nil
  case 0 :: tail => removeZeroes(tail)
  case head :: tail => head :: removeZeroes(tail)
}
removeZeroes(List(0, 12, 1, 0, 0, 1, 2, 0))
removeZeroes(List(0, 0, 0, 0))


