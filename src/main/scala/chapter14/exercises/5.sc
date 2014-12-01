def leafSum(list: List[Any]): Int = list match {
  case Nil => 0
  case head :: tail =>
    val headSum = head match {
      case nr: Int => nr
      case l: List[Any] => leafSum(l)
    }
    headSum + leafSum(tail)
}

leafSum(List(List(3, 6), 2, List(5)))
leafSum(List(-1, 6, 2))
