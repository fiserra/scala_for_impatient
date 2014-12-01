def swap(tuple: (Int,Int)) = tuple  match {
  case (left, right) => (right, left)
}

swap((1,2))