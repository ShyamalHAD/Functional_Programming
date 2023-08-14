object Q1 {
  def main(args: Array[String]): Unit = {
    println("Enter the deposit:")
    val deposit = scala.io.StdIn.readInt()
    println(interest(deposit))
  }
  val interest: Int => Double = deposit => {
    if (deposit > 0) {
      if (deposit < 20000) {
        deposit * 0.02
      } else if (deposit < 200000) {
        deposit * 0.04
      } else if (deposit < 2000000) {
        deposit * 0.035
      } else {
        deposit * 0.065
      }
    } else {
      0.0
    }
  }

}
