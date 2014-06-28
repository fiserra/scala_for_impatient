def mkString(seq: Seq[Any], sep: String): String = {
  seq.foldLeft("") {
    (prevEl, currEl) =>
      if (!prevEl.isEmpty)
        prevEl + (if (sep == null) "" else sep) + currEl
      else currEl.toString
  }
}
mkString(Seq(1, 2, 2, 3), null)
mkString(Seq(1, 2, 2, 3), ",")


def myMkString(coll: Iterable[Any], sep: String) = coll.reduceLeft(_ + sep + _)
myMkString(Seq(1, 2, 2, 3), ",")


Seq(1, 2, 2, 3).reduceLeft((x: Any, y: Int) => x + "-" + y)
