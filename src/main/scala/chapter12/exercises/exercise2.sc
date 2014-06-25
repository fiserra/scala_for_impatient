val max = (acc: Int, el: Int) => if (el > acc) el else acc
(1 to 10).reduceLeft(max)