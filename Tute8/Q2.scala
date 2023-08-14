  object Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter the Number:")
    val userInput = scala.io.StdIn.readInt()
    println(numberCheak(userInput));
  }
  val numberCheak : Int => String = x => {
    if (x <= 0) {
      if (x < 0) {
        "Negetive";
      } else {
        "Zero"
      }

    } else {
      if ((x % 2 == 0)) {
        "Even"
      } else {
        "Odd"
      }
    }
  }
}

