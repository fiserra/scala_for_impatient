import scala.reflect.ClassTag

def swap[T: ClassTag](arr: Array[T]): Array[T] = arr match {
  case Array(first, second, rest@_*) => Array(second, first) ++ rest
  case _ => arr
}

swap(Array("a", "b", "c"))