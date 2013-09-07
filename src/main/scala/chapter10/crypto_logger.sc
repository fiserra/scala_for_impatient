trait Logged {
  def log(msg: String) {}
}

trait ConsoleLogger extends Logged {
  override def log(msg: String) {
    println(msg)
  }
}

abstract class Account(initialBalance: Double) {
  protected var balance = initialBalance

  def withdraw(amount: Double)
}

class SavingsAccount(initialBalance: Double) extends Account(initialBalance) with Logged {

  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }
}

trait CryptoLogger extends Logged {
  val key = 3

  abstract override def log(msg: String) {
    val cipher = msg.map(ch => caesar(ch, key))
    super.log(cipher)
  }

  private def caesar(c: Char, key: Int): Char = c match {
    case ch if ch.isLower => {
      val shift = (ch - 'a' + key) % 26
      if (shift > 0) ('a' + shift).toChar else ('z' + shift).toChar
    }
    case ch if ch.isUpper => {
      val shift = (ch - 'A' + key) % 26
      if (shift > 0) ('A' + shift).toChar else ('Z' + shift).toChar
    }
    case _ => c
  }
}


val account = new SavingsAccount(20) with ConsoleLogger with CryptoLogger
account.withdraw(30)

val account2 = new {
  override val key = -3
} with SavingsAccount(20) with ConsoleLogger with CryptoLogger




account2.withdraw(30)
