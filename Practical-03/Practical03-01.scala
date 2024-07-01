object ReverseString{
    def reverse(s:String): String ={
        if (s.isEmpty) ""
        else reverse(s.tail) + s.head
    }

    def main (args:Array[String]): Unit ={
        println("Enter a word")
        val name = scala.io.StdIn.readLine()
        val reversed = reverse(name)
        println(s"Original : $name, Reversed : $reversed")
    }
}