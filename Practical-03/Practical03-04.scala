object SumEvenNumbers {
  def sumEven(nums: List[Int]): Int = {
    nums match {
      case Nil => 0  
      case head :: tail =>
        if (head % 2 == 0) head + sumEven(tail) 
        else sumEven(tail)
    }
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6)
    val result = sumEven(input)
    println(s"Sum of even numbers in $input is $result")
  }
}
