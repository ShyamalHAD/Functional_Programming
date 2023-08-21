class Account3(var balance: Double) {
  require(balance >= 0, "Initial balance must be non-negative")

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    require(balance >= amount, "Insufficient balance")
    balance -= amount
  }

  def transfer(toAccount: Account3, amount: Double): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    require(balance >= amount, "Insufficient balance for transfer")

    this.withdraw(amount)
    toAccount.deposit(amount)
  }
}

object Q3 {
  def main(args: Array[String]): Unit = {
    val account1 = new Account3(1000.0)
    val account2 = new Account3(500.0)

    println(s"Initial balances: Account1 = ${account1.balance}, Account2 = ${account2.balance}")

    account1.deposit(300.0)
    account2.withdraw(200.0)
    account1.transfer(account2, 150.0)

    println(s"Final balances: Account1 = ${account1.balance}, Account2 = ${account2.balance}")
  }
}
