val arr = Array(1, 2, 3, 4, 5, 6)

def printArr = (arr: Array[Int]) => println(arr.mkString(", "))

def to2D(arr: Array[Int], cols: Int): Array[Array[Int]] = {
  val size = arr.size / cols
  val ma: Array[Array[Int]] = new Array[Array[Int]](size)
  val it: Iterator[Array[Int]] = arr.grouped(cols)

  var index = 0
  while (it.hasNext && index < size) {
    ma(index) = it.next()
    index = index + 1
  }
  ma
}

to2D(arr, 3).foreach(printArr)

to2D(arr, 4).foreach(printArr)