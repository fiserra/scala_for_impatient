package chapter21
/*
Compile this with `scalac -Xprint:typer FindImplicitConversion` in order
to find out which implicit conversion is used.
*/
object FindImplicitConversion extends App {
  "abc".map(_.toUpper)

  "abc".map(_.toInt)
}
