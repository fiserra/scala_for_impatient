val strings = Array("ala", "bala", "portocala")
val lengths = Array(3, 4, 9)
val random = Array(3, 1, 0)

val cFun = (str: String, len: Int) => str.length == len

strings.corresponds(lengths)(cFun)
strings.corresponds(random)(cFun)