def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
  inputs.foldLeft(0)((acc, el) => if (fun(el) > fun(acc)) el else acc)
}

largest(x => 10 * x - x * x, 1 to 10)

