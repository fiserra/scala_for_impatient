val pattern = "([0-9]+) ([a-z]+)".r

pattern.unapplySeq("123 cucu")

"1001 nights" match {
  case pattern(nr, nights) => "match found"
  case _ => "no match"
}

val (q, r) = BigInt(10) /% 3
val arr = Array(1, 2, 3, 4, 5, 6)
val Array(first, second, _*) = arr

import scala.collection.JavaConversions.propertiesAsScalaMap

for ((k, v) <- System.getProperties) {
  println(s"$k -> $v")
}

for ((k, "") <- System.getProperties) {
  println(s"$k")
}


case class Currency(value: Double, unit: String)

val currency = Currency(12.12, "MDL")

currency match {
  case a Currency u => s"$a, $u"
  case _ => ""
}

abstract class Item

case class Article(description: String, price: Double) extends Item

case class Bundle(description: String, discount: Double, items: Item*) extends Item

val bundle = Bundle("Father's day special", 20.0,
  Article("Scala for the Impatient", 39.95),
  Bundle("Anchor Distillery Sampler", 10.0,
    Article("Old Potrero Straight Rye Whiskey", 79.95),
    Article("Junípero Gin", 32.95)))

bundle match {
  case Bundle(_, _, Article(descr, _), _*) => descr
  case _ => "nothing found"
}

def price(it: Item): Double = it match {
  case Bundle(_, disc, Article(_, _), rest@_*) => rest.map(price).sum - disc
  case Article(_, p) => p
}


price(bundle)
