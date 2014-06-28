val prices = List(5.0, 20.0, 9.95)
val quantities = List(10, 2, 1)

(prices zip quantities) map { p => p._1 * p._2}

(prices zip quantities) map {((price: Double, quantity: Int) => price * quantity).tupled}