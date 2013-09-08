import java.awt.Point
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import scala.collection.mutable

trait PropertyChangeSupport {

  val listeners = mutable.Map[String, mutable.Set[PropertyChangeListener]]()

  def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener) {
    if (listeners.contains(propertyName)) {
      listeners(propertyName) += listener
    } else {
      listeners += propertyName -> mutable.Set(listener)
    }
  }

  def removePropertyChangeListener(propertyName: String, listener: PropertyChangeListener) {
    if (listeners.contains(propertyName)) {
      listeners(propertyName) -= listener
    }
  }

  def firePropertyChange(propertyName: String, oldValue: Any, newValue: Any) {
    if (oldValue == null || newValue == null || !(oldValue == newValue)) {

      if (listeners.contains(propertyName)) {
        val evt = new PropertyChangeEvent(this, propertyName, oldValue, newValue)
        val listenersSet = listeners(propertyName)
        for (listener <- listenersSet) {
          listener.propertyChange(evt)
        }
      }
    }
  }
}

val point = new Point(10, 20) with PropertyChangeSupport {
  override def setLocation(x: Double, y: Double) {
    firePropertyChange("setLocation", getX, x)
    super.setLocation(x, y)
  }
}

val listener = new PropertyChangeListener {
  def propertyChange(evt: PropertyChangeEvent) {
    println(evt)
  }
}
point.addPropertyChangeListener("setLocation", listener)





point.setLocation(11.0, 21)



