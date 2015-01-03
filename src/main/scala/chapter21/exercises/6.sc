/**
 * Compare objects of the class java.awt.Point by lexicographic comparison.
 */

import java.awt.Point

class RichPoint(point: Point) extends Ordered[Point] {
  override def compare(that: Point): Int = {
    if (point.x != that.x)
      point.x compare that.x
    else  point.y compare that.y
  }
}

implicit def pointToRichPoint(point: Point): RichPoint = new RichPoint(point)

new Point(1, 2) > new Point(2, 2)

new Point(2, 3) > new Point(2, 2)