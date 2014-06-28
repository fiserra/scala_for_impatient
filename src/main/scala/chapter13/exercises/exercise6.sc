val lst = List(1, 0, -1, 2)

(lst :\ List[Int]())(_ :: _)

(List[Int]() /: lst)(_ :+ _)

(lst :\ List[Int]())(_ +: _)

(lst :\ List[Int]())((el, list) => list :+ el)

(List[Int]() /: lst)((list, el) => el :: list)