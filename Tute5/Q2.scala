object Q2 {

  def main(args:Array[String]):Unit={
    primeSeq(10)
  }

  def prime(num: Int, x: Int = 2): Boolean = x match {
    case x if (x == num) => true
    case x if num % x == 0 => false
    case _ => prime(num, x + 1)
  }

  def primeSeq(n:Int):Unit={
    for ( i <- 0 until  n){
      if (prime(i)){
        println(i)
      }
    }
  }

}