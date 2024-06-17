object BookCalculator {
    def bookPrice(x:Int):Double=x*24.95
    def discount(amount:Double):Double=amount*.4
    def shippingCost(x:Int):Double=3*x+(x-50)*.75

    def main(args: Array[String]): Unit = {
    println(bookPrice(60)-discount(bookPrice(60))+shippingCost(60))
  }
}
