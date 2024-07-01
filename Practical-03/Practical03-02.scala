object FilterLongStrings {
  def filterLongStrings(strings: List[String]): List[String] = {
    strings match {
      case Nil => Nil  
      case head :: tail =>
        if (head.length > 5) head :: filterLongStrings(tail) 
        else filterLongStrings(tail) 
    }
  }

  def main(args: Array[String]): Unit = {
    val input = List("hello", "world", "Scala", "programming", "fun")
    val result = filterLongStrings(input)
    println(s"Filtered list: $result")
  }
}
