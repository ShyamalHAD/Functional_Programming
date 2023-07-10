import util.control.Breaks
import scala.io.StdIn

object Q5 {

  def main(args:Array[String]): Unit = {
    println("Enter the number")
    var num = StdIn.readInt()
    print(sum(num))
  }


  def sum(i:Int):Int={
    if (i==0){
      return i
    }
    else if(i%2==0){
      return i+ sum(i-2)
    }
    else {
      sum(i-1)
    }
  }


}