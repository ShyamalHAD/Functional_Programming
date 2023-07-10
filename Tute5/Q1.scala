object Q1 {

  def main(args: Array[String]): Unit = {
    print(Prime(8))
  }

  def Prime(num: Int, x: Int = 2): Boolean = x match {
    case x if (x == num)   => true
    case x if num % x == 0 => false
    case _=> Prime(num, x + 1)
  }
}
