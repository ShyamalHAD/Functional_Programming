object Q6 {

  def main(args:Array[String]):Unit={
   fibonacciSeq(10)
  }

  def fibonacci(i: Int): Int = i match {
    case x if x==0 => 0
    case x if x == 1 => 1
    case _ => fibonacci(i - 1) + fibonacci(i - 2)
  }

  def fibonacciSeq(i: Int): Unit = {
    if (i > 0) fibonacciSeq(i - 1)
    println(fibonacci(i))
  }

}