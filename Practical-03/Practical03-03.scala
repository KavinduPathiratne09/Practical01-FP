object ArithmeticMean {
  def sum(a: Int, b: Int): Int = {
    if (b == 0) a
    else if (b > 0) sum(a + 1, b - 1)
    else sum(a - 1, b + 1)
  }

  def mean(a: Int, b: Int): Double = {
    val total = sum(a, b)
    val avg = total / 2.0
    BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    val num1 = 7
    val num2 = 5
    val result = mean(num1, num2)
    println(s"Arithmetic mean of $num1 and $num2 is $result")
  }
}
