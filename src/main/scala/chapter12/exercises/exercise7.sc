val pairs = (1 to 10) zip (11 to 20)

def adjustToPair(fun: (Int, Int) => Int)(pair: (Int, Int)): Int = {
  fun(pair._1, pair._2)
}

adjustToPair(_ * _)((6, 7))

pairs map (pair => adjustToPair(_ * _)(pair))