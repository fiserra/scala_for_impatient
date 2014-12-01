def nonNoneSum(list: List[Option[Int]]) : Int = {
  (for { el <- list} yield  el.getOrElse(0)).sum
}

nonNoneSum(List(Some(1), None, None, Some(3), Some(2)))