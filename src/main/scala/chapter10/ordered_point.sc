import java.awt.Point

class OrderedPoint( x: Int, y: Int) extends Point(x, y) with Ordered[Point] {
  def compare(that: Point): Int =
    if (this.x == that.x) this.y - this.y
    else this.x - that.x
}


val point = new OrderedPoint(1, 2)

val point2 = new OrderedPoint(2, 3)

point.compare(point2)

point.getX

