import java.awt.geom.{RectangularShape, Ellipse2D}

trait RectangleLike {
  self: RectangularShape =>
  def translate(dx: Int, dy: Int) {
      setFrame(getX + dx, getY + dy,getX + getWidth, getY + getHeight)
  }

  def grow(h: Int, v: Int) {
    setFrame(getX, getY ,getWidth + h, getHeight + v)
  }
}
val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
egg.translate(10, -10)
egg.grow(10, 20)
egg.getX