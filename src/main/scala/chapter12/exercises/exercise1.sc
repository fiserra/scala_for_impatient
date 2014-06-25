def values(fun: (Int) => Int, low: Int, high: Int): Seq[(Int, Int)] = {
  (low to high).map(x => (x, fun(x)))
}

values(x => x * x, -5, 5)