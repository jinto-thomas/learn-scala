import java.io.File
import java.io.PrintWriter
object Curry{

  def main(args: Array[String]) {
  
    val file = new File("date.txt")

    //for single param, you can use curly braces!!

    withPrintWriter(file) {
        writerr => writerr.println(new java.util.Date)
    }
  }

  def withPrintWriter(file: File)(op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
      try {
        op(writer)
      } finally {
        writer.close()
      }
  }
}
