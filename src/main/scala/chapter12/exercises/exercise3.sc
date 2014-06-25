def factorial(n: Int) = {
  if (n > 1) (1 to n).reduceLeft(_ * _) else 1
}
factorial(4)
factorial(0)
factorial(-1)