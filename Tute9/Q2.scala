object Q2
 {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val result = x.sub(y).sub(z)

    println(s"x = $x")
    println(s"y = $y")
    println(s"z = $z")
    println(s"x - y - z = $result")
  }
}
