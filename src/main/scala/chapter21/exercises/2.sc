class Percentage(number: Double) {
  def +%(percent: Double): Double = {
    number + number * percent / 100
  }
}

object Percentage {
  def apply(number: Double) = new Percentage(number)
}

implicit def double2Percentage(d: Double): Percentage = Percentage(d)

120 +% 10