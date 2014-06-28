def mapper(arr: Array[String], map: Map[String, Int]): Array[Int] = {
  arr.flatMap {
    name => map.get(name)
  }
}

mapper(Array("Tom", "Fred", "Harry"), Map("Tom" -> 1, "Dick" -> 2, "Harry" -> 3))