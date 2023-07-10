object Q3 {

  def main(args:Array[String]): Unit = {
    print(sum(5))
  }

  def sum(i:Int): Int={
    if (i==0){
      return i
    }
    else {
      return ( i + sum(i-1) )

    }
  }
}