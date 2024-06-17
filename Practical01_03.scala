object Volume {
  def sphere(r: Double) : Double = 4.0/3.0 * math.Pi * r * r * r
    
  def main(args: Array[String]): Unit = {
    println(sphere(5))
  }
}
