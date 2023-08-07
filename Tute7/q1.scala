object q1 {

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputList = filterEvenNumbers(inputList)
    println(outputList) // Output: List(2, 4, 6, 8, 10)
  }
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }

}
