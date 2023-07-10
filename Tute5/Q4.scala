object Q4 {

  def main (args:Array[String]):Unit={
    println(evenOdd(5))

  }

  def evenOdd(n:Int):String= n match {
    case x if x==0 => "Even number"
    case x if x==1 => "Odd number"
    case _ => evenOdd(n-2)
  }
}