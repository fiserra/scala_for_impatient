def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
  inputs.map(fun).max
}

def largest2(fun: (Int) => Int, inputs: Seq[Int]): Int = {
  inputs.foldLeft(0)((acc, el) => if (fun(el) > acc) fun(el) else acc)
}

largest(x => 10 * x - x * x, 1 to 10)

largest2(x => 10 * x - x * x, 1 to 10)