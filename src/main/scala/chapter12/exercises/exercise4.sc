def factorial(n: Int) = {
  (1 to n).foldLeft(1)(_ * _)
}
factorial(4)
factorial(0)
factorial(-1)