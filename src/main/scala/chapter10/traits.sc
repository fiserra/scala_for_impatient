import java.io.PrintStream

trait Logger {
  def log(msg: String)
}

trait FileLogger extends Logger {
  val filename: String
  val out = new PrintStream(filename)

  def log(msg: String) {
    out.println(msg)
    out.flush()
  }
}

class SavingAccount {

}

val acct = new {
  val filename = "myapp.log"
} with SavingAccount with FileLogger

acct.log("Hello")

trait Logged {
  def log(msg: String)  {
     println(msg)
  }
}

trait LoggedException extends Exception with Logged {
  def log() {
     log(getMessage)
  }
}

class UnhappyException extends LoggedException {
  override def getMessage() = "cucu!"
}

