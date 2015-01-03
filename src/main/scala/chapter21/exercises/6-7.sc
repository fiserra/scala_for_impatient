import java.awt.Point
import java.lang.Math.{sqrt, pow}

class LexPoint(point: Point) extends Ordered[Point] {
  override def compare(that: Point): Int = {
    if (point.x != that.x)
      point.x compare that.x
    else  point.y compare that.y
  }
}

implicit def pointToRichPoint(point: Point): LexPoint = new LexPoint(point)

implicit def pointToDouble(point: Point): Double = sqrt(pow(point.x, 2) + pow(point.y, 2))

new Point(1, 2) > new Point(2, 2)

new Point(2, 3) > new Point(2, 2)