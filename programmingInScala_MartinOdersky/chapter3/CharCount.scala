import scala.io.Source

object CharCount {
    def main(args : Array[String]) {
     
       if (args.length > 0 ) {
         val lines = Source.fromFile(args(0)).getLines().toList
         val longestLine = lines.reduceLeft( (a,b) => if(a.length > b.length) a else b)

         val maxWidth = widthOfLengths(longestLine)
         for (line <- lines) {
            val spaces = maxWidth - widthOfLengths(line)
            val padding = " " * spaces
            println(padding + line.length + " | " + line)
         }


       } else {
         Console.err.println("No file provided")
       }



    }

    def widthOfLengths(s: String) = s.length.toString.length
}
